package modelo.sector_bloques;

import modelo.sector_dibujo.Color;
import modelo.sector_dibujo.Personaje;

public class Negro extends Bloque {
	String nombre = "Negro";
	
	public void ejecutar() {
		(receptor.obtenerPersonaje()).nuevoColorDeLapiz(Color.NEGRO);
	}
	public void ejecutarOpuesto() {
		(receptor.obtenerPersonaje()).nuevoColorDeLapiz(Color.BLANCO);
	}


	@Override
	public String getNombre() {
		return nombre;
	}
}

