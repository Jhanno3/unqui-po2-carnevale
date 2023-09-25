package ar.edu.unq.po2.TP06;

import java.util.ArrayList;
import java.util.List;

public class Banco implements SistemaInformatico {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private List<Credito> solicitudesDeCredito = new ArrayList<Credito>();
	private List<Credito> solicitudesDeCreditoHipotecarioAceptadas = new ArrayList<Credito>();
	private List<Credito> solicitudesDeCreditoPersonalAceptadas = new ArrayList<Credito>();
	private CreditoPersonal creditoPersonal;
	private CreditoHipotecario creditoHipotecario;
	
	
	public List<Credito> getSolicitudesDeCredito() {
		return solicitudesDeCredito;
	}


	public List<Cliente> getClientes() {
		return clientes;
	}

	
	public void solicitarCreditoPersonal(int plazoEnMeses, Cliente cliente, Double monto) {
		CreditoPersonal credito = new CreditoPersonal(plazoEnMeses,cliente,monto);
		this.solicitudesDeCredito.add(credito);
		if (creditoPersonal.esSolicitudAceptable(credito)) {
			this.agregarSolicitudesDeCreditoPersonalAceptadas(credito);
		}
		
	}


	public void solicitarCreditoHipotecario(int plazoEnMeses, Cliente cliente, Double monto,Propiedad garantia) {
		CreditoHipotecario credito = new CreditoHipotecario(plazoEnMeses,cliente,monto,garantia);
		this.solicitudesDeCredito.add(credito);
		if (creditoHipotecario.esSolicitudAceptable(credito)) {
			this.agregarSolicitudesDeCreditoHipotecarioAceptadas(credito);
		}
		
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
	public Double montoDeDineroADesembolsar() {	
		
		return (this.montoTotalSolicitudesDeCreditoHipotecarioAceptadas()) +(this.montoTotalSolicitudesDeCreditoPersonalAceptadas());
		
	}



	private Double montoTotalSolicitudesDeCreditoPersonalAceptadas() {
		Double aux = 0d;
		for(Credito credito : solicitudesDeCreditoPersonalAceptadas ) {
			aux += credito.monto;
		}
		return aux;
	}



	private Double montoTotalSolicitudesDeCreditoHipotecarioAceptadas() {
		Double aux = 0d;
		for(Credito credito : solicitudesDeCreditoHipotecarioAceptadas ) {
			aux += credito.monto;
		}
		return aux;
	}



	public List<Credito> getSolicitudesDeCreditoHipotecarioAceptadas() {
		return solicitudesDeCreditoHipotecarioAceptadas;
	}
	
	public List<Credito> getSolicitudesDeCreditoPersonalAceptadas() {
		return solicitudesDeCreditoPersonalAceptadas;
	}
	
	public void agregarSolicitudesDeCreditoHipotecarioAceptadas(CreditoHipotecario credito) {
		solicitudesDeCreditoHipotecarioAceptadas.add(credito);
	}
	
	public void agregarSolicitudesDeCreditoPersonalAceptadas(CreditoPersonal credito) {
		solicitudesDeCreditoPersonalAceptadas.add(credito);
	}
	

}
