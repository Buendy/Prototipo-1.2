package practica211;
/**Ejercicio2.java
 * Programa que utiliza un array de 20 elemenos y los inicializa con el valor igual al indice correspondiente 
 * y lo multiplica por 5
 * Daniel Buendia 1-12-2017
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] miArray = new int[20]; //Declaramos y dimensionamos el array
		int resultado, numInicial = 0; //Establecemos las variables necesarias

		for (int i = 0;i < miArray.length; i++){
			resultado = numInicial * 5; 
			miArray[i] = resultado; //Inicializamos la variable
			numInicial++;

			System.out.print(" " + resultado);
		}		

	}

}
