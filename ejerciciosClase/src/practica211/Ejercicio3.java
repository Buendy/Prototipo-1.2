package practica211;
/**Ejercicio3.java
 * Programa que devuelve la frecuencia de los elementos de un vector
 * Daniel Buendia 15-12-2017
 */

public class Ejercicio3 {
	public static void main(String args[]) {
		int[] miarray = { 5, 3, 6, 4, 4, 4, 9, 1, 3, 5, 7, 4, 2, 8, 7 };
		int numero = frecuenciaNumero(miarray, 6);
		System.out.print(numero);

	}

	static int frecuenciaNumero(int[] vector, int num) {
		int frecuencia = 0;

		for (int i = 0; i < vector.length; i++) {
			if (vector[i] == num) {
				frecuencia++;
			}
		}

		return frecuencia;
	}
}
