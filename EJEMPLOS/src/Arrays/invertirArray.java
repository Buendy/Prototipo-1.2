package Arrays;
import java.util.Arrays;

		
		 
		public class invertirArray {    
		         public static void main(String[] args) {
		           int[] vector = { 1, 2, 3, 4, 5 };
		 
		           // Obtiene el tamaño del array.
		           int longitud = vector.length ;
		 
		           // Declara y crea un array para el resultado.
		           int[] inverso = new int[longitud];
		 
		           // Inicializa el array inverso.
		           for (int i = 0; i < longitud; i++) {
		                  inverso[longitud - i - 1] = vector[i];
		           }
		           
		           // Muestra el array inverso.
		           System.out.println(Arrays.toString(inverso));
		      }
		}


