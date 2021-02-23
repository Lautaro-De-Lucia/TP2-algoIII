package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SectorDibujoTest {

	@Test
		void SeAgregaLineaATablero(){
			SectorDibujo sector = new SectorDibujo();
			sector.abajo();
			assertTrue(sector.ObtenerLinea() instanceof Linea);
	}

}
