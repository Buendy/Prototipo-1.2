package practica115;
/**
 *  Ejercicio14.java
 *  Fecha:16.11.2017
 *  Autor/a:Daniel Buendia Valverde
 *  Programa que muestra un rombo con asteriscos
 */
// Rombo (terminado)

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);

		int numero;

		System.out.print("Introduce un numero impar positivo: ");
		numero = teclado.nextInt();

		if (numero%2 == 0 || numero <= 0){
			System.out.print("ERROR. Introduce un n�mero impar positivo");
		}
		else {
			System.out.print(Rombo(numero));
			//Rombo(numero);
		}

		teclado.close();
	} // main

	static String Rombo(int numero){
		String asterisco=new String();
		int contadorasteriscos = 0, mitad, aux = numero;

		mitad = (numero - 1) / 2;

		for (int a = 0; a < mitad; a++){ // saltos de linea (piramide de "arriba")

			for (int b = a; b < mitad; b++){ // espacios
				asterisco+=" ";
			}
			for (int z = 0; z <= contadorasteriscos; z++){ // asteriscos
				asterisco+="*";
			}

			asterisco+="\n";
			contadorasteriscos +=2;
		}
		for (int n = 0; n <= mitad; n++){ // saltos de linea (piramide de abajo)

			for (int q = 0; q < n; q++){ // espacios
				asterisco +=" ";
			}
			for (int f = 0;f < aux; f++ ){ // asteriscos
				asterisco +="*";
			}

			asterisco +="\n";
			aux -=2;
		}
		return asterisco;
	} // Rombo()

}
