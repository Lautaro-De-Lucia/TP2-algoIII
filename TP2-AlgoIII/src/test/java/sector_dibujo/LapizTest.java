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

	@Test
	public void test02LapizBajoDibujaUnaLinea(){

		LapizBajo lapiz = new LapizBajo();
		SectorDibujo tablero = SectorDibujo.obtenerInstancia();
		Posicion posInicial = new Posicion(1, 0);
		Posicion posFinal = new Posicion(1, 1);
		
		lapiz.dibujarLinea(posInicial, posFinal);
				
		Linea lineaDibujada = tablero.obtenerLinea(posInicial, posFinal);
		Linea lineaReferencia = new LineaSolida(posInicial, posFinal);
		
		assertTrue(lineaDibujada.igualA(lineaReferencia));

	}
	
	@Test
	public void test03LapizLevantadoNoDibujaLinea(){

		LapizLevantado lapiz = new LapizLevantado();
		SectorDibujo tablero = SectorDibujo.obtenerInstancia();
		Posicion posInicial = new Posicion(2, 1);
		Posicion posFinal = new Posicion(2, 2);
		
		lapiz.dibujarLinea(posInicial, posFinal);
		 
		Linea lineaDibujada = tablero.obtenerLinea(posInicial, posFinal);
		Linea lineaReferencia = new LineaSolida(posInicial, posFinal);
		
		assertFalse(lineaDibujada.igualA(lineaReferencia));

	}

	
	
}
