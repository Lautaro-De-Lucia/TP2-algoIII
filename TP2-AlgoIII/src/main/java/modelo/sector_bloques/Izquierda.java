package modelo.sector_bloques;

public class Izquierda extends Bloque {
	String nombre = "Izquierda";

	public void ejecutar() {
		receptor.izquierda();
	}
	public void ejecutarOpuesto() {
		receptor.derecha();
	}

	@Override
	public String getNombre() {
		return nombre;
	}
}
