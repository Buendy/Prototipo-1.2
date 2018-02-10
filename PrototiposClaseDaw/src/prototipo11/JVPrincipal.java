package prototipo11;
/** 
 * Proyecto: Juego de la vida.
 * Pruebas iniciales de las clases Usuario y SesionUsuario del modelo1.
 * ImplementaciÃ³n del control de inicio de sesiÃ³n y ejecuciÃ³n de la simulaciÃ³n por defecto. 
 * En esta versiÃ³n no se han aplicado la mayorÃ­a de los estÃ¡ndares 
 * de diseÃ±o OO dirigidos a conseguir un "cÃ³digo limpio".
 * Se pueden detectar varios defectos y antipatrones de diseÃ±o:
 *   	- Clase demasiado grande. 
 * @since: prototipo1.0
 * @source: JVPrincipal.java 
 * @version: 1.1 - 2017/11/29
 * @author: DBV
 */

import java.util.Date;
import java.util.Scanner;

public class JVPrincipal {

	// Apartado 6:
	static final int MAX_USUARIOS = 10;
	static final int MAX_SESIONES = 10;
	static final int MAX_INTENTOS_FALLIDOS = 3;
	static Usuario[] datosUsuarios = new Usuario[MAX_USUARIOS];
	static SesionUsuario[] datosSesiones = new SesionUsuario[MAX_SESIONES];
	static int sesionesRegistradas = 0;				// Control de sesiones registradas.
	static Usuario usrEnSesion;

	// Apartado 8:
	static final int TAMAÑO_MUNDO = 12;
	static final int CICLOS_SIMULACION = 35;
	static byte[][] espacioMundo;
	// Apartado 8+:
	enum FormaEspacio { PLANO1, PLANO2, ESFERICO }
	static final FormaEspacio TIPO_MUNDO = FormaEspacio.ESFERICO;

	/**
	 * Secuencia principal del programa.
	 */
	public static void main(String[] args) {	
		// Apartados 4 y 5: Pruebas previas DE PRACTICAS ANTERIORES
		//probarUsuario();
		//probarSesionUsuario();

		// Apartado 7: 
		cargarUsuariosPrueba();		
		mostrarTodosUsuarios();

		// Apartado 8:
		if (inicioSesionCorrecto()) {
			registrarSesion();	
			System.out.println("SesiÃ³n: " + sesionesRegistradas + '\n' + "Iniciada por: " 
					+ 	usrEnSesion.getNombre() + " " + usrEnSesion.getApellidos());	
			cargarMundoDemo();
			arrancarSimulacion();
		}
		else {
			System.out.println("\nDemasiados intentos fallidos...");
		}		
		System.out.println("Fin del programa.");
	}

	/**
	 * Apartado 8:
	 * Ejecuta una simulaciÃ³n del juego de la vida en la consola.
	 */
	static void arrancarSimulacion() {
		cargarMundoDemo();
		int generacion = 0; 
		do {
			System.out.println("\nGeneraciÃ³n: " + generacion);
			mostrarMundo();
			actualizarMundo();
			generacion++;
		}
		while (generacion < CICLOS_SIMULACION);
	}

	/**
	 * Apartado 8+:
	 * Actualiza el estado del Juego de la Vida.
	 * Actualiza segÃºn la configuraciÃ³n establecida para la forma del espacio.
	 */
	private static void actualizarMundo() {
		if (TIPO_MUNDO == FormaEspacio.PLANO1) {
			actualizarMundoPlano1();
		}
		if (TIPO_MUNDO == FormaEspacio.PLANO2) {
			actualizarMundoPlano2();
		}
		if (TIPO_MUNDO == FormaEspacio.ESFERICO) {
			actualizarMundoEsferico();
		}
	}

	/**
	 * Apartado 8:
	 * Despliega en la consola el estado almacenado, corresponde
	 * a una generaciÃ³n del Juego de la vida.
	 */
	static void mostrarMundo() {

		for (int i = 0; i < TAMAÑO_MUNDO; i++) {
			for (int j = 0; j < TAMAÑO_MUNDO; j++) {		
				System.out.print((espacioMundo[i][j] == 1) ? "|o" : "| ");
			}
			System.out.println("|");
		}
	}

