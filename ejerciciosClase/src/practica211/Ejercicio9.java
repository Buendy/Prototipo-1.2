package practica211;

public class Ejercicio9 {
	public static void main (String[] args){
		int[] array = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3};
		
	}
	
	static int masFrecuenteInt (int[] vector){
		int frecuente=0;
		int aux1, aux2, aux3;
		for (int i =0; i < vector.length; i++){
			aux1 = vector[i];
			for(int j=0; j <vector.length; j++){
				if(aux1 == vector[i]){
					frecuente++;
				}
			}
		}
		System.out.print(frecuente);
			
		
		
		return frecuente;
	}

}
