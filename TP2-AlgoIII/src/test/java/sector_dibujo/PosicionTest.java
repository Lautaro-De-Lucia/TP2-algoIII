package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PosicionTest {

	@Test
	void testSeCambiaLaPosicionAdecuadamente() {
		
		Posicion posicion = new Posicion();
		
		Direccion norte = new Direccion();
		norte.norte();
		
		Direccion sur = new Direccion();
		sur.sur();
		
		Direccion este = new Direccion();
		este.este();
		
		Direccion oeste = new Direccion();
		oeste.oeste();
		
		posicion.cambiar(sur); // (0, -1)
		posicion.cambiar(sur); // (0, -2)
		posicion.cambiar(este); // (1, -2)
		posicion.cambiar(este); // (2, -2)
		posicion.cambiar(norte); // (2, -1)
		posicion.cambiar(oeste); // (1, -1)
		
		assertEquals(1, posicion.obtenerCoordX());
		assertEquals(-1, posicion.obtenerCoordY());
		
	}

}
