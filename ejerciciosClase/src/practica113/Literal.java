package practica113;
/**
 * Literal.java
 * En este programa establecemos variables con constantes literales
 * DBV - 2017.10.6
 */

public class Literal
{
	public static void main(String argumentos[])
	{	
				
	//VARIABLES QUE SI PODEMOS ESTABLECER CON LOS TIPOS DE DATOS	
		//Observamos que al establecer variables si no es correcta
		// nos indica cuál es la correcta
		
		double data = -11.1;
		double data1 = -88.28;
		String data2 = "cañón"; 
		int data3 = 0377; //Esta funciona con int,double,char,short,long,float
		int data4 = 9999;
		double data5 = +521.6;
		double data6 = 1.26;
		int data7 = 0xFE; //Esta funciona con int,double,char,short,long,float
		int data8 = 0b101010; //Esta también funciona con varios
		float data9 = 1.26f; //Este funciona con float y double
		int data10 = 1234; //Esta funciona con int,double,char,short,long,float
		double data11 = .567;
		int data12 = 0xFFFE; //Esta funciona con int,double,char,short,long,float
		String data13 = "a";
		double data14 = 02.45;
		char data15 = 'a';
		float data16 = 0xf; //Esta funciona con int,double,char,short,long,float
		String data17 = "abc;";
		String data18 = "abc'"; 
		String data19 = "true";
		boolean data20 = false;
		int data21 = '\\'; //Esta funciona con int,double,char,short,long,float
		
		
		
	
		//Constantes con los que no podemos establecer variables	
		//23e.2.3	099	‘\n’ while \xFE XGA 'abc' xF2E abc ab"c "abc "abc' a' True "abc"" ""abc""
		// True		
		//Muestra un mensaje en la pantalla
				System.out.println("ESTAS LITERALES FUNCIONAN:\n" + data + data1 + data2 + data3 + data4 );
				System.out.print(+ data5 + data6 + data7 + data8 + data9 +data10 + data11 + data12 + data13);
				System.out.print(+ data14 + data15 + data16 + data17 + data18 + data19 + data20 + data21);
				System.out.println("\nESTAS LITERALES NO FUNCIONAN:\n 23e.2.3 099 `\n´ while True XGA 'abc' abc a' \"abc \"abc' \"\"abc\"\" ");
	}

}