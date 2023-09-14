package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fecha;
	}
	
	public String nombre() {
		return this.nombre;
	}
	
	public LocalDate fechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public int edad() {
		int anioNacimiento = fechaDeNacimiento.getYear();
		int anioFechaHoy = LocalDate.now().getYear();
		return anioFechaHoy - anioNacimiento;
	}


/**
		1. Responder: Si un objeto cualquiera que le pide la edad a una Persona: 
			¿Conoce cómo ésta calcula u obtiene tal valor? 
			¿Cómo se llama el mecanismo de abstracción que permite esto?

		No, no conoce como se calcula, solamente obtiene el valor. A esto se le llama encapsulamiento.
*/

	public boolean menorQue(Persona p2) {
		return this.edad() < p2.edad();
	}
	
}	