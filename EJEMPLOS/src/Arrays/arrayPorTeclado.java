package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class arrayPorTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int numeroElementos = new Scanner(System.in).nextInt();
		int[] myArray = new int[numeroElementos];

		for (int i=0; i < myArray.length; i++) { 
			myArray[i] = i+1;             // Asigna valor a cada elemento.
		}       

		System.out.println(myArray);


	}

}
