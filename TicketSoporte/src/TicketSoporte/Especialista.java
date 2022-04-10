package TicketSoporte;

public class Especialista {
	
	//ATRIBUTOS O PROPIEDADES
	private String rutEspecialista;
	private String nombreEspecialista;
	
	//CONSTRUCTORES
	public Especialista() {
		
	}

	public Especialista(String rutEspecialista, String nombreEspecialista) {
		this.rutEspecialista = rutEspecialista;
		this.nombreEspecialista = nombreEspecialista;
	}

	//GETTERS Y SETTERS
	public String getRutEspecialista() {
		return rutEspecialista;
	}

	public void setRutEspecialista(String rutEspecialista) {
		this.rutEspecialista = rutEspecialista;
	}

	public String getNombreEspecialista() {
		return nombreEspecialista;
	}

	public void setNombreEspecialista(String nombreEspecialista) {
		this.nombreEspecialista = nombreEspecialista;
	}
	
}