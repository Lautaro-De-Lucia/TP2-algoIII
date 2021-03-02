package modelo.sector_bloques;

public class Arriba extends Bloque {
	String nombre = "Arriba";

	public void ejecutar() {
		receptor.arriba();
	}
	public void ejecutarOpuesto() {
		receptor.abajo();
	}

	@Override
	public String getNombre() {
		return nombre;
	}
}
