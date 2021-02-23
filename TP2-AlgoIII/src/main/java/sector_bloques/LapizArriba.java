package sector_bloques;

public class LapizArriba extends Bloque{

	public void ejecutar() {
		receptor.levantarLapiz();
	}
	public void ejecutarOpuesto() {
		receptor.bajarLapiz();
	}
	
}
