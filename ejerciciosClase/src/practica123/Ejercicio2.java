package practica123;
/**
 * PROGRAMA EN EL QUE CALCULAMOS EL CAPITAL FINAL A PARTIR DE UNOS DATO
 * INTROUCIDOS POR EL TECLADO 
 * 20.10.207
 */
//Importamos la utilidad para capturar el teclado y para utilizar formulas
import java.util.Scanner;
import java.lang.Math;

public class Ejercicio2 {
	public static void main (String args[]){
		//Establecemos el canal de entrada
		Scanner teclas = new Scanner(System.in);
		//Establecemos las variables de tipo real
		double cf, ci, r, n;
		

		//Captura la entrada del teclado
		System.out.println("Vamos a calcular el interes y el capital total");
		for (int i = 0; i < 60; i ++ ){
			System.out.print("-");
				}
		System.out.println("\nDinos el capital inicial: ");
		ci = teclas.nextDouble();
		System.out.println("Dime el interes: ");
		r = teclas.nextDouble();
		r = r /100;
		r++;
		System.out.println("Dime a cuantos a�os: ");
		n = teclas.nextDouble();
		//Con los datos capturados realiza la siguiente operaci�n
		cf = ci * Math.pow(r, n);
		System.out.print("El capital final es: " + cf);
		
	}
}
