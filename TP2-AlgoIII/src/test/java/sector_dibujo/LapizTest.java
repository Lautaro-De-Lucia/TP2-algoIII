package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LapizTest {

	@Test
	public void test01CambiarColorDelLapiz(){

		LapizBajo unLapiz = new LapizBajo();
		Color nuevoColor = Color.ROJO;
		
		assertEquals(unLapiz.obtenerColor(), Color.NEGRO);
		
		unLapiz.cambiarColor(nuevoColor);
		
		assertEquals(unLapiz.obtenerColor(), nuevoColor);
	}
	
	/*
	@Test
	public void test02LapizBajoDibujaUnaLinea(){

		LapizBajo lapiz = new LapizBajo();
		SectorDibujo tablero = SectorDibujo.obtenerInstancia();
		Posicion posInicial = new Posicion(1, 0);
		Posicion posFinal = new Posicion(1, 1);
		
		assertFalse((tablero.obtenerLinea(posInicial, posFinal)).esSolida());
		
		lapiz.dibujarLinea(posInicial, posFinal);
		
		Linea lineaDibujada = tablero.obtenerLinea(posInicial, posFinal);
		
		System.out.println((lineaDibujada.getPunto1()).obtenerCoordX());
		System.out.println((lineaDibujada.getPunto1()).obtenerCoordY());
		System.out.println((lineaDibujada.getPunto2()).obtenerCoordX());
		System.out.println((lineaDibujada.getPunto2()).obtenerCoordY());
						
		assertTrue((tablero.obtenerLinea(posInicial, posFinal)).esSolida());

	}
	*/
	
	
	/*

	@Test
	public void test02LapizLevantadoNoDibujaLinea(){

		LapizLevantado lapiz = new LapizLevantado();
		SectorDibujo tablero = SectorDibujo.obtenerInstancia();
		Posicion origenLinea = new Posicion(1, 0);
		Posicion finLinea = new Posicion(1, 1);
		
		lapiz.dibujarLinea(origenLinea, finLinea);
	}

	
	
	*/
	
}
