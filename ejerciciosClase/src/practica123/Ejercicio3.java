package practica123;
/**
 *PROGRAMA QUE SUMA 8 NUMEROS QUE NOS CAPTURA POR TECLADO
 * 20.10.207
 */

//Importamos la utilidad para capturar teclado
import java.util.Scanner;

public class Ejercicio3 {
	public static void main (String args[]){
		//Establecemos un canal de entrada
		Scanner teclas = new Scanner(System.in);
		//Establecemos dos variable de tipo entero con valor 0 porque le daremos valor despues
		int num =0;
		int sumaAcum =0;
		//Aqui inicia el bucle, inicia en 0 y termina en 8
		//Esto lo realizara 8 veces incrementandose
		for (int i = 0; i < 8; i ++ ){
			System.out.print("N�mero a sumar: ");
			//Captura los datos introducidos por teclado
			num = teclas.nextInt();
			//Aqui realiza una suma acumulativa de los datos introducidos
			sumaAcum += num;
		}
		System.out.print(sumaAcum);
	}

}
