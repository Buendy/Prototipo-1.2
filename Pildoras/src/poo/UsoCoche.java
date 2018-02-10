package poo;
import javax.swing.JOptionPane;


public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche Renault=new Coche(); // Instanciar una clase. Ejemplar de clase
		Coche Seat=new Coche(); // Instanciar una clase. Ejemplar de clase

		//System.out.print("Este coche tiene " + Renault.ruedas + " ruedas.");
		System.out.println(Renault.dimeDatosGenerales());
		System.out.println(Renault.anchoCoche());

		Renault.estableceColor(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(Renault.dimeColor());
		
		Renault.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero"));
		System.out.println(Renault.dimeAsientos());
		
		Renault.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador"));
		System.out.println(Renault.dimeClimatizador());
		
		System.out.println(Renault.dimePesoCoche());
		System.out.println("El precio final del coche es " + Renault.precioCohe());
	}

}
