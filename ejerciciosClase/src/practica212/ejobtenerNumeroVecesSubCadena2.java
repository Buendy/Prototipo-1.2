package practica212;
/**
 * Programa que compara dos cadenas de texto y nos indica las veces que se repite en una cadena el contenido de la otra ignorando las mayuculas.
 * @author Daniel 18.01.18
 */
public class ejobtenerNumeroVecesSubCadena2 {

	public static void main (String[] args){
		String cadena1= "Estamos viviendo en un submarino amarillo."
				+ " No tenemos nada que hacer. En el interior del submarino se está muy apretado. "
				+ "Así que estamos leyendo todo el día. Vamos a salir en 5 días";
		String cadena2="en";

		int resultado=obtenerNumeroVecesSubCadena(cadena1, cadena2);
		if (resultado == -2){
			System.out.println("No se han encontrado resultados para esa busqueda.");
		}
		else{
			System.out.println("La busqueda se repite " + resultado + " veces.");
		}

	}


	static int obtenerNumeroVecesSubCadena(String cadena1, String cadena2){
		int numVeces=0;
		
		for(int i=0;i<cadena1.length();i++){
			int posicion =cadena1.toLowerCase().indexOf(cadena2.toLowerCase(), i);
			if(posicion>=0){
				numVeces++;
				i = posicion + cadena2.length();
			}			
			
		}

		return numVeces;
	}
}
