import javax.swing.*;
public class pesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String genero="";
		int altura;
		int pesoIdeal=0;
	
		
		do{
			genero=JOptionPane.showInputDialog("Introduce tú género (H/M)");
		}
		while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm "));
		if(genero.equalsIgnoreCase("H")){
			pesoIdeal=altura-110;
		}
		
		else if (genero.equalsIgnoreCase("M")){
			pesoIdeal=altura-120;
		}
		System.out.println("Tu peso ideal es " + pesoIdeal);
		
	}

}
