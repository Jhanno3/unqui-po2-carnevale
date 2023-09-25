package ar.edu.unq.po2.TP06;

public class Cliente {
	
	private Banco banco;
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private Double sueldoNetoMensual;
	private Propiedad propiedad;
	
	public Cliente (String nombre,String apellido,String direccion,int edad,Double sueldoNetoMensual,Propiedad propiedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.propiedad = propiedad;
	}
	
	public Double getSueldoAnual(){
		return this.sueldoNetoMensual * 12;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String direccion() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public Double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	
	public void pedirCreditoHipotecario(int plazoEnMeses,Double monto,Propiedad garantia) {
		banco.solicitarCreditoHipotecario(plazoEnMeses,this,monto,garantia);
	}
	
	public void pedirCreditoPersonal(int plazoEnMeses,Double monto){
		banco.solicitarCreditoPersonal(plazoEnMeses,this,monto);
	}

	public String getDireccion() {
		return direccion;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}
	
}
