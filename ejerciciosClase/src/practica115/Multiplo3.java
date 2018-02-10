package practica115;
/**
 *  Multiplo3.java
 *  Fecha:9.11.2017
 *  Autor/a:Daniel Buendia Valverde
 *  Escribe en pantalla los m�ltiplos de 2 por debajo de un TOPE que se introduzca por teclado
 */


import java.util.Scanner;

public class Multiplo3 {
	public static void main (String args[]){

		int TOPE=pedirTope();

		// Declaraci�n de variables

		int mult=0  ;							// Almacena el m�ltiplo calculado
		int cont=0  ;							// Contador utilizado en el c�lculo


		System.out.println("\t M�ltiplos de 2\n");
		while (mult < TOPE)					// Bucle de c�lculo y visualizaci�n
		{
			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}

	}

	static int pedirTope(){
		Scanner teclado = new Scanner(System.in);
		int TOPE  ; 
		System.out.println("Dime un n�mero y te doy los multiplos de 2 hasta ese n�mero: ");
		TOPE = teclado.nextInt();
		teclado.close();
		return TOPE;
	
	}

}
