import java.util.Scanner;
public class Pildoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//double num = 5.85;
		//int num2;
		String nombre="";
		
	
		//num2 =(int)Math.round(num);
		//System.out.println(num2);
		
		System.out.print("Dime tu nombre: ");
		nombre = teclado.nextLine();
		//String miNombre= "Daniel";
		int ultima_letra = nombre.length();
		
		System.out.println("Tu nombre es " + nombre);
		System.out.println("Tu nombre tiene " + nombre.length() + " letras");
		System.out.println("La primera letra de tu nombre es " + nombre.charAt(0));
		System.out.println("La ultima letra de tu nombre es " + nombre.charAt(ultima_letra-1));
		

	}

}
