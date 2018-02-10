package practica115;
/**
 *  Multiplo5.java
 *  Fecha:9.11.2017
 *  Autor/a:Daniel Buendia Valverde
 *  Programa que calcula el salario a partir de las horas indicadas
 */

//HEMOS REALIZADO DOS BUCLES PARA VER LAS DOS POSIBILADES
import java.util.Scanner;
public class Multiplo5 {
	public static void main (String args[]){		
		Scanner teclado = new Scanner(System.in);
		char letra;
		System.out.print("Vamos a calcular el salario de una semana");
		System.out.println("\n-----------------------------------------");
		do {
			calcularSalario();

			System.out.print("\n�Queres seguir calculando el saldo? (s/n)");
			letra = teclado.next().charAt(0);
		}

		while (letra == 's' || letra == 'S');	
		teclado.close();

	}

	static void calcularSalario(){

		//char letra;
		int hora, saldo=0;
		final int horas=35;
		final int horaNormal=15;
		final int horaExtra=22;

		Scanner teclado = new Scanner(System.in);
		//do {
		System.out.print("Introduce las horas que has trabajado: ");
		hora = teclado.nextInt();
		if (hora > 35){
			saldo = (hora - horas) * horaExtra + horas * horaNormal;				
		}
		else {
			saldo = hora * horaNormal;
		}		
		System.out.print("Tu salario es: " + saldo);
		//System.out.print("\n�Queres seguir calculando el saldo? (s/n)");
		//letra = teclado.next().charAt(0);
		//}
		//while (letra == 's' || letra == 'S');	
		//teclado.close();

	}

}
