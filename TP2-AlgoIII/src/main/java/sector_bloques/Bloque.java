package sector_bloques;
import sector_dibujo.SectorDibujo;

public class Bloque {
	
	SectorDibujo receptor = new SectorDibujo();

	public void establecerReceptor(SectorDibujo tablero) {
		receptor = tablero;
	}
	
	public void ejecutar() {}
	public void ejecutarOpuesto() {}
	
}
