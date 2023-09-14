package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTestCase {
	private Persona persona,persona2;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		persona = new Persona("Facundo",LocalDate.of(2000, 5, 28));
		persona2 = new Persona("Agus",LocalDate.of(1999, 7, 29));
	}
												
	@Test
	public void testNombre() {
		assertEquals(persona.nombre(),"Facundo");
	}
	
	@Test 
	public void testFecha() {
		assertEquals(persona.fechaDeNacimiento(),LocalDate.of(2000, 5, 28));
	}
	
	@Test
	public void testEdad() {
		assertEquals(persona.edad(),23);
	}
	
	@Test 
	public void testMenorQue() {
		assertTrue(persona.menorQue(persona2));
	}
	
}
