package modelo.sector_bloques;

import modelo.sector_dibujo.Color;
import modelo.sector_dibujo.Personaje;

public class Rojo extends Bloque {
	String nombre = "Rojo";
	
	public void ejecutar() {
		(receptor.obtenerPersonaje()).nuevoColorDeLapiz(Color.ROJO);
	}
	public void ejecutarOpuesto() {
		(receptor.obtenerPersonaje()).nuevoColorDeLapiz(Color.VERDE);
	}


	@Override
	public String getNombre() {
		return nombre;
	}
}

