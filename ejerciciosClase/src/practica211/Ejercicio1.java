package practica211;
/**Ejercicio1.java
 * Programa que utiliza un array de 10 elemenos y los inicializa con el valor 7
 * Daniel Buendia 1-12-2017
 */

public class Ejercicio1 {

	public static void main(String[] args) {

		int Arraymio[]; //Declaramos el array

		Arraymio = new int[10]; //Le indicamos la longitud del array		
		for (int i=0; i < Arraymio.length; i++) { 
			Arraymio[i] = 7; //Asignamos un valor a cada elemento
			System.out.print(" " + Arraymio[i]); //Mostramos por pantalla los elementos con el valor indicado
		}     
		

	}

}
