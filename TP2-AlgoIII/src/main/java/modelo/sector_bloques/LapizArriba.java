package modelo.sector_bloques;

public class LapizArriba extends Bloque{
	String nombre = "LapizArriba";

	public void ejecutar() {
		receptor.levantarLapiz();
	}
	public void ejecutarOpuesto() {
		receptor.bajarLapiz();
	}

	@Override
	public String getNombre() {
		return nombre;
	}
}