	/**
	 * Apartado 8+:
	 * Actualiza el estado almacenado del Juego de la Vida.
	 * Las celdas perifÃ©ricas son adyacentes con las del lado contrario.
	 * El mundo representado serÃ­a esfÃ©rico cerrado sin lÃ­mites para cÃ©lulas de dos dimensiones.
	 */
	static void actualizarMundoEsferico()  {     					
		byte[][] nuevoEstado = new byte[TAMAÑO_MUNDO][TAMAÑO_MUNDO];

		for (int i = 0; i < TAMAÑO_MUNDO; i++) {
			for (int j = 0; j < TAMAÑO_MUNDO; j++) {

				int filaSuperior = i-1;
				int filaInferior = i+1;
				// Reajusta filas adyacentes.
				if (i == 0) {
					filaSuperior = TAMAÑO_MUNDO-1;
				}
				if (i == TAMAÑO_MUNDO-1) {
					filaInferior = 0;
				}

				int colAnterior = j-1;
				int colPosterior = j+1;
				// Reajusta columnas adyacentes.
				if (j == 0) {
					colAnterior = TAMAÑO_MUNDO-1;
				}
				if (j == TAMAÑO_MUNDO-1) {
					colPosterior = 0;
				}

				int vecinas = 0;							
				vecinas += espacioMundo[filaSuperior][colAnterior];		// Celda NO
				vecinas += espacioMundo[filaSuperior][j];					// Celda N		NO | N | NE
				vecinas += espacioMundo[filaSuperior][colPosterior];		// Celda NE   	-----------
				vecinas += espacioMundo[i][colPosterior];					// Celda E		 O | * | E
				vecinas += espacioMundo[filaInferior][colPosterior];		// Celda SE	  	----------- 
				vecinas += espacioMundo[filaInferior][j]; 					// Celda S		SO | S | SE
				vecinas += espacioMundo[filaInferior][colAnterior]; 		// Celda SO 
				vecinas += espacioMundo[i][colAnterior];					// Celda O           			                                     	

				actualizarCelda(nuevoEstado, i, j, vecinas);
			}
		}
		espacioMundo = nuevoEstado;
	}

	/**
	 * Apartado 8+:
	 * Actualiza el estado almacenado del Juego de la Vida.
	 * Las celdas perifÃ©ricas son los lÃ­mites absolutos.
	 * El mundo representado serÃ­a plano cerrado con lÃ­mites para cÃ©lulas de dos dimensiones.
	 */
	static void actualizarMundoPlano2()  {     					
		byte[][] nuevoEstado = new byte[TAMAÑO_MUNDO][TAMAÑO_MUNDO];

		for (int i = 0; i < TAMAÑO_MUNDO; i++) {
			for (int j = 0; j < TAMAÑO_MUNDO; j++) {
				int vecinas = 0;							
				vecinas += celdaNoroeste(i, j);		
				vecinas += celdaNorte(i, j);		// 		NO | N | NE
				vecinas += celdaNoreste(i, j);		//    	-----------
				vecinas += celdaEste(i, j);			// 		 O | * | E
				vecinas += celdaSureste(i, j);		// 	  	----------- 
				vecinas += celdaSur(i, j); 			// 		SO | S | SE
				vecinas += celdaSuroeste(i, j); 	  
				vecinas += celdaOeste(i, j);		          			                                     	

				actualizarCelda(nuevoEstado, i, j, vecinas);
			}
		}
		espacioMundo = nuevoEstado;
	}

