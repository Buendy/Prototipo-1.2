package practica113;
/**
 * MayorDedos.java
 * En este programa capturamos el teclado con variables numericas 
 * para que nos diga cual es mayor
 * DBV - 2017.09.29
 */


import java.util.Scanner;
public class MayorDeDos
{
	public static void main(String argumentos[])
	{
		

		Scanner teclado = new Scanner(System.in);
		
		int num, num2 ;		// variables numéricas
				
		//muestra mensaje de bienvenida
		System.out.println("Hola, Soy un modesto ");
		System.out.print("programa de ordenador y vamos a jugar a un juego...\n");
		
		// Para establecer esta variable tenemos que utilizas una clase envoltorio
		System.out.print("\nDíme un número: ");
		num = Integer.parseInt(teclado.nextLine());
		
		// Para establecer esta variable tenemos que utilizas una clase envoltorio
		System.out.print("Díme otro número: ");
		num2 = Integer.parseInt(teclado.nextLine());
		
		// Con la sentencia siguiente se muestra los numeros introducidos
		System.out.print("\nLos números son: " + num + " y " + num2 + "\n");
		
		//Aqui establecemos con if para se muestre cual de los dos es mayor
		// si num es igual que num2 ejecuta la sentencia, si no se va a la siguiente
		if (num==num2){ 
			System.out.println("Son iguales!");
		}	
			// else ejecuta if num es mayor que num ejecuta la siguiente sentencia
			else if(num>num2){ 
				System.out.print("El número " + num +" es mayor que el número " + num2);
		}
			// sino se cumple lo anterior num2 sera mayor que num
			else {
				System.out.println("\nEl número " + num2 +" es mayor que el número " + num);
		}
		
		
	}

}