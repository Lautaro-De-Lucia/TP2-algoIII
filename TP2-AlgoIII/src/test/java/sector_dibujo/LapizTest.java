package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LapizTest {

	@Test
	public void LapizLevantadoDevuelveLineaNula(){

		LapizLevantado lapiz = new LapizLevantado();

		Posicion inicio = new Posicion(1, 0);
		Posicion final = new Posicion(1, 1);

		assertTrue(lapiz.dibujarLinea(inicio, final) instanceof LineaNula);

	}

	@Test
	public void LapizBajoDevuelveUnaLinea(){

		LapizBajo lapiz = new LapizBajo();

		Posicion inicio = new Posicion(1, 0);
		Posicion final = new Posicion(1, 1);

		assertTrue(lapiz.dibujarLinea(inicio, final) instanceof Linea);

	}

}
