package Arrays;
public class array1 {
	public static void main (String[] args){
		char[] array1 = {'a','b','c'};
		char[] array2 = {'a','d','a'};
		compararVectoresChar(array1, array2);
	}

	static void compararVectoresChar(char[] vector1, char[] vector2){
		for(int i=0; i<vector1.length;i++){
			System.out.print(vector2[i]);
		}

	}

}

