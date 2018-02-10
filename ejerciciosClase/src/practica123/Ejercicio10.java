package practica123;
/**Ejercicio10.java
 * Programa que calcula las ecuaciones de n�meros introducidos
 * @author Daniel
 *3.11.2017
 */

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String argumentos[]) {
		Scanner teclado = new Scanner(System.in);
		double a, b, c, raiznegativa;

		System.out.print("Introduzce el valor de a: ");
		a = teclado.nextDouble();

		System.out.print("Introduzce el valor de b: ");
		b = teclado.nextDouble();

		System.out.print("Introduzce el valor de c: ");
		c = teclado.nextDouble();


		raiznegativa = b * b - 4 * a * c;

		if (raiznegativa < 0)
		{
			System.out.print("\n\nLa solucion no pertenece a los n�meros reales");
		}
		else if (raiznegativa >= 0)
		{
			double x1, x2;

			x1 = (- b + Math.sqrt (b * b - 4 * a * c)) / (2 * a);
			x2 = (- b - Math.sqrt (b * b - 4 * a * c)) / (2 * a);

			System.out.print("\n\nLas soluciones son " + x1 + " y " + x2);
		}
		teclado.close();
	}

}