package poo;

public class Coche {
	// Creamos las propiedades que van a tener los objetos
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;

	private String color;
	private int pesoTotal;
	private	int asientos;
	private boolean asientosCuero, climatizador;



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

	public String dimeDatosGenerales(){	//METODO GETTER
		return "La plataforma del vehículo tiene " + ruedas + " ruedas" +
		". Mide " + largo/1000 + " metros con un ancho " + ancho + 
		" cm y un pesod de plataforma de " + pesoPlataforma + " kg.";

	}

	public String anchoCoche(){	//METODO GETTER
		return "El ancho del coche es " + ancho;
	}

	public void estableceColor(String colorCoche){ //METODO SETTER
		color=colorCoche;
	}

	public String dimeColor(){
		return "El color del coche es " + color;
	}	

	public void configuraAsientos(String asientosCuero){
		if(asientosCuero.equalsIgnoreCase("si")){
			this.asientosCuero=true;
		}else {
			this.asientosCuero=false;
		}
	}

	public String dimeAsientos(){
		if(asientosCuero==true){

			return "El coche tiene asientos de cuero.";
		}else {
			return "El coche tiene asientos de serie.";
		}

	}

	public void configuraClimatizador(String climatizador){
		if(climatizador.equalsIgnoreCase("si")){
			this.climatizador=true;
		}
		else{
			this.climatizador=false;
		}
	}
	
	public String dimeClimatizador(){
		if(climatizador==true){
			return "El coche incorpora climatizador";
		}
		else{
			return "El coche no incorpora climatizador";
		}
	}
	
	public String dimePesoCoche(){ // METODO SETTER Y GETTER
		
		int pesoCarroceria=500;
		pesoTotal=pesoPlataforma+pesoCarroceria;
		if(asientosCuero==true){
			pesoTotal=pesoTotal+50;
		}
		if(climatizador==true){
			pesoTotal=pesoTotal+20;
		}
		return "El peso del coche es " + pesoTotal;
	}
	
	public int precioCohe(){
		
		int precioFinal=10000;
		
		if(asientosCuero==true){
			precioFinal+=2000;
		}
		
		if(climatizador==true){
			precioFinal+=1500;			
		}
		return precioFinal;
	}
	
}

