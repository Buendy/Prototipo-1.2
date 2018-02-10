package practica115;
/**
 *  Ejercicio10.java
 *  Fecha:16.11.2017
 *  Autor/a:Daniel Buendia Valverde
 *  Programa que muestra un rombo con asteriscos
 */
// Rombo (terminado)

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);

		int numero;

		System.out.print("Introduce un numero impar positivo: ");
		numero = teclado.nextInt();

		if (numero%2 == 0 || numero <= 0){
			System.out.print("ERROR. Introduce un n�mero impar positivo");
		}
		else {
			Rombo(numero);
		}

		teclado.close();
	} // main

	static void Rombo(int numero){

		int contadorasteriscos = 0, mitad, aux = numero;

		mitad = (numero - 1) / 2;

		for (int a = 0; a < mitad; a++){ // saltos de linea (piramide de "arriba")

			for (int b = a; b < mitad; b++){ // espacios
				System.out.print(" ");
			}
			for (int z = 0; z <= contadorasteriscos; z++){ // asteriscos
				System.out.print("*");
			}

			System.out.print("\n");
			contadorasteriscos +=2;
		}
		for (int n = 0; n <= mitad; n++){ // saltos de linea (piramide de abajo)

			for (int q = 0; q < n; q++){ // espacios
				System.out.print(" ");
			}
			for (int f = 0;f < aux; f++ ){ // asteriscos
				System.out.print("*");
			}

			System.out.print("\n");
			aux -=2;
		}
	} // Rombo()

}

