import java.util.Scanner;
public class evaluaEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad;
		Scanner teclas= new Scanner(System.in);

		System.out.println("Dime tu edad");
		edad=teclas.nextInt();

		if(edad<18){
			System.out.println("Eres un adolescente");
		}

		else if(edad<45){
			System.out.println("Eres joven");
		}

		else if(edad<65){
			System.out.println("Eres maduro");
		}

		else {
			System.out.println("Cuidate");
		}

	}

}
