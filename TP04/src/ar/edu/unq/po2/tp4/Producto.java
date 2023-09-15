package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String  nombre;
	protected Double  precio;
	private Boolean esPrecioCuidado;
	
	public Producto(String nombre,Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Producto(String nombre,Double precio,Boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public Boolean esPrecioCuidado() {
		return this.esPrecioCuidado;
	}
	
	public Double aumentarPrecio(Double aumentarPrecio) {
		return (this.precio + aumentarPrecio);
	}
	
}

