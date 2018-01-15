package poo;

public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche Renault=new Coche(); // Instanciar una clase. Ejemplar de clase
		Coche Seat=new Coche(); // Instanciar una clase. Ejemplar de clase

		//System.out.print("Este coche tiene " + Renault.ruedas + " ruedas.");
		System.out.println(Renault.largoCoche());
		System.out.println(Renault.anchoCoche());

		Seat.dimeColor();
		System.out.println(Seat.dimeColor());
		
		
	}

}
