package autoevaluacion153;

	

public class CopyOfAutoevaluacion3 {
	public static void main (String arg[]){ // Hola
		int a = 9, b = -2, c = 4, d = -6, e = -10, f = 0, g = 10, h = -11, i = 11;
		//final String CARACTER_BASE="*";
		generarBloqueCaracteres(a,generarBarraHorizontal(a));
		generarBloqueCaracteres(b,generarBarraHorizontal(b));
		generarBloqueCaracteres(c,generarBarraHorizontal(c));
		generarBloqueCaracteres(d,generarBarraHorizontal(d));
		generarBloqueCaracteres(e,generarBarraHorizontal(e));
		generarBloqueCaracteres(f,generarBarraHorizontal(f));
		generarBloqueCaracteres(g,generarBarraHorizontal(g));
		generarBloqueCaracteres(h,generarBarraHorizontal(h));
		generarBloqueCaracteres(i,generarBarraHorizontal(i));
		
	} // main

	static String generarBarraHorizontal(int numero){
		final String CARACTER_BASE="*";
		String espacios = "", asteriscos = "", barra = "|", aux, salida = "";
		if (numero > 0){
			for (int a = 0; a < 10; a++){
				espacios += " ";
			}
			aux = espacios + barra;
			for (int b= 0; b < numero; b++){
				asteriscos += CARACTER_BASE;
			}
			salida = aux + asteriscos;
		}
		if (numero == 0){
			for (int a = 0; a < 10; a++){
				espacios += " ";
			}
			salida = espacios + barra;
		}
		if (numero < 0){
			for (int c = -10; c < numero; c++){ // Pongo -10 para los espacios y para no pasar el numero negativo a positivo
				espacios += " ";
			}
			for (int d = numero; d < 0; d++){
				asteriscos += "*";
			}
			salida = espacios + asteriscos + barra;
		}
		
		return salida;
		
	} // generarBloqueCaracteres
	
	static void generarBloqueCaracteres(int numero, String salida){
		final int LIMITE_SUPERIOR=10;
		final int LIMITE_INFERIOR=-10;
	if (numero > -9 && numero <-1){
		System.out.println(numero + "   " + salida);
	}
	else if (numero == 0){
		System.out.println(" " + numero + "   " + salida);
	}
	else if (numero > 0 && numero < 10){
		System.out.println(" " + numero + "   " + salida);
	}
	else if (numero == LIMITE_SUPERIOR){
		System.out.println(" " + numero + "  " + salida);
	}
	else if (numero == LIMITE_INFERIOR){
		System.out.println(numero+ "  " + salida);
	}
	else {
		System.out.println(numero + "  FUERA DE RANGO");
	}
	} // generarBarraHorizontal
} // class