package ar.edu.unq.po2.TP06;

public class Propiedad {

	private String descripcion;
	private String direccion;
	private Double valorFiscal;
	
	public Propiedad(String descripcion,String dir,Double valorFiscal) {
		this.descripcion = descripcion;
		this.direccion = dir;
		this.valorFiscal = valorFiscal;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public Double getValorFiscal() {
		return this.valorFiscal;
	}
	
}
