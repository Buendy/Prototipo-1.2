package autoevaluacion252;
public class datos {

	// Vector de objetos
	public static final int users=20;
	public static Usuario[] datosUsuarios;

	/**
	 * Método principal que coordina la
	 * llamada a los distintos métodos probados.
	 * @param args
	 */
	public static void main(String[] args) {

		//Prepara texto para la prueba con una cantidad arbitraria de objetos Usuario
		//Cada objeto va separado por: ;
		//Los atributos van separados por: ,
		String texto="48635162y,Daniel,Buendia Valverde,C/Doctor Fleming,danielbuendiasmr@gmail.com,"
				+ "8/12/1989,27/01/2018,12345678,admin;";
		
	
	
		//...

		//Llamada al método de importación de usuarios
		importarUsuariosTexto(texto);
		//..
	}
	static void importarUsuariosTexto(String texto){
		
		int contador=1;
		datosUsuarios = new Usuario[users];
		String[] objeto=texto.split(";");

		for(int i=0,j=0;i<objeto.length; i++,j++){

			String[] atributos=objeto[j].split(",");

			Usuario user = new Usuario();

			System.out.println("");
			System.out.println("----- Usuario número " + contador + " -----");
			System.out.println("");

			user.nif=atributos[0];			
			user.nombre=atributos[1];
			user.apellidos=atributos[2];
			user.domicilio=atributos[3];
			user.correo=atributos[4];
			user.fechaNacimiento=atributos[5];
			user.fechaAlta=atributos[6];
			user.claveAcceso=atributos[7];
			user.rol=atributos[8];

			datosUsuarios[j]=user;

			for(int a=0;a<atributos.length;a++){
				System.out.println("-- " + atributos[a]);
			}
			contador++;
		}

	}


} //class



/**
 * Clase que representa el usuario de un sistema.
 * @author ajp
 */
class Usuario {

	//Atributos
	public String nif;
	public String nombre;
	public String apellidos;
	public String domicilio;
	public String correo;
	public String fechaNacimiento;
	public String fechaAlta;
	public String claveAcceso;
	public String rol;

} //class