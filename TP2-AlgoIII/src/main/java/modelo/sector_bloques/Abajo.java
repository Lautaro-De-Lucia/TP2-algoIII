package modelo.sector_bloques;

public class Abajo extends Bloque {
	String nombre = "Abajo";

	public void ejecutar() {
		receptor.abajo();
	}
	public void ejecutarOpuesto() {
		receptor.arriba();
	}

	@Override
	public String getNombre() {
		return nombre;
	}
}
