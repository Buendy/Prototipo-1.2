package Arrays;

public class arrayDistintaLongitud {

	public static void main(String[] args) {
		int [][] tabla = new int[3][];  // El tamaño de tabla es 3 filas indefinidas.
		tabla[0] = new int[4];          // La primera fila es de 4 elementos.
		tabla[1] = new int[2];          // La segunda fila es de 2 elementos.
		tabla[2] = new int[3];          // La tercera fila es de 3 elementos.
		// Primera fila (se podría hacer con un bucle).
		tabla[0][0] = 1;
		tabla[0][1] = 2;
		tabla[0][2] = 3;
		tabla[0][3] = 4;
		// Segunda fila. 
		tabla[1][0] = 5;
		tabla[1][1] = 6;
		// Tercera fila.
		tabla[2][0] = 7;
		tabla[2][1] = 8;
		tabla[2][2] = 9;


	}

}
