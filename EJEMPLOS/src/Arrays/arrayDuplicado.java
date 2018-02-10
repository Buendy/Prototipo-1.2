package Arrays;
import java.util.Arrays;
public class arrayDuplicado {

	public static void main(String[] args) {
		int[] vector = {1, 2, 3, 4, 5};
		for (int i = 0; i < vector.length; i++) {
		      vector[i] = 2 * vector[i];
		}
		System.out.println(Arrays.toString(vector));


	}

}
