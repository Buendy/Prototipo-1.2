package practica112;
// Pide tres datos de tipo entero por teclado, los guarda y los muestra ordenados por pantalla (terminado)

import java.util.Scanner;

public class Ejercicio1
{
	public static void main(String argumentos[]){
		
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, num3; // Declaro las varibles de tipo entero
		
		// A continuaciÃ³n se solicitan los datos
		System.out.print("Introduce el primer nÃºmero:");
		num1 = teclado.nextInt();
		
		System.out.print("Introduce el segundo nÃºmero:");
		num2 = teclado.nextInt();
		
		System.out.print("Introduce el tercer nÃºmero:");
		num3 = teclado.nextInt();
		
		teclado.close();
		
		if (num1 < num2 && num1 < num3 && num2 < num3){
			System.out.print("\n\n" + num1 + " < " + num2 + " < " + num3);
		}
		else if (num1 < num2 && num1 < num3 && num2 > num3){
			System.out.print("\n\n" + num1 + " < " + num3 + " < " + num2);
		}
		else if (num1 > num2 && num2 < num3 && num1 < num3){
			System.out.print("\n\n" + num2 + " < " + num1 + " < " + num3);
		}
		else if (num1 > num2 && num2 < num3 && num1 > num3){
			System.out.print("\n\n" + num2 + " < " + num3 + " < " + num1);
		}
		else if (num1 > num2 && num2 > num3 && num1 > num3){
			System.out.print("\n\n" + num3 + " < " + num2 + " < " + num1);
		}
		else if (num1 < num2 && num2 > num3 && num1 > num3){
			System.out.print("\n\n" + num3 + " < " + num1 + " < " + num2);
		}

	}

}
