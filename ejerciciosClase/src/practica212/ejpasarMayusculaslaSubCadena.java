package practica212;
/** Programa que pasa a mayuscula una cadena de caracteres indicada
 * 
 * @author Daniel Buendia 18.01.18
 *
 *
 */

import javax.swing.JOptionPane;
public class ejpasarMayusculaslaSubCadena {

	public static void main(String[] args) {
		String textoEtiquetado=JOptionPane.showInputDialog("Introduce un texto");
		String Resultado;
		Resultado=pasarMayusculaslaSubCadena(textoEtiquetado);
		System.out.println(Resultado);
	}	
	
	static String pasarMayusculaslaSubCadena(String textoEtiquetado){
		
		String aux="<mayus>";
		String aux1="</mayus>";
		
		
			
		int num= textoEtiquetado.indexOf(aux) + aux.length();
		int num2= textoEtiquetado.indexOf(aux1);
		
		int num3=textoEtiquetado.indexOf(aux, num2) + aux.length();
		int num4=textoEtiquetado.indexOf(aux1, num3);
		
		String buscarCadena1=textoEtiquetado.substring(num,num2);		
		String cadena1Mayusculas=buscarCadena1.toUpperCase();
		
		
		String buscarCadena2=textoEtiquetado.substring(num3, num4);		
		String cadena2Mayusculas=buscarCadena2.toUpperCase();

		
		String texto=textoEtiquetado.replace(aux+buscarCadena1+aux1, cadena1Mayusculas);
		String textoMayusculado=texto.replace(aux+buscarCadena2+aux1, cadena2Mayusculas);
		
		
		
	return textoMayusculado;	
	}

}
