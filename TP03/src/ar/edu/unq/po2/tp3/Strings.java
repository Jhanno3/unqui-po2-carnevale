package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;

import java.lang.String;

import org.junit.Test;

public class Strings {

	
	String a = "Hola";
	String s = a;
	String t;
	
	@Test
    public void testLongitudCadenaS() {
        int longitudReal = s.length();
        assertEquals(longitudReal, 4);
    }
	// se puede usar el length en s y devuelve el largo de la cadena de caracteres
	
	// En el caso de t.length no puede invocar a "length" porque t es null
	
	@Test
    public void testAgregar1enA() {
        String aActualizado = 1+a;
        assertEquals(aActualizado, "1Hola");
    }
	// el + usado en un string devuelve el anterior y su posterior concatenados en un string
	
	@Test
	public void testUpperCase() {
		String aMayusculas = a.toUpperCase();
		assertEquals(aMayusculas, "HOLA");
	}
	// toUpperCase pasa todos los caracteres del string a mayusculas
	
	@Test
	public void testIndexOf() {
		int test1 = "Libertad".indexOf("r");
		assertEquals(test1, 4);
	}
	// indexOf("l") devuelve la posicion en la cual se encuentra la primera letra l en el string
	
	@Test
	public void testLastIndexOf() {
		int test2 = "Universidad".lastIndexOf('i');
		assertEquals(test2,7);
	}
	// lastIndexOf() funciona como el indexOf() pero con la ultima de la letra a buscar

	@Test
	public void testSubString() {
		String test3 = "Quilmes".substring(2,4);
		assertEquals(test3,"il");
	}
	// subString(x,y) devuelve los caracteres desde x inclusive hasta y sin incluir

	@Test
	public void testStartsWith() {
		boolean test4 = (a.length() + a).startsWith("a");
		assertEquals(test4,false);
	}
	// startsWith(a) indica si un string empieza con a
	
	@Test
	public void testIgualdad() {
		boolean test5 = s == a;
		assertEquals(test5,true);
	}
	// == indica si ambos casos tienen la misma referencia en memoria 
	
	@Test
	public void testSubStringEqual() {
		boolean test6 = a.substring(1,3).equals("bc");
		assertEquals(test6, false);
	}
	// subString(n1,n2...).Equals("a...") indica si en las posiciones n1,n2,etc... se encuentran los cracteres "a..."

}
/** 1. ¿Qué son los tipos de datos primitivos?
			
 		los tipos de datos primitivos son los que ya vienen pre definidos por el lenguaje y tienen una palabra reservada por ejemplo, int
 		
 		
	2. ¿Cuál es la diferencia entre un int y un Integer?
		
		int es un tipo de dato de numero entero de 32 bits de largo, osea desde 0 hasta 2^31-1
		y el integer es una clase que tiene almacenado a un int, pudiendo usarla como un objeto
		
		
	3. ¿Si se define una variable de instancia de tipo int cual sería su valor predeterminado? 
	   ¿Y si se define una de tipo Integer? Haga la prueba en Eclipse.


		el valor por defecto de int es 0
		
		@Test 
	public void testPruebaInt() {
		int prueba;
		assertEquals(prueba,0);
	}
	
	este mini test no funciona ya que no me crea la variable prueba, me dice explicitamente que la iguale yo a 0
	
	el integer tomaria el valor por defecto del int, que es 0

*/	
	