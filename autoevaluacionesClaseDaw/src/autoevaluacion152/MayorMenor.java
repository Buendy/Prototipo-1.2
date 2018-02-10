package autoevaluacion152;
/**MayorMenor.java
 * Programa que pide números y nos dice cual es el mayor y cual es el menor
 * También nos dice el total de números introducidos
 * 27.10.2017
 */
import java.util.Scanner;

public class MayorMenor {

	public static void main(String argumentos[]) {

		Scanner teclado = new Scanner(System.in);
		//Establecemos las variables
		int mayor = 0, menor = Integer.MAX_VALUE , ValorEntrada, ContadorValidos = 0;
		char letra = 'T';
		System.out.println("Introduce algunos números (pulse 0 para terminar):");
		ValorEntrada = teclado.nextInt();
		do {

			System.out.println("Sigue introduciendo números (pulse 0 para terminar):");
			do {
				//Pedimos el valor de una variable mediante teclado
				ValorEntrada = teclado.nextInt();
				//Comparamos la variable que hemos obtenido por teclado con la que habíamos establecido para la 	//variable mayor
				if (ValorEntrada >= mayor) {
					mayor = ValorEntrada;
				}
				//Comparamos la variable que hemos obtenido por teclado con la que habíamos establecido para la 	//variable menor y que tiene que ser mayor de 0
				if (ValorEntrada < menor && ValorEntrada > 0) {
					menor = ValorEntrada;
				}
				//La variable que introducimos por teclado tiene que ser mayor de 0 para que el contador aumente
				if (ValorEntrada > 0) {
					ContadorValidos++;
				}
				//Si el número introducido es menor de 0 nos pedirá introducir otro número que sea superior a 0
				if (ValorEntrada < 0) {
					System.out.println("Dato no válido. Introduzca un número positivo.");
				}
				//Mientras que el número introducido por teclado sea distinto de 0 el ciclo se repetirá
			} while (ValorEntrada != 0);
			//Si el contador es inferior a 1 nos indicará que tenemos que meter dos números
			if (ContadorValidos < 1) {			
				System.out.println("Tienes que introducir como mínimo dos números.");
				//Si el contador es superior o igual a 2 nos indicará que pulsemos t para terminar el ciclo
			} else if (ContadorValidos >= 2) {
				System.out.print("\nPulse 'T' para terminar: ");
				letra = teclado.next().charAt(0);
			}
			//Mientras que la letra sea diferente de t y el contador sea inferior de dos el ciclo seguirá ejecutandose
		} while (letra != 't' || ContadorValidos < 2);
		System.out.println("\nEl número mayor es: " + mayor);
		System.out.println("El número menor es: " + menor);
		System.out.println("El total de números introducidos es : " + ContadorValidos);

		teclado.close();
	}
}
