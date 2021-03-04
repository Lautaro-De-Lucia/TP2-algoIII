package pruebas.sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import modelo.sector_dibujo.Linea;
import modelo.sector_dibujo.LineaSolida;
import modelo.sector_dibujo.Posicion;
import modelo.sector_dibujo.SectorDibujo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class SectorDibujoTest {

	SectorDibujo tablero;
	
	@BeforeEach
	public void setup() {
		
		tablero = SectorDibujo.obtenerInstancia();
		tablero.reiniciarTablero();
	}

	@Test
	public void test01SeAgregaLineaATablero(){
	
		Posicion posInicial = new Posicion(10, 9);
		Posicion posFinal = new Posicion(10, 10);
		LineaSolida unaLinea = new LineaSolida(posInicial, posFinal);
		
		tablero.agregarLinea(unaLinea);
		Linea lineaAgregada = tablero.obtenerLinea(posInicial, posFinal);
		
		assertTrue(unaLinea.igualA(lineaAgregada));
		
	}
	
	@Test
	public void test02SeMueveAlPersonajeConElLapizBajo(){
	
		Posicion posInicial = new Posicion(8, 10);
		Posicion posFinal = new Posicion(8, 11);
		
		tablero.bajarLapiz();
		tablero.arriba();
		tablero.arriba();
		tablero.arriba();
		
		LineaSolida lineaReferencia = new LineaSolida(posInicial, posFinal);
		Linea lineaDibujada = tablero.obtenerLinea(posInicial, posFinal);
		
		assertTrue(lineaDibujada.igualA(lineaReferencia));
		
	}
	
	@Test
	public void test03PersonajeConBorradorEliminaLineaDeTablero(){
	
		Posicion posInicial = new Posicion(8, 8);
		Posicion posFinal = new Posicion(8, 9);
		
		LineaSolida lineaReferencia = new LineaSolida(posInicial, posFinal);
		tablero.agregarLinea(lineaReferencia);
		
		tablero.ponerBorrador();
		tablero.arriba();
		
		Linea lineaDibujada = tablero.obtenerLinea(posInicial, posFinal);
		
		assertFalse(lineaDibujada.igualA(lineaReferencia));
		
	}
	
	
	


}
