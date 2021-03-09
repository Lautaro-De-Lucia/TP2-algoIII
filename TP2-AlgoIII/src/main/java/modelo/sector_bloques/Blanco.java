package modelo.sector_bloques;

import modelo.sector_dibujo.Color;
import modelo.sector_dibujo.Personaje;

public class Blanco extends Bloque {
	String nombre = "Blanco";
	
	public void ejecutar() {
		(receptor.obtenerPersonaje()).nuevoColorDeLapiz(Color.BLANCO);
	}
	public void ejecutarOpuesto() {
		(receptor.obtenerPersonaje()).nuevoColorDeLapiz(Color.NEGRO);
	}
}

