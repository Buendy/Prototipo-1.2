package practica113;
/**
 * ParImpar.java
 *Programa que espera la entrada por teclado de dos variables numericas
 * y nos dice cual es impar o par
 * DBV - 2017.10.6
 */

import java.util.Scanner;

/**
 * Programa que nos indica que número es par
  * DBV - 2017.10.6
 */

import java.util.Scanner;
public class ParImpar
{
	public static void main(String argumentos[])
	{
		// La siguiente línea establece un canal de entrada por teclado.
		// Necesita importar el paquete java.util
		// Existe una alternativa de entrada más compleja con BufferedReader

		Scanner teclado = new Scanner(System.in);
		
		int num ;				// variable numérica
		
		
		// configura y muestra mensaje de bienvenida
		
		System.out.println("Hola, Soy un modesto ");
		System.out.print("programa de ordenador, vamos a jugar a un juego...\n");
		
		// Pide nombre
		System.out.print("\nDíme un número: ");
		
		
		// Para establecer esta variable tenemos que utilizas una clase envoltorio
		num = Integer.parseInt(teclado.nextLine());
		
		//Aqui establecemos con if para que muestre si es par o impar
		
		if (num%2==0){
			System.out.print("El número " + num + " es par!!!!");
			}
		else {
			System.out.print("El número " + num + " es impar!!!");
		}
		
		
	}

}