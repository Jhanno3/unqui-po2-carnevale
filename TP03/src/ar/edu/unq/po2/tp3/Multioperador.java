package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	
	private List<Integer> numerosAMultioperar = new ArrayList<Integer>();
	
	public void agregarNumerosAMultioperar(int n) {
		numerosAMultioperar.add(n);
	}
	
	public int suma() {
		int resultadoSuma = 0;
		for(int numero : numerosAMultioperar) {
			resultadoSuma = resultadoSuma + numero;
		}
		return resultadoSuma;
	}
	
	public Integer resta() {
		Integer resultadoResta = 0;
		for(Integer numero : numerosAMultioperar) {
			resultadoResta = resultadoResta - numero;
		}
		return resultadoResta;
	}
	
	public int multiplicacion() {
		int resultadoMulti = 1;
		for(int numero : numerosAMultioperar) {
			resultadoMulti = resultadoMulti * numero;
		}
		return resultadoMulti;
	}
}
