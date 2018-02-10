package prototipo11;
import java.util.Date;

/** 
 * Proyecto: Juego de la vida.
 *  Implementa el concepto de SesionUsuario seg�n el modelo1.0
 *  En esta versi�n no se han aplicado la mayor�a de los est�ndares 
 *  de dise�o OO dirigidos a conseguir un "c�digo limpio". 
 *  La implementaci�n es la m�s b�sica posible con el fin ilustrar 
 *  c�mo se evoluciona desde una versi�n con mal dise�o.
 *  Se pueden detectar varios defectos y antipatrones de dise�o:
 *  	
 *  	- Clase s�lo de datos.
 *  @since: prototipo1.0
 *  @source: SesionUsuario.java 
 *  @version: 1.1 - 2017/11/29 
 *  @author: DBV
 */

public class SesionUsuario {	
	// Atributos	
	private Usuario usr;   //materializa la relaci�n de composici�n del modelo UML
	private String fecha; 
	
	/**
	 * Redefine el m�todo heredado de la clase Objecto.
	 * @return el texto formateado del estado (valores de atributos) 
	 * de objeto de la clase SesionUsuario  
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" 			// Incluye identificador de objeto
				+ "\n" + getUsr()
				+ "\n fecha:" + getFecha();
	}
	
	
	/**
	 * Constructor convencional
	 * @param usr
	 * @param fecha
	 */
	public SesionUsuario(Usuario usr, String fecha){
		setUsr(usr);
		setFecha(fecha);
	}
	/**
	 * Contructor por defecto
	 */
	public SesionUsuario(){
		this(new Usuario(), new Date().toString());
	}

	/**
	 * Constructor copia
	 * @return
	 */
	
	public SesionUsuario(SesionUsuario sesion){
		usr = new Usuario(sesion.usr);
		fecha = new String(sesion.fecha);
	}
	
	public Usuario getUsr() {
		return usr;
	}

	public void setUsr(Usuario usr) {
		this.usr = usr;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	
	
} // class