package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class DesNum {

	private List<Integer> numerosADesarmar = new ArrayList<Integer>();
	
	public void agregarNumeros(int n) {
		numerosADesarmar.add(n);
	}
	
	public int numeroConMayorCantidadDePares() {
		int mayorParesEnNumero = 0;
		for (Integer num : numerosADesarmar) {
			if (cantidadDeDigitosPares(num) > cantidadDeDigitosPares(mayorParesEnNumero) ) {
				mayorParesEnNumero = num;
			}
		}
		return mayorParesEnNumero;
	}

	private int cantidadDeDigitosPares(int n) {
		int contadorDPares = 0;
		int vAux = n;
		while (vAux > 0) {
			contadorDPares = contadorDPares + unoSiCeroSino(((vAux % 2) == 0));
			vAux = vAux / 10;
		}
		contadorDPares = contadorDPares + unoSiCeroSino((vAux  % 2) == 0);
		return contadorDPares;
	}
	
	public int unoSiCeroSino(boolean b) {
		if(b == true) {
			return 1;
		}
		else 
			return 0;
		
	}
	
}
