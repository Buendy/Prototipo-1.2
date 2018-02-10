package practica115;
import java.util.*;
/** Ejercicio8.java
 *Fecha: 10.11.2017
 *Autor/a:Daniel Buendia Valverde
 *Programa que imprima los N primeros números de la serie de Fibonacci.
 *El primer número de la serie es 1, el segundo número es 1 y cada uno de los
 *siguientes es la suma de los dos anteriores.
 *0, 1, 1, 2, 3, 5, 8, 13,  ....... , N
 */

public class Ejercicio8{
	public static void main(String[] args){
		fibona(fibonacci());
	}

	static int fibonacci(){
		Scanner teclado = new Scanner(System.in);
		int numero;
		do{
			System.out.print("Introduce numero mayor que 1: ");
			numero = teclado.nextInt();
		}while(numero<=1);
		teclado.close();
		return numero;
		
	}

	static void fibona(int numero){
		System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");
		int fibo1,fibo2,i;
		fibo1=0;
		fibo2=1;

		System.out.print(fibo1 + " ");
		for(i=2;i<=numero;i++){
			System.out.print(fibo2 + " ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println();

	}

}
