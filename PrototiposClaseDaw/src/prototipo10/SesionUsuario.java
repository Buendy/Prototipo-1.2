package prototipo10;
/** 
 * Proyecto: Juego de la vida.
 *  Implementa el concepto de SesionUsuario seg�n el modelo1.0
 *  En esta versi�n no se han aplicado la mayor�a de los est�ndares 
 *  de dise�o OO dirigidos a conseguir un "c�digo limpio". 
 *  La implementaci�n es la m�s b�sica posible con el fin ilustrar 
 *  c�mo se evoluciona desde una versi�n con mal dise�o.
 *  Se pueden detectar varios defectos y antipatrones de dise�o:
 *  	- Ausencia de encapsulaci�n.
 *  	- Clase s�lo de datos.
 *  @since: prototipo1.0
 *  @source: SesionUsuario.java 
 *  @version: 1.0 - 2017/11/29 
 *  @author: ajp
 */

public class SesionUsuario {	
	// Atributos	
	public Usuario1 usr;   // Materializa la relaci�n de composici�n del modelo UML
	public String fecha; 
	
	/**
	 * Redefine el m�todo heredado de la clase Objecto.
	 * @return el texto formateado del estado (valores de atributos) 
	 * de objeto de la clase SesionUsuario  
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" 			// Incluye identificador de objeto
				+ "\n" + usr  					// usr.toString()
				+ "\n fecha:" + fecha;
	}

} // class