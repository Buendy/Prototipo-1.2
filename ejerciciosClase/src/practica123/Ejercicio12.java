package practica123;
/**Ejercicio12.java
 * 
 * Programa que nos indica que triangulo es seg�n los datos que introducimos
 *3.11.2017
 */

import java.util.Scanner;
public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		char tecla;
		
		//Aqu� empieza el bucle recogiendo tres datos enteros
		do {
			System.out.print("Introduzca el primer lado del tri�ngulo: ");
			lado1 = teclado.nextInt();
			System.out.print("Introduzca el segundo lado del tri�ngulo: ");
			lado2 = teclado.nextInt();
			System.out.print("Introduzca el tercer lado del tri�ngulo: ");
			lado3 = teclado.nextInt();
			
			//Con los tres primero if realizamos un control de errores
			if (lado1 == 0){
				System.out.println("Error, el primer dato no es un n�mero de lado v�lido ");
			}
			if (lado2 == 0){
				System.out.println("Error, el segundo dato no es un n�mero de lado v�lido ");
			}
			if (lado3 == 0){
				System.out.println("Error, el tercer dato no es un n�mero de lado v�lido ");
			}
			
			//Realizamos comparaciones para determinar que tipo de triangulo es
			if (lado1 == lado2 && lado1 == lado3){
				System.out.println("El tri�ngulo es equil�tero");
			}
			if (lado1 == lado2 && lado1 != lado3){
				System.out.println("El tri�ngulo es is�sceles");
			}
			if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
				System.out.println("El tri�ngulo es escaleno");
			}
					
			System.out.print("Desea continuar? S/N ");
			tecla = teclado.next().charAt(0);
		}
		
		while (tecla == 's');
		teclado.close();
		
		
	}	
}
