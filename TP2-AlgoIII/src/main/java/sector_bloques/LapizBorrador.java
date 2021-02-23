package sector_bloques;

public class LapizBorrador extends Bloque{

	public void ejecutar() {
		receptor.ponerBorrador();
	}
	public void ejecutarOpuesto() {
		receptor.bajarLapiz();
	}
	
}
