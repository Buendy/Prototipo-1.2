package prototipo10;
/** Proyecto: Juego de la vida.
 *  Implementa el concepto de Usuario seg�n el modelo1.
 *  En esta versi�n no se han aplicado la mayor�a de los est�ndares 
 *  de dise�o OO dirigidos a conseguir un "c�digo limpio". 
 *  La implementaci�n es la m�s b�sica posible con el fin ilustrar 
 *  c�mo se evoluciona desde una versi�n con mal dise�o.
 *  Se pueden detectar varios defectos y antipatrones de dise�o:
 *  	- Ausencia de encapsulaci�n.
 *  	- Clase s�lo de datos.
 *  	- Obsesi�n por los tipos primitivos.  
 *  @since: prototipo1.0
 *  @source: Usuario.java 
 *  @version: 1.0 - 2017/11/29 
 *  @author: ajp
 */

public class Usuario1 {	
	// Atributos	
	public String nif;
	public String nombre;
	public String apellidos;
	public String domicilio;
	public String correo;
	public String fechaNacimiento;
	public String fechaAlta;
	public String claveAcceso;
	public String rol;

	/**
	 * Redefine el m�todo heredado de la clase Objecto.
	 * @return el texto formateado del estado -valores de atributos- de objeto de la clase Usuario.  
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" 			// Incluye identificador de objeto.
				+"\n nif: \t\t" + nif 
				+ "\n nombre: \t" + nombre 
				+ "\n apellidos: \t" + apellidos 
				+ "\n domicilio: \t" + domicilio 
				+ "\n correo: \t" + correo 
				+ "\n fechaNacimiento:" + fechaNacimiento
				+ "\n fechaAlta: \t" + fechaAlta 
				+ "\n claveAcceso: \t" + claveAcceso
				+ "\n rol: \t\t" + rol ;
	}

} // class