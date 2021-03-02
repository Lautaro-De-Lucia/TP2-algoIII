package modelo.sector_bloques;

public class LapizAbajo extends Bloque {
	String nombre = "Lapiz Abajo";
	
	public void ejecutar() {
		receptor.bajarLapiz();
	}
	public void ejecutarOpuesto() {
		receptor.levantarLapiz();
	}

	@Override
	public String getNombre() {
		return nombre;
	}
}
