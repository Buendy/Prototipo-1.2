package practica115;
/**
 *  Ejercicio12.java
 *  Fecha:16.11.2017
 *  Autor/a:Daniel Buendia Valverde
 *  Programa que muestra una piramide con asteriscos
 */
import java.util.Scanner;

public class Ejercicio12 {
	public static void main (String arg[]){

		System.out.print(piramide2());
	


	}

	static String piramide2(){

		Scanner teclado = new Scanner (System.in); 

		int dato, contador1, contador2 = 1;

		System.out.print("Introduce un número: ");
		dato = teclado.nextInt();
		if (dato < 0){
			System.out.print("Introduce números positivos, vuelve a ejecutar el programa");
		}

		teclado.close();
		String asterisco=new String();
		for (int contador3 = dato - 1; contador3 >=0; contador3-- ){

			for (contador1 = contador3;contador1 >=0; contador1--){
				asterisco+=" ";
			}

			for (int contador4 = 0; contador4 < contador2; contador4++ ){
				asterisco +="*";
			}
			contador2 +=2;
			asterisco +="\n";
					}
		return asterisco;
	}
}