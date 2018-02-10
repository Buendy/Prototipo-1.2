


public class Try {
 static final int LIMITE_SUPERIOR = 10;
 static final int LIMITE_INFERIOR = -10;
 static final String CARACTER_BASE = "*";
 
public static void main(String argumentos[]){
		
	System.out.println(generarBarraHorizontal(9));
	System.out.println(generarBarraHorizontal(-2));
	System.out.println(generarBarraHorizontal(4));
	System.out.println(generarBarraHorizontal(-6));
	System.out.println(generarBarraHorizontal(10));
	System.out.println(generarBarraHorizontal(0));
	System.out.println(generarBarraHorizontal(10));
	System.out.println(generarBarraHorizontal(-11));
	System.out.println(generarBarraHorizontal(11));
	
	}



 /**
 * @param tamaño
 * @param caracter
 * Produce fila de caracteres de un tamaño asignado
 * @return bloque
 */
static String generarBloqueCaracteres(int tamaño,String caracter) {
	 
	String bloque="";
	for(int i=0;i<tamaño;i++) {
		
		bloque += caracter ;
	}
	
	return bloque;
}
 /**
 * @param tamaño
 * produce una fila completa formada por distintos caracteres 
 * @return bloque
 */
static String generarBarraHorizontal(int tamaño) {
		
	String bloque="";
	//validar datos
	 if (tamaño>=LIMITE_INFERIOR&&tamaño<=LIMITE_SUPERIOR) {
		 if (tamaño>0) {
			 bloque=	generarBloqueCaracteres(LIMITE_SUPERIOR, " ")+
					 "|"+
					 generarBloqueCaracteres(tamaño, "*");
			 return bloque;
		 }
		 if (tamaño<0) {
			 bloque=	generarBloqueCaracteres(LIMITE_SUPERIOR+tamaño, " ")+
					 generarBloqueCaracteres(-tamaño, "*")+
					 generarBloqueCaracteres(1, "|");
			 return bloque;
		 }
		 if(tamaño==0) {
			 bloque= generarBloqueCaracteres(LIMITE_SUPERIOR, " ")+
					 generarBloqueCaracteres(1, "|");
			 return bloque;
		 }
		
	 }
		 else {
			 bloque="FUERA DE RANGO";
			 return bloque;
		 }
		
	 return bloque;
	}


}
