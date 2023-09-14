package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;


class CounterTestCase {
	private Counter counter;
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		//Se agregan los numeros. Un solo par y nueve impares
		counter.agregarNumeros(1);
		counter.agregarNumeros(3);
		counter.agregarNumeros(5);
		counter.agregarNumeros(7);
		counter.agregarNumeros(9);
		counter.agregarNumeros(1);
		counter.agregarNumeros(1);
		counter.agregarNumeros(1);
		counter.agregarNumeros(1);
		counter.agregarNumeros(4);
	}
	/**
	* Verifica la cantidad de pares
	*/
	@Test
	public void testNumerosPares() {
		// Getting the even occurrences
		int amount = counter.contarPares();
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	@Test
	public void testNumerosImpares() {
		int amount = counter.contarImpares();
		assertEquals(amount, 9);
	}
	@Test
	public void testCantidadDeMultiplosDe() {
		int amount = counter.cantidadDeMultiplosDe(2);
		assertEquals(amount, 1);
	}
	
	public void testmultiplosDe() {
		int amount = counter.multiplosDe(3,9);
		assertEquals(amount, 999);
	}
	
	
}
