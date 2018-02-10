package prototipo11;
import java.util.Date;

/** 
 * Proyecto: Juego de la vida.
 *  Implementa el concepto de SesionUsuario según el modelo1.0
 *  En esta versión no se han aplicado la mayoría de los estándares 
 *  de diseño OO dirigidos a conseguir un "código limpio". 
 *  La implementación es la más básica posible con el fin ilustrar 
 *  cómo se evoluciona desde una versión con mal diseño.
 *  Se pueden detectar varios defectos y antipatrones de diseño:
 *  	
 *  	- Clase sólo de datos.
 *  @since: prototipo1.0
 *  @source: SesionUsuario.java 
 *  @version: 1.1 - 2017/11/29 
 *  @author: DBV
 */

public class SesionUsuario {	
	// Atributos	
	private Usuario usr;   //materializa la relación de composición del modelo UML
	private String fecha; 
	
	/**
	 * Redefine el método heredado de la clase Objecto.
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