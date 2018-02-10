package practica115;

/**
 *  Multiplo2.java
 *  Fecha:9.11.2017
 *  Autor/a:Daniel Buendia Valverde
 *  Escribe en pantalla los m�ltiplos de 2 por debajo de un TOPE que se introduzca por teclado
 */

import java.util.Scanner;
public class Multiplo2 {

	public static void main (String args[]){

		mostrarMultiplos2();			

	}

	static void mostrarMultiplos2(){

		// Declaraci�n de variables
		Scanner teclado = new Scanner(System.in);
		int TOPE ;
		int mult  ;							// Almacena el m�ltiplo calculado
		int cont  ;							// Contador utilizado en el c�lculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("Dime un número y te doy los multiplos de 2 hasta ese número: ");
		TOPE = teclado.nextInt();

		System.out.println("\t M�ltiplos de 2\n");
		while (mult < TOPE)					// Bucle de c�lculo y visualizaci�n
		{

			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
		teclado.close();
	}

}
