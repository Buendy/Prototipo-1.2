package practica113;
/**
 * Nombre1.java
 * Este programa pregunta nombres y edades esperando la entrada de texto
 * y las muestra por pantall
 * DBV - 2017.10.6
 */


//DEBEMOS IMPORTAR LA UTILIDAD EL PAQUETE DE DE CAPTURA DE TECLADO
import java.util.Scanner;

public class Nombre1 
	{
		public static void main(String argumentos[])
		{
			
		// La siguiente línea establece un canal de entrada por teclado	
		Scanner teclado = new Scanner (System.in);
		
		//Con los siguientes establecemos variables numericas
		int numero;
		int numero2;
		
		//Con los siguientes establecemos variables de texto
		int age1, age2;
		String nombre = "";
		String nombre2 = "";
		String texto = "Este programa ha sido realizado por Daniel";
	
		//Establecemos los numeros a la variable
		numero = 1;
		numero2 = 27;
		
		// Pide nombres y edades esperando la entrada del teclado
		System.out.print("Dime el nombre de dos personas y su edad: ");
		System.out.print("\nPrimer Nombre: ");
		nombre = teclado.nextLine();
		System.out.print("Edad: ");
		age1 = Integer.parseInt(teclado.nextLine());
		System.out.print("Segundo Nombre: ");
		nombre2 = teclado.nextLine();
		System.out.print("Edad: ");
		age2 = Integer.parseInt(teclado.nextLine());
		
	
		// Muestra un mensaje con las variables establecidas antes
		System.out.println("El nombre de la primera persona es " + nombre + " y su edad es " + age1);
		System.out.println("El nombre de la segunda persona es " + nombre2 + " y su edad es " + age2);
		System.out.print(texto); 
		
		System.out.print("\n¡¡¡FUNCIONA!!!");
			
		}
}
