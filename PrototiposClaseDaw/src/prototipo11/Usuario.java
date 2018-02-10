package prototipo11;
/** Proyecto: Juego de la vida.
 *  Implementa el concepto de Usuario seg�n el modelo1.
 *  En esta versi�n no se han aplicado la mayor�a de los est�ndares 
 *  de dise�o OO dirigidos a conseguir un "c�digo limpio". 
 *  La implementaci�n es la m�s b�sica posible con el fin ilustrar 
 *  c�mo se evoluciona desde una versi�n con mal dise�o.
 *  Se pueden detectar varios defectos y antipatrones de dise�o:

 *  	- Obsesi�n por los tipos primitivos.  
 *  @since: prototipo1.0
 *  @source: Usuario.java 
 *  @version: 1.1 - 2017/11/29 
 *  @author: DBV
 */

public class Usuario {	
	// Atributos	
	private String nif;
	private String nombre;
	private String apellidos;
	private String idUsr;
	private String domicilio;
	private String correo;
	private String fechaNacimiento;
	private String fechaAlta;
	private String claveAcceso;
	private String rol;

	public Usuario(){
		this("00000000A", "Nombre", "Apellido Apellido",
				"Domicilio", "correo@cooreo.com", "2000.12.21",
				"2018.01.31", "Miau#0", "NORMAL" );
	}



	/**
	 *  Constructor por defecto
	 */	
	public Usuario(String nif, String nombre, String apellidos,
			String domicilio, String correo, String fechaNacimiento,
			String fechaAlta, String claveAcceso, String rol) {
		setNif(nif);
		setNombre(nombre);
		setApellidos(apellidos);
		generarIdUsr();
		setDomicilio(domicilio);
		setCorreo(correo);
		setFechaNacimiento(fechaNacimiento);
		setFechaAlta(fechaAlta);
		setClaveAcceso(claveAcceso);
		setRol(rol);
	}

	private void generarIdUsr() {
		assert nif != null;
		assert nombre != null;
		assert apellidos != null;

		idUsr = "" +  nombre.charAt(0)
				+ apellidos.charAt(0) 
				+ apellidos.charAt(apellidos.indexOf(" ")+1)
				+ nif.substring(7);

	}

	private void generarVarianteIdUsr(){
		//assert idUsr != null;
		String alfabetoNif= "ABCDEFGHJKLMNOPQRSTVWXYZ";
		String alfabetoNifDesplazado = "BCDEFGHJKLMNOPQRSTVWXYZA";
		idUsr = idUsr.substring(0, 4) + alfabetoNifDesplazado.charAt(alfabetoNif.indexOf(idUsr.charAt(4)));
	}



	/**
	 *  Constructor copia
	 */		
	public Usuario(Usuario usuario) {
		nif = new String(usuario.nif);
		nombre = new String(usuario.nombre);
		apellidos = new String(usuario.apellidos);
		idUsr = new String (usuario.idUsr);
		domicilio = new String(usuario.domicilio);
		correo = new String(usuario.correo);
		fechaNacimiento = new String(usuario.fechaNacimiento);
		fechaAlta = new String(usuario.fechaAlta);
		claveAcceso = new String(usuario.claveAcceso);
		rol = new String(usuario.rol);
	}

	public String getNif() {

		return nif;
	}

	public void setNif(String nif) {

		
			this.nif = nif;
	

	}

//	private boolean nifValido(String nif2) {
	//	assert nif != null;
	//	return nif.matches("^[\\d]{8}[ABCDEFGHJKLMNPQRSTVWXYZ]$");
	//}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		
			this.nombre = nombre;
		
	}
	
	//private boolean nombreValido(String nombre){
	//	assert nombre != null;
	//	return nombre.matches("^[A-Z������][a-z������]+");
	//}
	
	

	public String getIdUsr(){
		return idUsr;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public String getDomicilio() {
		return domicilio;
	}



	public void setDomicilio(String domicilio) {
		
		this.domicilio = domicilio;
	
	}
	
//	private boolean domicilioValido(String domicilio){
	//	assert domicilio != null;
	//	return domicilio.matches("[A-Z������a-z������\\.,/\\d ] +");
//	}



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public String getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getFechaAlta() {
		return fechaAlta;
	}



	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}



	public String getClaveAcceso() {
		return claveAcceso;
	}



	public void setClaveAcceso(String claveAcceso) {
		this.claveAcceso = encriptarCesar(claveAcceso);
	}



	private String encriptarCesar(String claveEnClaro) {
		String alfabetoNormal = "ABCDEFGHIJKLMN�OPQRSTUVWXYZ"
				+ "abcdefghijklmn�opqrstuvwxyz"
				+ "0123456789"
				+ "$%&/+*-#";
		String alfabetoDesplazado = "EFGHIJKLMN�OPQRSTUVWXYZ"
				+ "abcdefghijklmn�opqrstuvwxyz"
				+ "0123456789"
				+ "$%&/+*-#ABCD";		

		StringBuilder claveEncriptado = new StringBuilder();
		for(int i = 0;i<claveEnClaro.length(); i++){
			System.out.println(claveEnClaro.charAt(i));
			claveEncriptado.append(
					alfabetoDesplazado.charAt(
							alfabetoNormal.indexOf(
									claveEnClaro.charAt(i))));
		}

		return claveEncriptado.toString();
	}



	public String getRol() {
		return rol;
	}



	public void setRol(String rol) {
		this.rol = rol;
	}

	/**
	 * Redefine el m�todo heredado de la clase Objecto.
	 * @return el texto formateado del estado -valores de atributos- de objeto de la clase Usuario.  
	 */
	@Override
	public String toString() {
		return String.format(
				"%-18s %s\n"
						+ "%-18s %s\n"
						+ "%-18s %s\n"
						+ "%-18s %s\n"
						+ "%-18s %s\n"
						+ "%-18s %s\n"
						+ "%-18s %s\n"
						+ "%-18s %s\n"
						+ "%-18s %s\n"
						+ "%-18s %s\n",
						"nif:", nif, "nombre:", nombre, "apellidos:", apellidos, "idUsr:", idUsr,
						"domicilio:", domicilio, "correo:", correo, "fechaNacimiento:", fechaNacimiento,
						"fechaAlta:", fechaAlta, "claveAcceso:", claveAcceso, "rol", rol);


		//) + "\n" 			// Incluye identificador de objeto.
		//+"\n nif: \t\t" + nif
		//	+ "\n nombre: \t" + nombre
		//+ "\n apellidos: \t" + apellidos
		//	+ "\n idUsr: \t" + idUsr
		//	+ "\n domicilio: \t" + domicilio 
		//	+ "\n correo: \t" + correo
		//	+ "\n fechaNacimiento:" + fechaNacimiento
		//	+ "\n fechaAlta: \t" + fechaAlta 
		//	+ "\n claveAcceso: \t" + claveAcceso
		//	+ "\n rol: \t\t" + rol;
	}


} // class