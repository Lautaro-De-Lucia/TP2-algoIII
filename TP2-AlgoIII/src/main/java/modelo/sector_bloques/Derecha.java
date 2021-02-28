package modelo.sector_bloques;

public class Derecha extends Bloque {
	String nombre = "Derecha";

	public void ejecutar() {
		receptor.derecha();
	}
	public void ejecutarOpuesto() {
		receptor.izquierda();
	}

	@Override
	public String getNombre() {
		return nombre;
	}
}
