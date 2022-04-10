package TicketSoporte;

public class Producto {

	//ATRIBUTOS O PROPIEDADES
	private String codigoProducto;
	private String nombreProducto;
	
	//CONSTRUCTORES
	public Producto() {
		
	}
	
	public Producto(String codigoProducto, String nombreProducto) {
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
	}

	//GETTERS Y SETTERS
	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
		
}