package ar.edu.unq.po2.TP06;

public class CreditoPersonal extends Credito {

	
	public CreditoPersonal(int plazoEnMeses,Cliente cliente,Double monto) {
		super(plazoEnMeses,cliente,monto);
	}
	
	
	public Boolean esSolicitudAceptable(CreditoPersonal credito) {
		return this.verificacionSueldoAnual() && this.verificacionSueldoMensual();
	}
	
	public Boolean verificacionSueldoAnual() {
		return cliente.getSueldoAnual() > 15000 ;
	}
	
	public Boolean verificacionSueldoMensual() {
		return this.monto < ((cliente.getSueldoNetoMensual()/100) *70) ;
	}
	
	
}
