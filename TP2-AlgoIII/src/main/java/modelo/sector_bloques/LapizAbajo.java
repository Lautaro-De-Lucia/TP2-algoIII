package modelo.sector_bloques;

public class LapizAbajo extends Bloque {
	
	public void ejecutar() {
		receptor.bajarLapiz();
	}
	public void ejecutarOpuesto() {
		receptor.levantarLapiz();
	}

}
