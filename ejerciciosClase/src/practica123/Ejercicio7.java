package practica123;
/**Ejercicio7.java
 * Programa que muestra un n�mero con los decimales indicados
 * 3.11.17 Daniel Buendia
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio7 {
	public static void main (String args[]){
		Scanner teclas = new Scanner(System.in);
		//Establecemos las variables de tipo real sin inicializar
		double NumLeido,NumMostrado;
		//Establecemos la variable de tipo entero para los decimales quese quieren mostrar
		int Decimal;

		//Comienza el bucle capurando los datos introducidos por teclado
		//En el caso de que se pulse 0 se terminar�a el bucle
		do {
			System.out.println("Introduce 0 si quieres salir");
			System.out.print("Dime un n�mero con varios decimales: ");
			NumLeido = teclas.nextDouble();
			if (NumLeido == 0){
				break;
			}
			System.out.println("Introduce 0 si quieres salir");
			System.out.print("Dime el n�mero de decimales que quieres que se muestren: ");
			Decimal = teclas.nextInt();
			if (NumLeido == 0){
				break;
			}
			//Mediante esta formula mostramos los decimales indicados
			NumMostrado = Math.rint (NumLeido * Math.pow(10, Decimal)) / Math.pow (10, Decimal);

			System.out.println("El n�mero redondeado es: " + NumMostrado);
			System.out.println("------------------------------------------------------------------");

		}
		//Aqu� indicamos una condici�n para que termine el bucle
		//para poder introducir n�meros negativos tambi�n
		while (NumLeido == 0);
		System.out.println("HAS SALIDO DEL PROGRAMA");
		teclas.close();
	}
}
