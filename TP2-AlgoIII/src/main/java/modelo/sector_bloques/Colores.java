package modelo.sector_bloques;

import modelo.sector_dibujo.Color;
import modelo.sector_dibujo.Personaje;

public class Colores extends Bloque {
	String nombre = "Colores";
	
	public void ejecutar() {
	}
	public void ejecutarOpuesto() {
	}

	@Override
	public String getNombre() {
		return nombre;
	}
}
