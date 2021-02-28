package java.sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import modelo.sector_dibujo.Linea;
import modelo.sector_dibujo.LineaSolida;
import modelo.sector_dibujo.Posicion;
import modelo.sector_dibujo.SectorDibujo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class SectorDibujoTest {

	SectorDibujo tablero;
	
	@BeforeEach
	void setup() {
		
		tablero = SectorDibujo.obtenerInstancia();
		tablero.reiniciarTablero();
	}

	@Test
	void test01SeAgregaLineaATablero(){
	
		Posicion posInicial = new Posicion(9, 8);
		Posicion posFinal = new Posicion(9, 9);
		LineaSolida unaLinea = new LineaSolida(posInicial, posFinal);
		
		tablero.agregarLinea(unaLinea);
		Linea lineaAgregada = tablero.obtenerLinea(posInicial, posFinal);
		
		assertTrue(unaLinea.igualA(lineaAgregada));
		
	}
	
	@Test
	void test02SeMueveAlPersonajeConElLapizBajo(){
	
		Posicion posInicial = new Posicion(7, 9);
		Posicion posFinal = new Posicion(7, 10);
		
		tablero.bajarLapiz();
		tablero.arriba();
		tablero.arriba();
		tablero.arriba();
		
		LineaSolida lineaReferencia = new LineaSolida(posInicial, posFinal);
		Linea lineaDibujada = tablero.obtenerLinea(posInicial, posFinal);
		
		assertTrue(lineaDibujada.igualA(lineaReferencia));
		
	}
	
	@Test
	void test03PersonajeConBorradorEliminaLineaDeTablero(){
	
		Posicion posInicial = new Posicion(7, 7);
		Posicion posFinal = new Posicion(7, 8);
		
		LineaSolida lineaReferencia = new LineaSolida(posInicial, posFinal);
		tablero.agregarLinea(lineaReferencia);
		
		tablero.ponerBorrador();
		tablero.arriba();
		
		Linea lineaDibujada = tablero.obtenerLinea(posInicial, posFinal);
		
		assertFalse(lineaDibujada.igualA(lineaReferencia));
		
	}
	
	
	


}
