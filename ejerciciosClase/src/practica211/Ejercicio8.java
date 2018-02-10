package practica211;
/**Ejercicio8.java
 * Programa nos dice si nos numeros de un array están ordenados o no
 * Daniel Buendia 16-12-2017
 */



public class Ejercicio8 {
	public static void main (String[] args){
		int[] array = {1,2,3,4,5,6,7,8};
		boolean resultado;

		resultado = yaOrdenadoInt(array);
		System.out.print(resultado);

	}

	static boolean yaOrdenadoInt(int[] vector){
		boolean ordenado = true;
		int aux =0;

		for (int i = 1; i < vector.length; i++){
			aux = vector[i]-1; 	
			if (aux != vector[i-1]){
				ordenado = false;
				break;
			}
		}
		return ordenado;
	}


}
