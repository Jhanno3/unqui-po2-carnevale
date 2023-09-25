package ar.edu.unq.po2.TP06;

public class CreditoHipotecario extends Credito {

	private Propiedad garantia;
	
	public CreditoHipotecario(int plazoEnMeses,Cliente cliente,Double monto,Propiedad garantia) {
		super(plazoEnMeses,cliente,monto);
		this.garantia = garantia;
	}
	
	@Override
	public Boolean esSolicitudAceptable(CreditoPersonal credito) {
		return this.verificacionEdad() && this.verificacionSueldoMensual() && this.verificacionMontoTotal();
	}
	
	private boolean verificacionMontoTotal() {
		Double valor70Garantia = (garantia.getValorFiscal()/100) *70;
		return valor70Garantia < monto;
	}

	public int plazoEnAños() {
		return plazoEnMeses / 12;
	}
	
	public boolean verificacionEdad() {
		return cliente.getEdad() + this.plazoEnAños() < 65 ;
	}
	
	public boolean verificacionSueldoMensual() {
		return monto < ((cliente.getSueldoNetoMensual()/100) *50) ;
	}
	
}
