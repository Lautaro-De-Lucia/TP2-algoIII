package modelo.sector_bloques;
import modelo.sector_dibujo.SectorDibujo;

import java.util.ArrayList;

public class Bloque {

    public ArrayList<Bloque> secuencia = new ArrayList<Bloque>();
    SectorDibujo receptor = SectorDibujo.obtenerInstancia();
	String nombre;

	public void ejecutar() {}
	public void ejecutarOpuesto() {}

	public String getNombre() {
		return null;
	}

	public ArrayList<Bloque> getSecuencia() {
		return secuencia;
	}
}
