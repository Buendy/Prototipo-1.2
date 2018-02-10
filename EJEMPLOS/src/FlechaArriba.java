
public class FlechaArriba {
	final static int TOTAL_LINEAS = 19;

	public static void main(String[]args) {
		String flecha = generarFlechaArriba (TOTAL_LINEAS/2);
		System.out.println(flecha);

	}
	static String generarFlechaArriba(int filas){
		String flecha="";

		//Punta triangular
		for (int i=0; i<filas-1; i++){
			flecha += generarBloqueCaracteres(filas-i," ")
					+ "*" + generarBloqueCaracteres(i*2-1," ");

			if (i!=0){
				flecha +="*";
			}
			flecha += "\n";
		}
		flecha += generarBloqueCaracteres(1," ")
				+ generarBloqueCaracteres(filas, "* ") + "\n";

		for (int i = 0; i < filas; i++){
			flecha += generarBloqueCaracteres(filas, " ") + "\n";
		}
		return flecha;
	}
	static String generarBloqueCaracteres(int longitudBloque, String textoBase){
		String bloqueTexto= "";
		for (int i = 0; i < longitudBloque; i++){
			bloqueTexto += textoBase;
		}
		return bloqueTexto;
	}
}
