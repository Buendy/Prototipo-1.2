package practica113;
/**
 * TresUsuarios.java
 * Programa en el que introducimos datos de tres usuarios para que los muestre a la inversa
  * DBV - 2017.10.6
 */
import java.util.Scanner;

public class TresUsuarios {
	public static void main (String argunmentos[])
	{
	
	Scanner teclado = new Scanner(System.in);
	String data1, data2, data3, data4, data5, data6 = "";
	String data7, data8, data9 = "";
	int num1, num2, num3;

	System.out.print("Introduce los datos de tres usuarios:");
	System.out.print("\n \nUSUARIO 1\nNombre: ");
		data1 = teclado.nextLine();
	System.out.print("Apellidos:");
		data2 = teclado.nextLine();
	System.out.print("NIF:");
		data3 = teclado.nextLine();
	System.out.print("Código postal:");
		num1 = Integer.parseInt(teclado.nextLine());
		
	System.out.print("\n \nUSUARIO 2\nNombre: ");
		data4 = teclado.nextLine();
	System.out.print("Apellidos:");
		data5 = teclado.nextLine();
	System.out.print("NIF:");
		data6 = teclado.nextLine();
	System.out.print("Código postal:");
		num2 = Integer.parseInt(teclado.nextLine());	
		
	System.out.print("\n \nUSUARIO 1\nNombre: ");
		data7 = teclado.nextLine();
	System.out.print("Apellidos:");
		data8 = teclado.nextLine();
	System.out.print("NIF:");
		data9 = teclado.nextLine();
	System.out.print("Código postal:");
		num3 = Integer.parseInt(teclado.nextLine());
		
		System.out.println(data7 + " " + data8 + " " + data9 + " " + " " + num3);
		System.out.println(data4 + " " + data6 + " " + data7 + " " + " " + num2);
		System.out.println(data1 + " " + data2 + " " + data3 + " " + " " + num1);
				
	}
}
