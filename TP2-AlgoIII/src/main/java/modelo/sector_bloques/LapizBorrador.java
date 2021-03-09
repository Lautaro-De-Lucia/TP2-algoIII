package modelo.sector_bloques;

public class LapizBorrador extends Bloque{
	String nombre = "Lapiz Borrador";

	public void ejecutar() {
		receptor.ponerBorrador();
	}
	public void ejecutarOpuesto() {
		receptor.bajarLapiz();
	}
	@Override
	public String getNombre() {
		return nombre;
	}
}
