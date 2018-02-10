package practica113;
/**
 * Hola1c.java
 * Este programa captura lo que le metemos por teclado y lo muestra
 * DBV - 2017.09.29
 */
//Aqui se importa el paquete 
import java.util.Scanner;

/**
 * Hola2.java
 * Programa ejemplo que muestra mensajes por pantalla con información variable.
 * Incluye configuración de entrada fácil por teclado y la utiliza para dar un mensaje personalizado.
 * ajp - 2017.10.05
 */

import java.util.Scanner;
public class Hola2
{
	public static void main(String argumentos[])
	{


		// Necesita importar el paquete java.util
		// Existe una alternativa de entrada más compleja con BufferedReader

		Scanner tecla = new Scanner(System.in);
		
		int number ;		    // Con esta vamos a establcer una variable numerica
		String name = "";		// Con esta vamos a establecer una variable de texto 
		
		// configura y muestra mensaje de bienvenida
		// también indica que la variable númerica es 5
		number = 5 ;
		System.out.print("Hola, Soy un modesto ");
		System.out.print("programa de ordenador...\n");
		System.out.println("\nMi número de orden es el " + number + " por ser el " + number + ".");

		// Pide nombre
		System.out.print("\nDame tu nombre: ");
		
		// Espera a que le metas una entrada de texto
		name = tecla.nextLine();
		
		// muestra mensaje personalizado
		System.out.println("\nBienvenido a Java. \n" + name + ", espero que lo pases bien...");
		
	}

}