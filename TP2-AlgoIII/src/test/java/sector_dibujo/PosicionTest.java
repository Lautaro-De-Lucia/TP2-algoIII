package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeEach;

class PosicionTest {
	
	Direccion norte; 
	Direccion sur;
	Direccion este;
	Direccion oeste;
	
	@BeforeEach
	void setup() {
		
		norte = new Direccion();
		norte.norte();
		
		sur = new Direccion();
		sur.sur();
		
		este = new Direccion();
		este.este();
		
		oeste = new Direccion();
		oeste.oeste();
	}
	
	@Test
	void test01MovimientoEnLasCuatroDirecciones() {
		
		Posicion posicion = new Posicion();
		
		assertEquals(0, posicion.obtenerCoordX());
		assertEquals(0, posicion.obtenerCoordY());

		posicion.cambiar(sur); // (0, -1)
		assertEquals(0, posicion.obtenerCoordX());
		assertEquals(-1, posicion.obtenerCoordY());
		
		posicion.cambiar(norte); // (0, 0)
		assertEquals(0, posicion.obtenerCoordX());
		assertEquals(0, posicion.obtenerCoordY());
		
		posicion.cambiar(oeste); // (-1, 0)
		assertEquals(-1, posicion.obtenerCoordX());
		assertEquals(0, posicion.obtenerCoordY());
		
		posicion.cambiar(este); // (0, 0)
		assertEquals(0, posicion.obtenerCoordX());
		assertEquals(0, posicion.obtenerCoordY());
		
		posicion.cambiar(norte); // (0, 1)
		assertEquals(0, posicion.obtenerCoordX());
		assertEquals(1, posicion.obtenerCoordY());
		
		posicion.cambiar(sur); // (0, 0)
		assertEquals(0, posicion.obtenerCoordX());
		assertEquals(0, posicion.obtenerCoordY());
		
		posicion.cambiar(este); // (1, 0)
		assertEquals(1, posicion.obtenerCoordX());
		assertEquals(0, posicion.obtenerCoordY());
		
		posicion.cambiar(oeste); // (0, 0)
		assertEquals(0, posicion.obtenerCoordX());
		assertEquals(0, posicion.obtenerCoordY());
		
	}

	@Test
	void test02SeCambiaLaPosicionAdecuadamente() {
		
		Posicion posicion = new Posicion();
		
		posicion.cambiar(sur); // (0, -1)
		posicion.cambiar(sur); // (0, -2)
		posicion.cambiar(este); // (1, -2)
		posicion.cambiar(este); // (2, -2)
		posicion.cambiar(norte); // (2, -1)
		posicion.cambiar(oeste); // (1, -1)
		
		assertEquals(1, posicion.obtenerCoordX());
		assertEquals(-1, posicion.obtenerCoordY());
		
	}
	
	@Test
	void test03DosCaminosDistintosQueLleganAlMismoDestino() {
		
		Posicion posicion1 = new Posicion();
		Posicion posicion2 = new Posicion();
		
		posicion1.cambiar(este); // (1, 0)
		posicion1.cambiar(norte); // (1, 1)
		posicion1.cambiar(oeste); // (0, 1)
		posicion1.cambiar(norte); // (0, 2)
		
		posicion2.cambiar(norte); // (0, 1)
		posicion2.cambiar(norte); // (0, 2)
		posicion2.cambiar(este); // (1, 2)
		posicion2.cambiar(este); // (2, 2)
		posicion2.cambiar(oeste); // (1, 2)
		posicion2.cambiar(oeste); // (0, 2)
		
		assertTrue(posicion1.igualA(posicion2));
		
	}

}
