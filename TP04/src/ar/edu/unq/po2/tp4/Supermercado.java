package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	String nombre;
	String direccion;
	
	List<Producto> productos = new ArrayList<Producto>(); 
	
	public void agregarProducto(Producto unProducto) {
		productos.add(unProducto);
	}
	
	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public int getPrecioTotal() {
		int precioTotal = 0;
		for (Producto producto : productos) {
			precioTotal += producto.getPrecio();
		}
		return precioTotal;
	}
}
