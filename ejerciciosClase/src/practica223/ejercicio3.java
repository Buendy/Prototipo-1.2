package practica223;
import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio3 {
	private static String dato;

	public static String getDato() {
		return dato;
	}

	public static void setDato(String dato) {
		ejercicio3.dato = dato;
	}

	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		ejercicio3 texto = new ejercicio3();

		System.out.println("Dime la posición del indice:");
		int indice=teclado.nextInt();
		System.out.println("Dime un objeto a meter en la lista:");
		texto.setDato(teclado.nextLine());


	}

	public void add(int indice, Object dato){
		
		ArrayList<String> listaCompra = new ArrayList<String>();
		listaCompra.add("Leche");
		listaCompra.add("Miel");
		listaCompra.add("Aceitunas");
		
		for(int i=0; i<listaCompra.size();i++){
			System.out.println(listaCompra.get(i));
		}

		listaCompra.add(indice, dato);

	}


	
	
	/**
	//public static void main(String[] args){
		//listaArray listaCompra = new listaArray();
		//li/aCompra.add("Leche");
		//listaCompra.add("Miel");
		//listaCompra.add("Aceitunas");
	//	listaCompra.remove("Aceitunas");
		listaCompra.add(1, "Fruta");
		listaCompra.add(0, "Queso");
		listaCompra.add(5, "Verduras");

		System.out.format("Los %d elementos de la lista de la compra son:\n",  listaCompra.size());
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.format("%s\n", listaCompra.get(i));
		}
		System.out.format("¿Hay pan en la lista? %b", listaCompra.contains("Pan"));
	}
*/
}
