package practica212;
import javax.swing.JOptionPane;

/** Programa que invierte una cadena de caractareres 
 * 
 * @author Daniel Buendia 11.01.18
 *
 */
public class ejInvertirTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String intro =JOptionPane.showInputDialog("Dime una palabra o una frase");
		String invertido = invertirTexto(intro);
		System.out.print(invertido);

	}
	static String invertirTexto(String intro){
		String resultado="";
		int ultimaLetra = intro.length();
		int aux =1;

		do {
			System.out.print(intro.charAt(ultimaLetra-aux));

			aux++;
		}
		while (aux <= intro.length());

		return resultado.toString();
	}

}
