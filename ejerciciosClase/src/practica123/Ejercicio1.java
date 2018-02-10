package practica123;
/**
 * PROGRAMA QUE PIDE TRES NUMEROS POR PANTALLA Y LOS MUESTRA
 * 20.10.207
 */

//Importamos la utilidad de caputra de teclado
import java.util.Scanner;

public class Ejercicio1 {
	public static void main (String args[])
	{
	
	//Establecemos las variables de tipo entero
	
	int num1, num2, num3;
	Scanner teclas = new Scanner(System.in);
	System.out.print("Dime tres numeros:");
	//Captura los datos que metemos por teclado
	System.out.print("\nNumero 1:");
	num1 = teclas.nextInt();
	System.out.print("Numero 2:");
	num2 = teclas.nextInt();
	System.out.print("Numero 3:");
	num3 = teclas.nextInt();
	
	//Mediante las siguientes condiciones sabemos cual es menor y mayor para mostrarlos ordenados
	if (num1<num2 && num1<num3 && num2<num3){
		System.out.print("\nLos numeros de menor a mayor son: " + num1 + " " + num2 + " " + num3);
	}
	else if (num1<num2 && num1<num3 && num2>num3){
		System.out.print("\nLos numeros de menor a mayor son: " + num1 + " " + num3 + " " + num2);
	}
	else if (num1>num2 && num2<num3 && num1<num3){
		System.out.print("\nLos numeros de menor a mayor son: " + num2 + " " + num1 + " " + num3);
	}
	else if (num1>num2 && num2<num3 && num1>num3){
		System.out.print("\nLos numeros de menor a mayor son: " + num2 + " " + num3 + " " + num1);
	}
	else if (num1>num2 && num2>num3 && num1>num3){
		System.out.print("\nLos numeros de menor de mayor son: " + num3 + " " + num2 + " " + num1);
	}
	else if (num1<num2 && num2>num3 && num1>num3){
		System.out.print("\nLos numeros de menor a mayor son: " + num3 + " " + num1 + " " + num2);
	}
	
	}

}
