package practica211;
/**Ejercicio4.java
 * Programa que compara dos vectores e indica si son iguales o no
 * Daniel Buendia 15-12-2017
 */

public class Ejercicio4 {
	public static void main (String[] args){
		int[] array1 = {2,5,7,1,8,6,9,2,3,3};
		int[] array2 = {2,5,7,1,8,6,9,2,3,3};
		boolean aux = vectoresIntIguales(array1,array2);
		System.out.print(aux);
	}
	static boolean vectoresIntIguales(int[] vector1, int [] vector2) {
		boolean condicion=false;
		int contador = 0;	
		
		if (vector1.length == vector2.length){			
			for (int i=0; i < vector1.length; i++){
				if (vector1[i] == vector2[i])
					contador ++;				
			}
			if (contador == vector1.length)
				condicion = true;
		}		
		return condicion;
	}
}
