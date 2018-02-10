package practica211;
/**Ejercicio6.java
 * Programa que indica los valores consecutivos de un array
 * Daniel Buendia 16-12-2017
 */
public class Ejercicio6 {
	public static void main (String[] args){
		int[] miarray = {2,2,1,1,3,3,3,3,1,1,2,2,2};
		int num;
		num = maximoIntConsecutivos(miarray);
		System.out.print(num);
	}
	static int maximoIntConsecutivos(int[] vector){
		int contador = 0;
		int aux =0;	
		int aux1=0;
		
		for (int i=1; i < vector.length; i++){
		 if (vector[i] == vector[i-1]){
		 aux = contador + 1 ;
		 aux1 += aux;		 
		 }		
			}
		return aux1;
	}
	

}
