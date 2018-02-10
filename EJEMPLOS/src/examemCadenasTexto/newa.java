package examemCadenasTexto;

public class newa {
	public static void main (String args[]){
		//String s = "Mundo Java";
		char[] array;
		String hola = "Hola1234";
		array =hola.toCharArray();
		
		
		for(int i =0; i<array.length; i++){
			System.out.print(array[i]);
			
			}
		System.out.println();
		
		
		for(int i =0; i<array.length; i++){
		System.out.println("Posición: [" + i + "] " + array[i]);
		
		}
	}
}
