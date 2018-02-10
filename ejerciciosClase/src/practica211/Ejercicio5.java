package practica211;
/**Ejercicio5.java
 * Programa que compara dos vectores de caracteres e indica si son iguales, mayores o menores
 * Daniel Buendia 15-12-2017
 */
public class Ejercicio5 {
	public static void main (String[] args){
		char[] array1 = {'a','b','c'};
		char[] array2 = {'a','d','a'};
		compararVectoresChar(array1, array2);
	}

	static void compararVectoresChar(char[] vector1, char[] vector2){
		for(int i=0; i<vector1.length;i++){
			if (vector1[i] == vector2[i])
				System.out.print(" 0 ");
			if (vector1[i] < vector2[i])
				System.out.print(" -1 ");
			if (vector1[i] > vector2[i])
				System.out.print(" 1 ");
		}

	}

}
