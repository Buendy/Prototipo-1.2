package practica212;
public class ejReemplazarPalabras2 {

	public static void main(String[] args) {

		StringBuilder texto1 = new StringBuilder("Oracle ha anunciado hoy su nueva generación de compilador Java hoy. "
				+ "Utiliza analizador avanzado y optimizador especial para la JVM de Oracle");

		StringBuilder texto2 = new StringBuilder("JVM,Java,Oracle");	

		String reemplazado=reemplazarPalabras(texto1, texto2);
		System.out.print(reemplazado);
	}


	static String reemplazarPalabras(StringBuilder texto1,  StringBuilder texto2){
		String resultado = "";
		String text1 =texto1.toString();
		String text2 =texto2.toString();
		String aux1="", aux2="", aux3="";

		String[] palabrasSeparadas=text2.split(",");

		for(int i=0; i < palabrasSeparadas.length; i++){
			int index=0;
			for(int j=0;j<palabrasSeparadas[i].length();j++){
				aux1+= "*";		
			}
			resultado = text1.replaceAll(palabrasSeparadas[i], aux1);
		System.out.println(resultado);
		System.out.println(aux1);
		aux1="";
		}
		
		//for(int i=0;i<palabrasSeparadas[0].length();i++){
		//	aux1+= "*";		
		//}
		
		//for(int j=0; j<palabrasSeparadas[1].length(); j++){
			//aux2+= "*";
		//}

		//for(int k=0; k<palabrasSeparadas[2].length(); k++){
			//aux3+= "*";
		//}

		//String aux4 = text1.replaceAll(palabrasSeparadas[0], aux1);
		//String aux5 = aux4.replaceAll(palabrasSeparadas[1], aux2);
		//resultado = aux5.replaceAll(palabrasSeparadas[2], aux1);
		
		return resultado;
	}

}
