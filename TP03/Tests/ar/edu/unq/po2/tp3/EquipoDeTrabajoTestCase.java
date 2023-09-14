package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {
	private EquipoDeTrabajo equipoDeTrabajo;
	private Persona persona,persona2,persona3,persona4,persona5;
	ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	
	
	@BeforeEach
	public void setUp() throws Exception {
		persona = new Persona("Facundo",LocalDate.of(2000, 5, 28));
		persona2 = new Persona("Agus",LocalDate.of(1999, 7, 29));
		persona3 = new Persona("Ale",LocalDate.of(1999, 7, 25));
		persona4 = new Persona("Ian",LocalDate.of(2001, 11, 14));
		persona5 = new Persona("Fabri",LocalDate.of(2001, 3, 30));
        listaPersonas.add(persona);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);

		
		
		equipoDeTrabajo = new EquipoDeTrabajo("YPF", listaPersonas);	
	}
	
	@Test
	public void testNombre() {
		assertEquals(equipoDeTrabajo.nombre(),"YPF");
	}
	
	@Test
	public void testPromedioDeEdad() {
		System.out.print(equipoDeTrabajo.promedioEdadIntegrantes());
	}
}
