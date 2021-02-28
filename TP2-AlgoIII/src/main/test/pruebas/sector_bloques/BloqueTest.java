package pruebas.sector_bloques;

import static org.junit.jupiter.api.Assertions.*;

import modelo.sector_bloques.*;
import modelo.sector_bloques.Bloque;
import org.junit.jupiter.api.Test;

import modelo.sector_dibujo.Direccion;
import modelo.sector_dibujo.Linea;
import modelo.sector_dibujo.LineaSolida;
import modelo.sector_dibujo.Posicion;
import modelo.sector_dibujo.SectorDibujo;

import org.junit.jupiter.api.BeforeEach;

class BloqueTest {
	
	SectorDibujo tablero;
	
	@BeforeEach
	void setup() {
		
		tablero = SectorDibujo.obtenerInstancia();
		tablero.reiniciarTablero();
	}

	@Test
	void test01BloqueArribaFunciona() {
		
		Bloque bloqueArriba = new Arriba();
		Posicion posicionFinal = new Posicion(7, 8);
		
		bloqueArriba.ejecutar();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
	}
	
	@Test
	void test02BloqueDerechaFunciona() {
		
		Bloque bloqueDerecha = new Derecha();
		Posicion posicionFinal = new Posicion(8, 7);
		
		bloqueDerecha.ejecutar();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
	}
	
	@Test
	void test03BloqueAbajoFunciona() {
		
		Bloque bloqueAbajo = new Abajo();
		Posicion posicionFinal = new Posicion(7, 6);
		
		bloqueAbajo.ejecutar();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
	}
	
	@Test
	void test04BloqueIzquierdaFunciona() {
		
		Bloque bloqueIzquierda = new Izquierda();
		Posicion posicionFinal = new Posicion(6, 7);
		
		bloqueIzquierda.ejecutar();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
	}
	
	@Test
	void test05BloqueLapizArribaFunciona() {
		
		Bloque bloqueLapizArriba = new LapizArriba();
		Posicion posInicial = new Posicion(7, 7);
		Posicion posFinal = new Posicion(6, 7);
		Direccion oeste = new Direccion();
		oeste.oeste();
		Linea lineaReferencia = new LineaSolida(posInicial, posFinal);
		
		bloqueLapizArriba.ejecutar();
		tablero.obtenerPersonaje().mover(oeste);
		
		assertFalse(lineaReferencia.igualA(tablero.obtenerLinea(posInicial, posFinal)));
	}
	
	@Test
	void test06BloqueLapizAbajoFunciona() {
		
		Bloque bloqueLapizAbajo = new LapizAbajo();
		Posicion posInicial = new Posicion(7, 7);
		Posicion posFinal = new Posicion(7, 8);
		Direccion norte = new Direccion();
		norte.norte();
		Linea lineaReferencia = new LineaSolida(posInicial, posFinal);
		
		tablero.levantarLapiz();
		bloqueLapizAbajo.ejecutar();
		tablero.obtenerPersonaje().mover(norte);
		assertTrue(lineaReferencia.igualA(tablero.obtenerLinea(posInicial, posFinal)));
	}
		
	@Test
	void test07BloqueCompuestoFunciona() {
		
		BloqueCompuesto bloqueCompuesto = new BloqueCompuesto();
		Posicion posicionFinal = new Posicion(9, 8);
		
		bloqueCompuesto.agregarBloque(new Derecha()); // (8, 7)
		bloqueCompuesto.agregarBloque(new Arriba()); // (8, 8)
		bloqueCompuesto.agregarBloque(new Derecha()); // (9, 8)
		bloqueCompuesto.agregarBloque(new Izquierda()); // (8, 8)
		bloqueCompuesto.quitarBloque(); // (9, 8)

		bloqueCompuesto.ejecutar();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
		
	}

}
