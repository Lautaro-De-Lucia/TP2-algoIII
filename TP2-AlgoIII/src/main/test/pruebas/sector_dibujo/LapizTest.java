package pruebas.sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import modelo.sector_dibujo.*;
import org.junit.jupiter.api.Test;

public class LapizTest {

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
		Posicion posInicial = new Posicion(8, 7);
		Posicion posFinal = new Posicion(8, 8);
		
		lapiz.trazar(posInicial, posFinal);
				
		Linea lineaDibujada = tablero.obtenerLinea(posInicial, posFinal);
		Linea lineaReferencia = new LineaSolida(posInicial, posFinal);
		
		assertTrue(lineaDibujada.igualA(lineaReferencia));

	}
	
	@Test
	public void test03LapizEnBorradorNoDibujaLinea(){

		LapizEnBorrador lapiz = new LapizEnBorrador();
		SectorDibujo tablero = SectorDibujo.obtenerInstancia();
		Posicion posInicial = new Posicion(9, 8);
		Posicion posFinal = new Posicion(9, 9);
		
		lapiz.trazar(posInicial, posFinal);
		 
		Linea lineaDibujada = tablero.obtenerLinea(posInicial, posFinal);
		Linea lineaReferencia = new LineaSolida(posInicial, posFinal);
		
		assertFalse(lineaDibujada.igualA(lineaReferencia));

	}

	
	
}
