package practica115;
/** Multiplo1.java
Fecha: 9.11.2017
Autor/a:Daniel Buendia Valverde
Escribe en pantalla los m�ltiplos de 2 por debajo de un TOPE, 16.
 */

public class Multiplo1 	{

	//Creamos el metodo que realizar� lo siguiente
	static void mostrarMultiplos1() {
		// Declaraci�n de variables

		final int TOPE = 16  ; 				// Constante, el m�ximo valor del m�ltiplo
		int mult  ;							// Almacena el m�ltiplo calculado
		int cont  ;							// Contador utilizado en el c�lculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t M�ltiplos de 2\n");
		while (mult < TOPE)					// Bucle de c�lculo y visualizaci�n
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
	}

	//Aqu� llamamos al metodo
	public static void main(String argumentos[]) {
		mostrarMultiplos1();
	}

}