package practica123;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int multiplo = 3;                        //Inicializaci�n
		
		System.out.println("Cargando... ");
		try {
			Thread.sleep(1500);
						} catch (Exception ignored) {}
			
		System.out.println("M�ltiplos de 3 menores de 1000...");
		try {
			Thread.sleep(1500);
						} catch (Exception ignored) {}
		
		
		while (multiplo <= 3000) {               //Control de continuaci�n
			try {
				Thread.sleep(100);
							} catch (Exception ignored) {}
			System.out.println(multiplo+ "\n");     //Cuerpo 
		    multiplo += 3;                    //Actualizaci�n de iteraci�n
		}

	}

}
