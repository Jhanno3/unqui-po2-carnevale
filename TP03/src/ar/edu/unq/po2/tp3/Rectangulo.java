package ar.edu.unq.po2.tp3;



public class Rectangulo {
	
	private Point esquinaInferiorIzquierda;
	private Point esquinaInferiorDerecha;
	private Point esquinaSuperiorIzquierda; 
	private Point esquinaSuperiorDerecha;
	private int altoRectangulo;
	private int anchoRectangulo;
	
	public Rectangulo(Point ii,Point id,Point si,Point sd) {
		this.esquinaInferiorIzquierda = ii;
		this.esquinaInferiorDerecha = id;
		this.esquinaSuperiorIzquierda = si;
		this.esquinaSuperiorDerecha = sd;
		this.altoRectangulo = this.altoDelRectangulo(esquinaSuperiorIzquierda,esquinaInferiorIzquierda);
		this.anchoRectangulo = this.anchoDelRectangulo(esquinaInferiorDerecha,esquinaInferiorIzquierda);
	}

	private int altoDelRectangulo(Point puntoa, Point puntob) {
		int yPuntoA = puntoa.getY();
		int yPuntoB = puntob.getY();
		
		return yPuntoA - yPuntoB;
	}

	public int anchoDelRectangulo(Point puntoa,Point puntob) {
		int xPuntoA = puntoa.getX();
		int xPuntoB = puntob.getX();
		return xPuntoA - xPuntoB;
	}
	
	public Point getESI() {
		return this.esquinaInferiorIzquierda;
	}
	
	public static Rectangulo devolverRect(Point puntoRaiz,int ancho,int alto) {
		Point anchoD = new Point((ancho + puntoRaiz.getX()), puntoRaiz.getY());
		Point altoI = new Point(puntoRaiz.getX(),(alto + puntoRaiz.getY()));
		Point altoD = new Point(anchoD.getX(),altoI.getY());
		return new Rectangulo(puntoRaiz, anchoD, altoI, altoD);
	}
	 
	
	public int obtenerArea() {
		return (this.altoRectangulo *this.anchoRectangulo ) / 2;
	}
	
	public int obtenerPerimetro() {
		return (this.altoRectangulo + this.anchoRectangulo ) * 2;
	}
	
	public String posicionamientoRectangulo() {
		String posicionRectangulo;
		if (this.altoRectangulo > this.anchoRectangulo) {
			posicionRectangulo = "Vertical";
		}else {
			posicionRectangulo = "Horizontal";
		}
		return posicionRectangulo;
	}
}
