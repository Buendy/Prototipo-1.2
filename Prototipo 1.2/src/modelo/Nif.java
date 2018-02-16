package modelo;
/** Proyecto: Juego de la vida.
 *  Implementa el concepto de Nif según el modelo1.
 *  Utiliza un texto para representar el nif.
 *  @since: prototipo1.2
 *  @source: Nif.java 
 *  @version: 1.2 - 2018/15/15 
 *  @author: dbv
 */

public class Nif {
	private String texto;
	
	public Nif(String texto) {
		//super();
		setTexto(texto);
	}
	
	public Nif() {
		this("00000000A");
	}

	public Nif(Nif nif) {	
		texto = new String(nif.texto);
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		if(textoValido(texto)){		
			this.texto = texto;
		}
	}
	
	/**
	 * Comprueba validez del nif.
	 * @param nif.
	 * @return true si cumple.
	 */
	private boolean textoValido(String texto) {
		assert texto != null;
		return	texto.matches("^[\\d]{8}[BCDEFGHJKLMNPQRSTUVWXYZA]$");
	}

	@Override
	public String toString() {
		return texto;
	}

	
	
}
