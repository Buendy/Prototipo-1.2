package practica123;
/**Ejercicio8.java
 * Programa que muestra un cuadrado con el n�mero de asteriscos que le indiquemos
 * 3.11.2017
 * @author Daniel
 *
 */

import java.util.Scanner;

public class Ejercicio8 {
	public static void main (String args[]){

		Scanner teclado = new Scanner(System.in);
		int Num,data1,data2;
		//Captura el dato entero que le damos
		System.out.print("Introduce la longitud del lado: ");
		Num = teclado.nextInt();

		//Bucle que se ejecuta mientras sea menor que el numero introducido
		for (data1=0;data1<Num;data1++){
			System.out.print("* ");
		}
		System.out.print("\n");

		//Aqui se realiza el laterar del cuadradro
		for (data1 = 0;data1<Num-2;data1++){
			System.out.print("* ");
			for(data2=0;data2<Num-2;data2++){
				System.out.print("  ");
			}
			System.out.println("*");
		}
		//Bucle que se ejecuta mientras sea menor que el numero introducido
		for (data1=1;data1<=Num;data1++){
			System.out.print("* ");
			teclado.close();
		}
	}		
}

