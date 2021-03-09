package modelo.sector_bloques;

import modelo.sector_dibujo.Color;
import modelo.sector_dibujo.Personaje;

public class Naranja extends Bloque {
	String nombre = "Naranja";
	
	public void ejecutar() {
		(receptor.obtenerPersonaje()).nuevoColorDeLapiz(Color.NARANJA);
	}
	public void ejecutarOpuesto() {
		(receptor.obtenerPersonaje()).nuevoColorDeLapiz(Color.AZUL);
	}


	@Override
	public String getNombre() {
		return nombre;
	}
}

