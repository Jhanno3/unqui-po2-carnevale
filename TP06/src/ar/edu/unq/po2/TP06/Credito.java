package ar.edu.unq.po2.TP06;

public class Credito {
	
	protected Cliente cliente;
	protected Double monto;
	protected int plazoEnMeses;
	
	public Credito(int plazoEnMeses,Cliente cliente,Double monto) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazoEnMeses = plazoEnMeses;
	}
	
	public Boolean esSolicitudAceptable(CreditoPersonal credito) {
		return false;
	}
	
	public Double getSueldoAnualCliente() {
		return cliente.getSueldoAnual();
	}
	
}
