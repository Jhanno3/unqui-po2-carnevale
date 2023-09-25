package ar.edu.unq.po2.TP06;

import java.util.ArrayList;
import java.util.List;

public class Banco implements SistemaInformatico {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Credito> solicitudesDeCredito = new ArrayList<Credito>();
	private CreditoPersonal creditoPersonal;
	private CreditoHipotecario creditoHipotecario;
	
	
	public List<Credito> getSolicitudesDeCredito() {
		return solicitudesDeCredito;
	}



	public List<Cliente> getClientes() {
		return clientes;
	}

	

	public void solicitarCreditoPersonal(int plazoEnMeses, Cliente cliente, Double monto) {
		this.solicitudesDeCredito.add(new CreditoPersonal(plazoEnMeses,cliente,monto));
		creditoPersonal.esSolicitudAceptable(new CreditoPersonal(plazoEnMeses,cliente,monto));
		
	}



	public void solicitarCreditoHipotecario(int plazoEnMeses, Cliente cliente, Double monto,Propiedad garantia) {
		this.solicitudesDeCredito.add(new CreditoHipotecario(plazoEnMeses,cliente,monto,garantia));
		
	}



	@Override
	public void agregarClientes(Cliente cliente) {
		clientes.add(cliente);
		
	}



	@Override
	public void agregarSolicitudesDeCredito(Credito credito) {
		solicitudesDeCredito.add(credito);
		
	}



	@Override
	public void montoDeDineroADesembolsar() {
		
		
	}
	
	

	

}
