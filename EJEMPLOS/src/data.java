import javax.swing.JOptionPane;

public class data {

	// Vector de objetos
	public static Usuario[] datosUsuarios;


	public static void main(String[] args) {

		String texto = JOptionPane.showInputDialog("Introduce"
				+ " los datos de los usuarios");
		importarUsuariosTexto(texto);

	} //main

	private static void  importarUsuariosTexto(String texto){
		String[] textopartido = texto.split(";");
		

		int numerousuarios = 0;
		int contador = 1;
		datosUsuarios = new Usuario[20];

		

		for (int realizado=0, i=0; realizado<textopartido.length;realizado++){
			
			Usuario usuario = new Usuario();
			
			String[] comas = textopartido[i].split(",");
			System.out.println("");
			System.out.println("----- Este es el usuario numero " + contador + " -----");
			System.out.println("");
			usuario.nif = comas[0];
			System.out.println("DNI: " + usuario.nif);
			usuario.nombre = comas[1];
			System.out.println("Nombre: " + usuario.nombre);
			usuario.apellidos = comas[2];
			System.out.println("Apellido: " + usuario.apellidos);
			usuario.domicilio = comas[3];
			System.out.println("Domicilio: " + usuario.domicilio);
			usuario.correo = comas[4];
			System.out.println("Correo: " + usuario.correo);
			usuario.fechaNacimiento = comas[5];
			System.out.println("Fecha de Nacimiento: " + usuario.fechaNacimiento);
			usuario.fechaAlta = comas[6];
			System.out.println("Fecha de Alta: " + usuario.fechaAlta);
			usuario.claveAcceso = comas[7];
			System.out.println("Clave de Acceso: " + usuario.claveAcceso);
			usuario.rol = comas[8];
			System.out.println("Rol: " + usuario.rol);
			
			
			i++;
			contador++;

			datosUsuarios[realizado] = usuario;
			}
		}


	} //class


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
