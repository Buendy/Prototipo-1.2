package practica123;
/**Ejercicio4.java
 * Programa que pide varios n�meros y te dice cual es mayor
 * 26.10.2017 
 */

import java.util.Scanner;
public class Ejercicio4 {
	public static void main (String args[]){
		//Establecemos las variables
		int num ;
		int mayor=0;
		char letra;
		
		//Conecta el escaner con la entrada de teclado
		Scanner tecla = new Scanner(System.in); 
		
		System.out.print("Dime un n�mero: ");
		//Procesa como n�mero el texto que le metemos e iniciamos la variable mayor
		num = tecla.nextInt();
		mayor = num;
		
		//Bucle
		//Va pidiendo n�meros
		do {
			System.out.print("Dame otro n�mero: ");
			num= tecla.nextInt();
			//Esta condici�n indica que si num es mayor, que mayor cambia el valor de mayor
			if (num>mayor){
				mayor = num;							
			}
			//Espera a que le metamos un caracter por el teclado
			System.out.print("�Queres seguir introduciendo n�meros? (s/n)");
			letra = tecla.next().charAt(0);
		}
		//Si la tecla es "s" volver� ha realizar el bucle, sino ejecutara la sentencia siguiente
		while (letra == 's');

		System.out.print("El n�mero mayor es: " + mayor);		
		tecla.close();
	}

}
