package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class SectorDibujoTest {

	SectorDibujo tablero;
	
	@BeforeEach
	void setup() {
		
		tablero = SectorDibujo.obtenerInstancia();
	}

	@Test
	void test01SeAgregaLineaATablero(){
	
		Posicion posInicial = new Posicion(2, 1);
		Posicion posFinal = new Posicion(2, 2);
		LineaSolida unaLinea = new LineaSolida(posInicial, posFinal);
		
		tablero.agregarLinea(unaLinea);
		Linea lineaAgregada = tablero.obtenerLinea(posInicial, posFinal);
		
		assertTrue(unaLinea.igualA(lineaAgregada));
		
	}
	
	@Test
	void test02SeMueveAlPersonajeConElLapizBajo(){
	
		Posicion posInicial = new Posicion(0, 2);
		Posicion posFinal = new Posicion(0, 3);
		
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
	
		Posicion posInicial = new Posicion(0, 0);
		Posicion posFinal = new Posicion(0, 1);
		
		LineaSolida lineaReferencia = new LineaSolida(posInicial, posFinal);
		tablero.agregarLinea(lineaReferencia);
		
		tablero.ponerBorrador();
		tablero.arriba();
		
		Linea lineaDibujada = tablero.obtenerLinea(posInicial, posFinal);
		
		assertFalse(lineaDibujada.igualA(lineaReferencia));
		
	}
	
	
	


}
