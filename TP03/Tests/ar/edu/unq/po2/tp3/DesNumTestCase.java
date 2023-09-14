package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesNumTestCase {
	private DesNum desNum;
	@BeforeEach
	public void setUp() throws Exception {
		
		desNum = new DesNum();
			desNum.agregarNumeros(101);
			desNum.agregarNumeros(323);
			desNum.agregarNumeros(522);
			desNum.agregarNumeros(444);
			desNum.agregarNumeros(373);
	}
	@Test
	public void numeroConMayorCantidadDePares() {
		int amount = desNum.numeroConMayorCantidadDePares();
		assertEquals(amount, 444);
	}

}
