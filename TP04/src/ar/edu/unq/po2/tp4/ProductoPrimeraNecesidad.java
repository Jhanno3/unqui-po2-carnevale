package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
		
	private int porcentajeDescuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio,Boolean esPrecioCuidado, int porcentajeDescuento) {
		super(nombre,precio,esPrecioCuidado);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	public Double getPrecio() {
		return this.precio*this.porcentajeDescuento;			
	}
	
	
	
}
