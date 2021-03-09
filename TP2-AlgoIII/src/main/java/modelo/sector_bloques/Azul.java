package modelo.sector_bloques;

import modelo.sector_dibujo.Color;
import modelo.sector_dibujo.Personaje;

public class Azul extends Bloque {
	String nombre = "Azul";
	
	public void ejecutar() {
		(receptor.obtenerPersonaje()).nuevoColorDeLapiz(Color.AZUL);
	}
	public void ejecutarOpuesto() {
		(receptor.obtenerPersonaje()).nuevoColorDeLapiz(Color.NARANJA);
	}
}

