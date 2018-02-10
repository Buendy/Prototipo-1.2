package practica251;

public class Principal {

	static final int MAX_USUARIOS = 45;

	// Almacén de datos resuelto con arrays
	public static UsuarioAuto[] datosUsuarios = new UsuarioAuto[MAX_USUARIOS];

	public static void main(String[] args) {

		int[] patron = {1,0,1,1,0,1,1,1,1,0};
		cargarDatosUsuarioPatron(patron);
		for (int i=0; i<datosUsuarios.length;i++){
			System.out.println(datosUsuarios[i]);
		}

	}

	static void cargarDatosUsuarioPatron(int[] patron) {
		int j= 0;

		for (int i = 0; i < MAX_USUARIOS; i++) {
			if (patron[j] == 1) {
				UsuarioAuto usuario = new UsuarioAuto();
				usuario.nif = "48635162" ;
				usuario.nombre = "Daniel" ;
				usuario.apellidos = "Buendia" ;
				usuario.correo = "danielbuendiasmr@gmail.com" ;
				usuario.domicilio = "calle sin numero";
				usuario.fechaNacimiento = "8/12/89" ;
				usuario.fechaAlta = "10/12/2017" ;
				usuario.claveAcceso = "1234" ;
				usuario.rol = "administrador" ;
				datosUsuarios[i] = usuario;
				
			}

			if (patron.length-1==j) {
				j = 0;
			}
			j++;
		}
	}

}
