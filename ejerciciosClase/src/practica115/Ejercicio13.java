package practica115;
/**
 *  Ejercicio13.java
 *  Fecha:16.11.2017
 *  Autor/a:Daniel Buendia Valverde
 *  Programa que muestra una piramide con asteriscos
 */

import java.util.Scanner;

public class Ejercicio13 {
	public static void main (String arg[]){
		
		Scanner teclado = new Scanner (System.in);
		
		double a, b, c;
		boolean raiz;
		
		System.out.print("Introduzca el valor de a: ");
		a = teclado.nextDouble();
		
		System.out.print("Introduzca el valor de b: ");
		b = teclado.nextDouble();
		
		System.out.print("Introduzca el valor de c: ");
		c = teclado.nextDouble();
		
		raiz = raizPositiva(a, b, c);
		
		if (raiz){
		calcularEcuacion(raiz, a, b, c);
		}
		else{
			System.out.println("La solución no pertenece a los números reales.");
		}
		
		teclado.close();
	} // main
	static boolean raizPositiva(double a,double  b,double c){
		
		double d;
		boolean raiz;
		
		d = b * b - 4 * a * c;
		
		if (d < 0){
			raiz = false;
			return raiz;
		}
		else{
			raiz = true;
			return raiz;
		}
	}//raizPositiva
	
	static void calcularEcuacion(boolean raiz, double a, double b, double c){
		
		double x1, x2;
			
		x1 = (- b + Math.sqrt (b * b - 4 * a * c)) / (2 * a);
		x2 = (- b - Math.sqrt (b * b - 4 * a * c)) / (2 * a);
		
		System.out.println("El valor de x1 es " + x1 + " y el valor de x2 es " + x2 );
	} // calcularRaiz
	
}//class
