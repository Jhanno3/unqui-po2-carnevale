package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombre;
	private List<Persona> personas = new ArrayList<Persona>();
	
	EquipoDeTrabajo(String n, ArrayList<Persona> ps) {
		this.nombre = n;
		this.personas = ps;
	}
	
	public void agregarPersonas(Persona p) {
		personas.add(p);
	}
	
	public String nombre() {
		return this.nombre;
	}
	
	public int promedioEdadIntegrantes() {
		int sumaEdad = 0;
        for (Persona persona : personas) {
            sumaEdad += persona.edad();
        }
        return sumaEdad / personas.size();
	}
}