	/**
	 * Aplica las leyes del mundo a la celda indicada dada la cantidad de cÃ©lulas adyacentes vivas.
	 * @param nuevoEstado
	 * @param fila
	 * @param col
	 * @param vecinas
	 */
	static void actualizarCelda(byte[][] nuevoEstado, int fila, int col, int vecinas) {
		if (vecinas < 2) {
			nuevoEstado[fila][col] = 0; 				// SubpoblaciÃ³n, muere...
		}
		if (vecinas > 3) {
			nuevoEstado[fila][col] = 0; 				// SobrepoblaciÃ³n, muere...
		}
		if (vecinas == 3) {
			nuevoEstado[fila][col] = 1; 				// Pasa a estar viva o se mantiene.
		}
		if (vecinas == 2 && espacioMundo[fila][col] == 1) {
			nuevoEstado[fila][col] = 1; 				// Se mantiene viva...
		}	
	}

	/**
	 * Apartado 8+:
	 * Obtiene el estado o valor de la celda vecina situada al Oeste de la indicada por la coordenada. 
	 * @param fila de la celda evaluada.
	 * @param col de la celda evaluada.
	 * @return el estado o valor de la celda Oeste.
	 */
	static byte celdaOeste(int fila, int col) {
		if (col-1 >= 0) {
			return espacioMundo[fila][col-1]; 	// Celda O.
		}
		return 0;
	}

	/**
	 * Apartado 8+:
	 * Obtiene el estado o valor de la celda vecina situada al Suroeste de la indicada por la coordenada. 
	 * @param fila de la celda evaluada.
	 * @param col de la celda evaluada.
	 * @return el estado o valor de la celda Suroeste.
	 */
	static byte celdaSuroeste(int fila, int col) {
		if (fila+1 < TAMAÑO_MUNDO && col-1 >= 0) {
			return espacioMundo[fila+1][col-1]; 	// Celda SO.
		}
		return 0;
	}

	/**
	 * Apartado 8+:
	 * Obtiene el estado o valor de la celda vecina situada al Sur de la indicada por la coordenada. 
	 * @param fila de la celda evaluada.
	 * @param col de la celda evaluada.
	 * @return el estado o valor de la celda Sur.
	 */
	static byte celdaSur(int fila, int col) {
		if (fila+1 < TAMAÑO_MUNDO) {
			return espacioMundo[fila+1][col]; 	// Celda S.
		}
		return 0;
	}

	/**
	 * Apartado 8+:
	 * Obtiene el estado o valor de la celda vecina situada al Sureste de la indicada por la coordenada. 
	 * @param fila de la celda evaluada.
	 * @param col de la celda evaluada.
	 * @return el estado o valor de la celda Sureste.
	 */
	static byte celdaSureste(int fila, int col) {
		if (fila+1 < TAMAÑO_MUNDO && col+1 < TAMAÑO_MUNDO) {
			return espacioMundo[fila+1][col+1]; 	// Celda SE.
		}
		return 0;
	}

	/**
	 * Apartado 8+:
	 * Obtiene el estado o valor de la celda vecina situada al Este de la indicada por la coordenada. 
	 * @param fila de la celda evaluada.
	 * @param col de la celda evaluada.
	 * @return el estado o valor de la celda Este.
	 */
	static byte celdaEste(int fila, int col) {
		if (col+1 < TAMAÑO_MUNDO) {
			return espacioMundo[fila][col+1]; 		// Celda E.
		}
		return 0;
	}

	/**
	 * Apartado 8+:
	 * Obtiene el estado o valor de la celda vecina situada al Noreste de la indicada por la coordenada. 
	 * @param fila de la celda evaluada.
	 * @param col de la celda evaluada.
	 * @return el estado o valor de la celda Noreste.
	 */
	static byte celdaNoreste(int fila, int col) {
		if (fila-1 >= 0 && col+1 < TAMAÑO_MUNDO) {
			return espacioMundo[fila-1][col+1]; 		// Celda NE.
		}
		return 0;
	}

	/**
	 * Apartado 8+:
	 * Obtiene el estado o valor de la celda vecina situada al NO de la indicada por la coordenada. 
	 * @param fila de la celda evaluada.
	 * @param col de la celda evaluada.
	 * @return el estado o valor de la celda NO.
	 */
	static byte celdaNorte(int fila, int col) {
		if (fila-1 >= 0) {
			return espacioMundo[fila-1][col]; 		// Celda N.
		}
		return 0;
	}

