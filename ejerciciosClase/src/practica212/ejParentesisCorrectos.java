package practica212;
/**
 * Programa que comprueba si los parentesis de una cadena de caracteres están abiertos y cerrados
 * @author Daniel 11.01.18
 */
import java.util.Scanner;

public class ejParentesisCorrectos {

	public static void main(String[] args) {
		
		
		Scanner teclas= new Scanner(System.in);
		
		System.out.print("Introduce un texto con paréntesis: ");
		String texto = teclas.nextLine();
		
		boolean parentesis=parentesisCorrectos(texto);
		
		System.out.println("la condicion de los paréntesis es: " + parentesis);
	}
	
	static boolean parentesisCorrectos (String texto){
		int contador=0;
		
		boolean resultado=false;
		
		for (int i =0;i<texto.length();i++){
			if(texto.charAt(i)=='('){
				contador++;
				
			}
			else if (texto.charAt(i)== ')'){
				contador--;
				
			}
						
		}
		if (contador == 0){
			resultado = true;
		}

		
	return resultado;	
	}
}
