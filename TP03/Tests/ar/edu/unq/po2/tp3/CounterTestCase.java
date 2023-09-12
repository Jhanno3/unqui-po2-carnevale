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
		// Getting the even occurrences
		int amount = counter.contarImpares();
		// I check the amount is the expected one
		assertEquals(amount, 9);
	}
	@Test
	public void testCantidadDeMultiplosDe() {
		// Getting the even occurrences
		int amount = counter.cantidadDeMultiplosDe(2);
		// I check the amount is the expected one
		assertEquals(amount, 1);
	}
	
}