	/**
	 * Apartado 8+:
	 * Obtiene el estado o valor de la celda vecina situada al Noroeste de la indicada por la coordenada. 
	 * @param fila de la celda evaluada.
	 * @param col de la celda evaluada.
	 * @return el estado o valor de la celda Noroeste.
	 */
	static byte celdaNoroeste(int fila, int col) {
		if (fila-1 >= 0 && col-1 >= 0) {
			return espacioMundo[fila-1][col-1]; 		// Celda NO.
		}
		return 0;
	}

	/**
	 * Apartado 8+:
	 * Actualiza el estado almacenado del Juego de la Vida.
	 * Las celdas perifÃ©ricas son los lÃ­mites absolutos.
	 * El mundo representado serÃ­a plano cerrado con lÃ­mites para cÃ©lulas de dos dimensiones.
	 */
	static void actualizarMundoPlano1()  {     					
		byte[][] nuevoEstado = new byte[TAMAÑO_MUNDO][TAMAÑO_MUNDO];
		byte[][] matrizConteo;

		for (int i = 0; i < TAMAÑO_MUNDO; i++) {
			for (int j = 0; j < TAMAÑO_MUNDO; j++) {

				matrizConteo = replicarMatrizConteo(i, j);

				int vecinas = 0;							
				vecinas += matrizConteo[0][0];		// Celda NO
				vecinas += matrizConteo[0][1];		// Celda N		NO | N | NE
				vecinas += matrizConteo[0][2];		// Celda NE   	-----------
				vecinas += matrizConteo[1][2];		// Celda E		 O | * | E
				vecinas += matrizConteo[2][2];		// Celda SE	  	----------- 
				vecinas += matrizConteo[2][1]; 		// Celda S		SO | S | SE
				vecinas += matrizConteo[2][0]; 		// Celda SO 
				vecinas += matrizConteo[1][0];		// Celda O           			                                     	

				actualizarCelda(nuevoEstado, i, j, vecinas);
			}
		}
		espacioMundo = nuevoEstado;
	}

