package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	private Multioperador multioperar;
	
	@BeforeEach
	public void setUp() throws Exception {
		multioperar = new Multioperador();
		
		multioperar.agregarNumerosAMultioperar(2);
		multioperar.agregarNumerosAMultioperar(2);
		multioperar.agregarNumerosAMultioperar(2);
		multioperar.agregarNumerosAMultioperar(4);
		
	}
	
	
	@Test
	public void testSuma() {
		int suma = multioperar.suma();
		assertEquals(suma,10);
	}
	
	@Test
	public void testResta() {
		int resta = multioperar.resta();
		assertEquals(resta,-10);
	}
	
	@Test
	public void testMultiplicar() {
		int multiplicacion = multioperar.multiplicacion();
		assertEquals(multiplicacion,32);
	}

}
