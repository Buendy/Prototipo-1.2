package practica115;
/**
 *  Multiplo4.java
 *  Fecha:9.11.2017
 *  Autor/a:Daniel Buendia Valverde
 *  Escribe en pantalla los m�ltiplos de 2 por debajo de un TOPE que se introduzca por teclado
 */


import java.util.Scanner;


public class Multiplo4 {
	public static void main (String args[]){
		mostrarMultiplos2(pedirTope());
		
	}

	static void mostrarMultiplos2(int TOPE){

		// Declaraci�n de variables
		Scanner teclado = new Scanner(System.in);
		int mult  ;							// Almacena el m�ltiplo calculado
		int cont  ;							// Contador utilizado en el c�lculo

		// Inicializa las variables
		mult = 0 ;
		cont = 0 ;

		System.out.println("\t M�ltiplos de 2\n");
		while (mult < TOPE)					// Bucle de c�lculo y visualizaci�n
		{

			mult = cont * 2;
			System.out.println("\t  " +    '#' + (cont+1) + '\t' + mult);
			++cont;
		}
		teclado.close();
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
