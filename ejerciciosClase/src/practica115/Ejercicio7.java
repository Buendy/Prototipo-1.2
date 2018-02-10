package practica115;
/**
 *  Ejercicio7.java
 *  Fecha:9.11.2017
 *  Autor/a:Daniel Buendia Valverde
 *  Programa que calcula el factorial del n�mero introducido por teclado
 */

import java.util.Scanner;

public class Ejercicio7 {
	
	//Aqui hemos invocado la variable y el metodo para cmabiar un poco con respecto a los ejercicios anteriores
	public static void main (String args[]){
		
		int factorial=factorial();
		System.out.print("El factorial del n�mero introducido es: " + factorial); 
		
	}

	static int factorial(){
		Scanner teclas = new Scanner(System.in);

		int factorial = 1;
		int NumIntroducido;
		System.out.print("Introduce un n�mero positivo: ");

		do {	
			NumIntroducido = teclas.nextInt();			
			if (NumIntroducido < 0){
				System.out.print("Introduzca un n�mero positivo:");
			}			
		}
		while (NumIntroducido < 0);

		while(NumIntroducido != 0){
			factorial *= NumIntroducido;
			NumIntroducido--;
		}    
		teclas.close();
		return factorial;
		
	}
}
