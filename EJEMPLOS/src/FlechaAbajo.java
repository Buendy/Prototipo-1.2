
/**
 * FlechaAbajo.java
 * Programa que muestra una flecha de caracteres apuntada hacia abajo.
 * Utiliza dos métodos para generar la punta y la espiga.
 * ajp - 2015.11.15
 */

public class FlechaAbajo {

    public static void main(String[] arg) {
        
    	final int NUMERO_LINEAS = 14;

        String flecha = generarEspiga(NUMERO_LINEAS / 2)
                        + generarPuntaAbajo(NUMERO_LINEAS / 2);
        System.out.println(flecha);
    }

    /**
     * Genera con caracteres, una espiga rectangular.
     * Utiliza un método auxiliar.
     * @param filas, número de filas a generar.
     * @return espiga, de caracteres.
     */
    static String generarEspiga(int filas) {
        
    	String espiga = "";

        // Base del rectángulo
        espiga += generarBloqueCaracteres(filas, " ")
                  + generarBloqueCaracteres(2, "_") + "\n";

        // genera espiga
        for (int i = 0; i < filas - 2; i++) {
            espiga += generarBloqueCaracteres(filas - 1, " ")
                      + "|" + generarBloqueCaracteres(2, " ") + "|" + "\n";
        }
        return espiga;
    }

    /**
     * Genera con caracteres, una punta de flecha hacia abajo.
     * Utiliza un método auxiliar.
     * @param filas, número de filas a generar.
     * @return punta, de caracteres.
     */
    static String generarPuntaAbajo(int filas) {
        
    	String punta = "";

        // Base del triángulo.
        punta += generarBloqueCaracteres(1, " ")
                 + generarBloqueCaracteres(filas * 2, "-") + "\n";

        // Punta triangular.
        for (int i = 0; i < filas; i++) {
            punta += generarBloqueCaracteres(i + 1, " ")
                     + "\\" + generarBloqueCaracteres((filas - i - 1) * 2, " ") + "/" + "\n";
        }
        return punta;
    }

    /**
     * Genera un bloque de tamaño variable de caracteres iguales.
     * @param longitud, el tamaño del bloque.
     * @param textoBase.
     * @return resultado, el texto obtenido.
     */
    static String generarBloqueCaracteres(int longitud, String textoBase) {
        String resultado = "";
        for (int i = 0; i < longitud; i++) {
            resultado += textoBase;
        }
        return resultado;
    }

} //class

