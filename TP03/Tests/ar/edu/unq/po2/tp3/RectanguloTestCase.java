package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTestCase {
	private Rectangulo rectangulo;
	
	@BeforeEach
	public void setUp() throws Exception {
		
	rectangulo = rectangulo.devolverRect(new Point(1,1),2,3);	
	}
	
	
	@Test 
	public void testRectangulo() {
		
		Point puntoEsperado = new Point(1,1);
		
		
		assertEquals(rectangulo.getESI().getX(),puntoEsperado.getX());
		assertEquals(rectangulo.getESI().getY(),puntoEsperado.getY());
	}
	
	
	@Test 
	public void testAreaRectangulo() {
		int areaRectangulo = rectangulo.obtenerArea();
		assertEquals(areaRectangulo,3);
	}
	
	@Test 
	public void testPerimetroRectangulo() {
		int areaRectangulo = rectangulo.obtenerPerimetro();
		assertEquals(areaRectangulo,10);
	}

	@Test
	public void testPosicionamientoRectangulo() {
		String posicionamiento = rectangulo.posicionamientoRectangulo();
		assertEquals(posicionamiento,"Vertical");
	}

}

