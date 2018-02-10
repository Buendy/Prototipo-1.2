package practica113;
/**
 * literal.java
 * En este programa establecemos variables de tipo envoltorio
 * DBV - 2017.10.6
 */

public class Literal2
{
	public static void main(String argumentos[])
	{	
				
	//Hemos establecido las siguentes variables de tipo envoltorio
	// con los diferentes tipos de objeto	
		double data = new Double (-11.1);
		double data1 = -88.28;
		Integer data3 = new Integer (0377); 
		Integer data4 = new Integer (9999);
		double data5 = new Double (+521.6);
		double data6 = new Double (1.26);
		Integer data7 = new Integer (0xFE); //Aquí nos deja con Integer, Double y Float
		Integer data8 = new Integer (0b101010);
		float data9 = new Float (1.26f); //Aquí nos deja con Float y Double 
		Integer data10 = new Integer (1234); //Aquí nos deja con Integer, Float y Double 
		double data11 = new Double (.567);
		Integer data12 = new Integer (0xFFFE); 
		String data13 = "a"; //Las cadenas no nos deja
		double data14 = new Double (02.45);
		Integer data15 = new Integer ('a');
		float data16 = new Float (0xf); 
		boolean data20 = new Boolean (false);
		Integer data21 = new Integer ('\\');
		
		//Estas variables no nos da error al establecerlas
		//Nos da error cuando ejecutamos el programa
		float data2 = new Float ("cañon");
		double data17 = new Double ("abc;");
		Integer data18 = new Integer ("abc'"); 
		float data19 = new Float ("true");
		
	
		//Con estas constantes tampoco podemos estableces variables de tipo envoltorio	
		//23e.2.3	099	‘\n’ while \xFE XGA 'abc' xF2E abc ab"c 
		//"abc "abc' a' True "abc"" ""abc""
		System.out.print("FUNCIONA!!");
						
	}

}