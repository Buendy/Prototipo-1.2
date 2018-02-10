package Arrays;
import java.util.Scanner;
import java.lang.Math;
public class arrayInvertido {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int[] vector = new int[n];
		boolean simetrico = true;
		for (int i = 0; i < n; i++) {
		vector[i] = teclado.nextInt();
		}
		for (int i = 0; i < (vector.length + 1) / 2; i++) {
		if (vector[i] != vector[n - i - 1]) {
		simetrico = false;
		break;
		}
		}
		int num = 2;
		int num2;
		
		
		System.out.println("¿Simétrico? " + simetrico);

		String[] vector2 = { "uno" , "dos" , "tres" , "cuatro" };
		System.out. println(java.util.Arrays.toString(vector2));

	}

	
	}


