package practica123;
/** Ejercicio5
 * 	Programa que suma los numeros introducidos por teclado, los suma y saca su media aritm�tica
 *  27.10.2017
 */

import java.util.Scanner;
public class Ejercicio5 {
	public static void main (String args[]){
		Scanner tecla = new Scanner(System.in); 
		
		int num =0;
		int sumaAcum =0;
		double media=0;
		int contador=0;

		System.out.println("Vamos a jugar a alg�n juego en el que me dir�s algunos n�meros");
		System.out.println("Introduce n�meros positivos y yo te los sumar� y har� una media aritm�tica de ellos");
		System.out.println("------------------------------------------------------------------------------------\n");

		//Comienza el bucle y mientras el numero introducido sea diferente a 0 seguira ejecutandose
		do {
			System.out.print("N�mero a sumar: ");
			//Captura los datos introducidos por teclado
			num = tecla.nextInt();
			//Aqui realiza una suma acumulativa de los datos introducidos
			sumaAcum += num;
			if (num < 0){
				System.out.print("Es un n�mero negativo, por favor introduce n�meros positivos: ");
				num = tecla.nextInt();
				sumaAcum += num;

			}
			if (num > 0){
				contador++;
			}
		}
		while (num != 0);
		System.out.println("La suma total de todos los n�meros es: " + sumaAcum);
		media = sumaAcum / contador;
		System.out.println("La media aritm�tica es: " + media);


		tecla.close();
	}

}