	/**
	 * Apartado 8+:
	 * Obtiene una submatriz con las celdas adyacentes a cualquier celda del mundo.
	 * @param fila de la celda central de la submatriz
	 * @param col de la celda central de la submatriz
	 * @return matrizCopia
	 */
	static byte[][] replicarMatrizConteo(int fila, int col) {
		byte[][] matrizCopia = { 
				{ 0, 0, 0 }, 
				{ 0, 0, 0 }, 
				{ 0, 0, 0 }
		};

		// Zona central.
		if (fila-1 >= 0 && fila+1 < TAMAÑO_MUNDO && col-1 >= 0 && col+1 < TAMAÑO_MUNDO) {
			System.arraycopy(espacioMundo[fila-1], col-1, matrizCopia[0], 0, 3);
			System.arraycopy(espacioMundo[fila], col-1, matrizCopia[1], 0, 3);
			System.arraycopy(espacioMundo[fila+1], col-1, matrizCopia[2], 0, 3);
			return matrizCopia;
		}

		// Banda perifÃ©rica superior.
		if (fila == 0 && col-1 >= 0 && col+1 < TAMAÑO_MUNDO)	{
			System.arraycopy(espacioMundo[fila], col-1, matrizCopia[1], 0, 3);
			System.arraycopy(espacioMundo[fila+1], col-1, matrizCopia[2], 0, 3);
			return matrizCopia;
		}
		
		// Banda perifÃ©rica inferior.
		if (fila == TAMAÑO_MUNDO-1 && col-1 >= 0 && col+1 < TAMAÑO_MUNDO) {
			System.arraycopy(espacioMundo[fila-1], col-1, matrizCopia[0], 0, 3);
			System.arraycopy(espacioMundo[fila], col-1, matrizCopia[1], 0, 3);
			return matrizCopia;
		}
		
		// Banda perifÃ©rica izquierda.
		if (col == 0 && fila-1 >= 0 && fila+1 < TAMAÑO_MUNDO) {
			System.arraycopy(espacioMundo[fila-1], col, matrizCopia[0], 1, 2);
			System.arraycopy(espacioMundo[fila], col, matrizCopia[1], 1, 2);
			System.arraycopy(espacioMundo[fila+1], col, matrizCopia[2], 1, 2);
			return matrizCopia;
		}
		
		// Banda perifÃ©rica derecha.
		if (col == TAMAÑO_MUNDO-1 && fila-1 >= 0 && fila+1 < TAMAÑO_MUNDO) {
			System.arraycopy(espacioMundo[fila-1], col-1, matrizCopia[0], 0, 2);
			System.arraycopy(espacioMundo[fila], col-1, matrizCopia[1], 0, 2);
			System.arraycopy(espacioMundo[fila+1], col-1, matrizCopia[2], 0, 2);
			return matrizCopia;
		}

		// Esquinas superior izquierda.
		if (fila == 0 && col == 0)	{
			System.arraycopy(espacioMundo[fila], col, matrizCopia[1], 1, 2);
			System.arraycopy(espacioMundo[fila+1], col, matrizCopia[2], 1, 2);
			return matrizCopia;
		}

		// Esquinas superior derecha.
		if (fila == 0 && col == TAMAÑO_MUNDO-1)	{
			System.arraycopy(espacioMundo[fila], col-1, matrizCopia[1], 0, 2);
			System.arraycopy(espacioMundo[fila+1], col-1, matrizCopia[2], 0, 2);
			return matrizCopia;
		}

		// Esquinas inferior izquierda.
		if (fila == TAMAÑO_MUNDO-1 && col == TAMAÑO_MUNDO-1)	{
			System.arraycopy(espacioMundo[fila-1], col-1, matrizCopia[1], 0, 2);
			System.arraycopy(espacioMundo[fila], col-1, matrizCopia[2], 0, 2);
			return matrizCopia;
		}

		// Esquinas inferior derecha.
		if (fila == TAMAÑO_MUNDO-1 && col == 0)	{
			System.arraycopy(espacioMundo[fila-1], col, matrizCopia[1], 1, 2);
			System.arraycopy(espacioMundo[fila], col, matrizCopia[2], 1, 2);
			return matrizCopia;
		}

		return matrizCopia;
	}


