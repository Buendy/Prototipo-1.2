package practica212;
/** Programa de devuelve una cadena de caracteres formateada con asteriscos
 * 
 * @author Daniel Buendia 25.01.18
 *
 *
 */

import javax.swing.JOptionPane;
import java.util.Scanner;

public class ejpadRight {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		
		char asterisco='*';		

		System.out.print("Introduce una palabra: ");
		StringBuilder texto= new StringBuilder(teclado.nextLine());		

		System.out.print("Introduce un número: ");
		int num=teclado.nextInt();			

		String cadena=padRight(texto, asterisco, num);		
		System.out.print(cadena);
		teclado.close();
	}

	static String padRight (StringBuilder text, char ast, int number){
		String resultado="";
		int aux;
		String text1= text.toString();

		if(text.length()<number){
			aux=text.length();

			for(int i=aux; i<number; i++){
				resultado=text1+=ast;
			}

		}

		else{
			System.out.println("El texto es más grande que el numero indicado");
		}

		return resultado;
	}


}
