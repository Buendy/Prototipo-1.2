package practica115;
/**
 *  Ejercicio6.java
 *  Fecha:9.11.2017
 *  Autor/a:Daniel Buendia Valverde
 *  Programa que nos muestra la tabla de multiplicar del n�mero introducido
 */

import java.util.Scanner;

public class Ejercicio6 {

	public static void main (String args[]){

		calcularMostrarTabla();

	}

	static void calcularMostrarTabla(){

		Scanner tecla = new Scanner(System.in); 
		final int multiplomax = 15;
		int num;
		int contador=0;
		int resultado;

		System.out.print("Dime un n�mero y te doy su tabla de multiplicar: ");
		num = tecla.nextInt();

		do {
			resultado = num * contador;
			System.out.print("\n" + num + " x " + contador + " = " + resultado);
			contador++;

		}
		while (contador <= multiplomax);
		tecla.close();
	}

}
