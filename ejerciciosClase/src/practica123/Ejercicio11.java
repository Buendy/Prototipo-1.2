package practica123;
/**Ejercicio11.java
 * Programa que muestra un menu que permite realizar operaciones
 * @author Daniel
 *3.11.2017
 */

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);

		int Opcion=0,Num1,Num2,Resultado1;
		double Num3,Num4,Resultado2;

		//Con este bucle hacemos que vuelva a ejecutarse despu�s de realizar una operaci�n
		while (Opcion!=5){
			System.out.print("Escoge una opci�n [1]Suma [2]Resta [3]Multiplicaci�n [4]Divisi�n [5]Salir: ");
			//Iniciamos la variable con el texto introducido
			Opcion = tecla.nextInt();

			//Segun el n�mero introducido ejecutara un bloque u otro
			switch(Opcion){
			case 1:
				System.out.println("Introduce el primer operando: ");
				Num1 = tecla.nextInt();
				System.out.println("Introduce el segundo operando: ");
				Num2 = tecla.nextInt();
				Resultado1 = Num1+Num2;
				System.out.println("El resultado es: " + Resultado1);
				break;

			case 2:
				System.out.println("Introduce el primer operando: ");
				Num1 = tecla.nextInt();
				System.out.println("Introduce el segundo operando: ");
				Num2 = tecla.nextInt();
				Resultado1 = Num1-Num2;
				System.out.println("El resultado es: " + Resultado1);
				break;

			case 3:
				System.out.println("Introduce el primer operando: ");
				Num1 = tecla.nextInt();
				System.out.println("Introduce el segundo operando: ");
				Num2 = tecla.nextInt();
				Resultado1 = Num1*Num2;
				System.out.println("El resultado es: " + Resultado1);
				break;

			case 4:
				System.out.println("Introduce el primer operando: ");
				Num3 = tecla.nextDouble();
				System.out.println("Introduce el segundo operando: ");
				Num4 = tecla.nextDouble();
				Resultado2 = Num3/Num4;
				System.out.println("El resultado es: " + Resultado2);
				break;
				
			case 5:
				break;
			//Si se introduce un n�mero que no sea de los establecidos saldr� este mensaje	
			default:
		         System.out.print("Error!! Elige una de las opciones.\n");
		         break;
			}
		}
		tecla.close();
	}
}

