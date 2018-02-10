package practica211;
/**Ejercicio7.java
 * Programa nos dice que posición tiene el numero introducido por teclado
 * Daniel Buendia 16-12-2017
 */
import java.util.Scanner;
public class Ejercicio7 {
	public static void main (String[] args){
		Scanner teclado = new Scanner(System.in);
		int[] array = {3,2,5,6,7,2,6,8,10};
		int num;
		int posicion;

		System.out.print("Introduce el número para saber en qué posición está: ");
		num = teclado.nextInt();
		teclado.close();

		posicion = buscarInt(array, num);	
		System.out.println(posicion);

	}

	static int buscarInt (int[] vector, int num1){
		
		int aux = 0;
		for (int i=0; i < vector.length; i++){
			
			if(vector[i] == num1){
				aux = i;

				break;
			}
		}

		return aux;
	}
}