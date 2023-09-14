package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private List<Integer> numeros = new ArrayList<Integer>();
	
	public void agregarNumeros(int n) {
		numeros.add(n);
	}
	
	public int contarPares() {
		int contadorPares = 0;
		for (Integer numero : numeros) {
			if (numero % 2 == 0) {
				contadorPares++;
			}
		}
		return contadorPares;
	}
	
	public int contarImpares() {
		int contadorImpares = 0;
		for (Integer numero : numeros) {
			if (numero % 2 == 1) {
				contadorImpares++;
			}
		}
		return contadorImpares;
	}
	public int cantidadDeMultiplosDe(Integer x) {
		int contadorMultiplos = 0;
		for (Integer numero : numeros) {
			if (numero % x == 0) {
				contadorMultiplos++;
			}
		}
		return contadorMultiplos;
	}
	
	public int multiplosDe(int x, int y) {
		//int n = 1000;
		for (int n = 1000; n >= 0; n--) {
			if ( (n % x == 0) && (n % y == 0)) {
				return n;
			}
		}
		return -1;
	}
}
