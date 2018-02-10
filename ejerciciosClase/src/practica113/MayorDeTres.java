package practica113;
/**
 * MayorDeTres.java
 * En este programa capturamos el teclado con tres variables numericas
 * para que nos diga cual es mayor de las tres.
 * DBV - 2017.09.29
 */
import java.util.Scanner;
public class MayorDeTres {
	public static void main (String argumentos [])
	{
		
	//Establecemos las variables numericas
	int num, num2, num3;
	//Establecemos el canal de entrada por teclado
	Scanner teclas = new Scanner(System.in);
	//Mostramos mensajes por pantalla
	System.out.print("Vamos a jugar a un juego.\nDime tres numeros:");
	System.out.print("\nNúmero 1:"); //Captura los números que metemos por teclado
		num = teclas.nextInt();
		System.out.print("Número 2:");
		num2 = teclas.nextInt();
		System.out.print("Número 3:");
		num3 = teclas.nextInt();
	
	//Despues de capturar las entradas realiza con if las siguientes instrucciones
	//Si num es mayor que num2 y num3 ejecuta la primera instruccion	
	if (num>num2 && num>num3) {
		System.out.println("El mayor de los tres es " + num);
	}	
	//sino realiza: si num2 es mayor que num3 ejecuta la segunda instruccion
	else if (num2>num3){
		System.out.print("El mayor de los tres es " + num2);
	}
	//sino ejecuta la ultima instruccion
	else {
		System.out.print("El mayor de los tres es " + num3);
	}
	
	
	}
}
