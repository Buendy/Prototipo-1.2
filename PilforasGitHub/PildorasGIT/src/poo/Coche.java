package poo;

public class Coche {
	// Creamos las propiedades que van a tener los objetos
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;

	String color;
	int pesoTotal;
	int asientos;
	boolean asientosCuero, climatizador;



	public Coche(){
		// Le damos valor a las propiedades/atributos
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;

	}


	/** METODO GETTER QUE DEVUELVE UN VALOR
	 * Devolver el valor de las propiedades de los objetos
	 *  public dato_a_devolver nombre_metodo(){ codigo + return}*/

	public String largoCoche(){	//METODO GETTER
		return "El largo del coche es " + largo;
	}

	public String anchoCoche(){	//METODO GETTER
		return "El ancho del coche es " + ancho;
	}

	public void estableceColor(){ //METODO SETTER
		color="azul";
	}

	public String dimeColor(){
		return "El color del coche es " + color;
	}	
}

