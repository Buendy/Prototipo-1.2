/**
 * FilasNumeros.java
 * Muestra 100 primeros números naturales en filas de 20 como máximo.
 * @author ajp - 2016.09.19
 */

import java.util.Scanner;

public class prueba {

	public static void main(String args[]) {

	}
	
	public int metodo(String str1, String str2) {
	    int len1 = str1.length();
	    int len2 = str2.length();
	    int lim = Math.min(len1, len2);

	    int k = 0;
	    while (k < lim) {
	        char c1 = str1.charAt(k);
	        char c2 = str2.charAt(k);
	        if (c1 != c2) {
	            return c1 - c2;
	        }
	        k++;
	    }
	    return len1 - len2;
	}

}