package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Point {

	private int x;
	private int y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	//public Point(){
	//	this.x = 0;
	//	this.y = 0;
	//}
	
	public void moverPuntoA(int p1, int p2) {
		this.x = p1;
		this.y = p2;
	}
	
	public Point sumarPuntos(Point p1, Point p2) {
		return new Point((p1.getX() + p2.getX()), 
						 (p1.getY() + p2.getY()));
	}


	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Test
	public void testSumarPuntos() {
		Point puntoEsperado = new Point(2,3);
		Point punto1 = new Point(1,2);
		Point punto2 = new Point(1,1);
		Point sumaPuntos = this.sumarPuntos(punto1,punto2);
		assertEquals(sumaPuntos,puntoEsperado);
	}
	
}