	/**
	 * Apartado 8:
	 * Carga datos demo en la matriz que representa el mundo. 
	 */
	static void cargarMundoDemo() {
		// En este array los 0 indican celdas con cÃ©lulas muertas y los 1 vivas.
		espacioMundo = new byte[][] { 
			{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
			{ 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, //
			{ 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0 }, //
			{ 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, //
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 
			{ 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 }, // 
			{ 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 }, //
			{ 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 }, // 
			{ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 1x Planeador
			{ 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 1x Flip-Flop
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } // 1x Still Life
		};
	}

	/**
	 * Apartado 8:
	 * Controla el acceso de usuario.
	 * @return true si la sesiÃ³n se inicia correctamente.
	 */
	static boolean inicioSesionCorrecto() {
		Scanner teclado = new Scanner(System.in);	// Entrada por consola.
		int intentosPermitidos = MAX_INTENTOS_FALLIDOS;

		do {
			// Pide usuario y contraseÃ±a.
			System.out.print("Introduce el nif de usuario: ");
			String nif = teclado.nextLine();
			System.out.print("Introduce clave acceso: ");
			String clave = teclado.nextLine();

			// Busca usuario coincidente con las credenciales.
			usrEnSesion = buscarUsuario(nif);
			Usuario temp = new Usuario();
			temp.setClaveAcceso(clave);
			clave = temp.getClaveAcceso();
			
			if (usrEnSesion != null && usrEnSesion.getClaveAcceso().equals(clave)) {
				return true;
			} else {
				intentosPermitidos--;
				System.out.print("Credenciales incorrectas: ");
				System.out.println("Quedan " + intentosPermitidos + " intentos... ");
			} 
		} while (intentosPermitidos > 0);

		return false;
	}

	/**
	 * Apartado 8:
	 * Busca usuario dado su nif.
	 * @param idUsr - el nif del Usuario a buscar.
	 * @return - el Usuario encontrado o null si no existe.
	 */
	static Usuario buscarUsuario(String idUsr) {
		// Busca usuario coincidente con la credencial.
		for (Usuario usr : datosUsuarios) {
			if (usr.getNif().equalsIgnoreCase(idUsr)) {
				return usr;	// Devuelve el usuario encontrado.
			}
		}
		return null;						// No encuentra.
	}

	/**
	 * Apartado 8:
	 * Registro de la sesiÃ³n de usuario.
	 */
	static void registrarSesion() {
		SesionUsuario sesion = new SesionUsuario();
		sesion.setUsr(usrEnSesion);
		sesion.setFecha(new Date().toString());

		// Registra sesion de usuario a partir de la Ãºltima posiciÃ³n ocupada.
		datosSesiones[sesionesRegistradas] = sesion;  
		sesionesRegistradas++; 							
	}

	/**
	 * Apartado 7:
	 * Muestra por consola todos los usuarios almacenados.
	 */
	static void mostrarTodosUsuarios() {
		for (Usuario u: datosUsuarios) {
			System.out.println("\n" + u);
		}
	}

	/**
	 * Apartado 7:
	 * Genera datos de prueba vÃ¡lidos dentro 
	 * del almacÃ©n de datos.
	 */
	static void cargarUsuariosPrueba() {
		Usuario usuarioAux = new Usuario();
		usuarioAux.setNif("23445562K");
		usuarioAux.setNombre("Pepe"); 
		usuarioAux.setApellidos("LÃ³pez PÃ©rez");
		usuarioAux.setDomicilio("C/Luna, 27 30132 Murcia");
		usuarioAux.setCorreo("pepe@gmail.com");
		usuarioAux.setFechaNacimiento("1999.11.12");
		usuarioAux.setFechaAlta("2017.12.3");
		usuarioAux.setClaveAcceso("Miau#0");
		usuarioAux.setRol("usuario normal");
		datosUsuarios[0] = usuarioAux;

		for (int i = 1; i < MAX_USUARIOS; i++) {
			usuarioAux = new Usuario();
			usuarioAux.setNif(i + "34452625K");
			usuarioAux.setNombre("Pepe" + i); 
			usuarioAux.setApellidos("LÃ³pez" + " PÃ©rez" +i) ;
			usuarioAux.setDomicilio("C/Luna, 27 30132 Murcia");
			usuarioAux.setCorreo("pepe" + i + "@gmail.com");
			usuarioAux.setFechaNacimiento("1999.11.12");
			usuarioAux.setFechaAlta("2017.12.3");
			usuarioAux.setClaveAcceso("Miau#" + i);
			usuarioAux.setRol("usuario normal");
			datosUsuarios[i] = usuarioAux;
		}
	}

	/**
	 * Apartado 5: 
	 * Pruebas de la clase SesionUsuario
	 */
	static void probarSesionUsuario() {

		// Datos para la prueba...
		Usuario usr = new Usuario();
		usr.setNif("23456790K");
		usr.setNombre("Pepe");
		usr.setApellidos("LÃ³pez PÃ©rez");
		usr.setDomicilio("C/Luna, 27 30132 Murcia");
		usr.setCorreo("pepe@gmail.com");
		usr.setFechaNacimiento("1999.11.12");
		usr.setFechaAlta("2017.12.3");
		usr.setClaveAcceso("Miau#0");
		usr.setRol("usuario normal");

		// Prueba de la clase SesionUsuario
		SesionUsuario sesion1 = new SesionUsuario();
		sesion1.setUsr(usr);
		sesion1.setFecha("2017.12.3");
		System.out.println(sesion1);	
	}

	/**
	 *  PRUEBAS DE LA CLASE Usuario
	 */
	static void probarUsuario() {	// Busca usuario coincidente con las credenciales.
		Scanner teclado = new Scanner(System.in);

		// Prueba de la clase Usuario

		Usuario usr1=new Usuario();
		//System.out.println(usr1.getNif().equals("00000000A"));
		//System.out.println(usr1.getNombre() == "Nombre");
		//System.out.println(usr1.getApellidos() == "Apellido Apellido");
		
		//System.out.println(usr1.getIdUsr().equals("NAA0A"));
		
		//System.out.println(usr1.getDomicilio() == "Domicilio");
		//System.out.println(usr1.getCorreo() == "correo@cooreo.com");
		//System.out.println(usr1.getFechaNacimiento() == "2000.12.21");
		//System.out.println(usr1.getFechaAlta() == "2018.01.31");
		//System.out.println(usr1.getClaveAcceso() == "Miau#0");
		//System.out.println(usr1.getRol() == "NORMAL");
		
		// AsignaciÃ³n entre referencias -no duplica objeto-
		Usuario usr2 = new Usuario("23456790K", "Pepe", "LÃ³pez PÃ©rez",
				"C/Luna, 27 3usrSesion0132 Murcia", "pepe@gmail.com",
				"1999.11.12", "2017.12.3", "Miau#3", "usuario normal");	
		//System.out.println(usr2.getNif().equals("23456790K"));
		//System.out.println(usr2.getNombre() == "Pepe");
		//System.out.println(usr2.getApellidos()  = "LÃ³pez PÃ©rez");
		//System.out.println(usr2.getIdUsr().equals("PCP0A"));
		

		Usuario usr3 = new Usuario(usr2);		
		//System.out.println(usr3 != usr2);
		//System.out.println(usr3.getNif() != usr2.getNif());
		//System.out.println(usr3.getNombre() != usr2.getNombre());
		//System.out.println(usr3.getApellidos() != usr2.getApellidos());
		//System.out.println(usr3.getDomicilio() != usr2.getDomicilio());
		//System.out.println(usr3.getCorreo() != usr2.getCorreo());
		//System.out.println(usr3.getFechaNacimiento() != usr2.getFechaNacimiento());
		//System.out.println(usr3.getFechaAlta() != usr2.getFechaAlta());
		//System.out.println(usr3.getClaveAcceso() != usr2.getClaveAcceso());
		//System.out.println(usr3.getRol() != usr2.getRol());
		
	
		//System.out.println(usr1); 		// Muestra identificador Ãºnico de objeto
		//System.out.println(usr2);
		//System.out.println(usr3);
		//System.out.println(usr4);
		
		//usr1.setNif(null);
		//usr1.setNif("12D");
		
		//usr2.setNif("23456790K");
		//usr2.setNombre("Pepe");
		//usr2.setApellidos("LÃ³pez PÃ©rez");
		//usr2.setDomicilio("C/Luna, 27 3usrSesion0132 Murcia");
		//usr2.setCorreo("pepe@gmail.com");
		//usr2.setFechaNacimiento("1999.11.12");
		//usr2.setFechaAlta("2017.12.3");
		//usr2.setClaveAcceso("miau");
		//usr2.setRol("usuario normal");

		// Modifica tambiÃ©n usr2, son el mismo objeto
		//usr1.setNombre("Luis");
		//System.out.println("usr1: " + usr1.getNombre());
		//System.out.println("usr2: " + usr2.getNombre());

		// AsÃ­ si duplica
		//Usuario usr4 = new Usuario();
		//usr4.setNif(usr2.getNif());
		//usr4.setNombre(usr2.getNombre());
		//usr4.setApellidos(usr2.getApellidos());
		//usr4.setDomicilio(usr2.getDomicilio());
		//usr4.setCorreo(usr2.getCorreo());
		//usr4.setFechaNacimiento(usr2.getFechaNacimiento());
		//usr4.setFechaAlta(usr2.getFechaAlta());
		//usr4.setFechaAlta(usr2.getFechaAlta());
		//usr4.setRol(usr2.getRol());

		// Son diferentes objetos.
		//usr4.setNombre("Pedro");
		//System.out.println(usr2.getNombre());

		System.out.println(usr2.getClaveAcceso().equals("PmeyD7"));
		
		


	}

} //class