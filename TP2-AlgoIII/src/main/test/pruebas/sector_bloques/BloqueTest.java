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

public class BloqueTest {
	
	SectorDibujo tablero;
	
	@BeforeEach
	public void setup() {
		
		tablero = SectorDibujo.obtenerInstancia();
		tablero.reiniciarTablero();
	}

	@Test
	public void test01BloqueArribaFunciona() {
		
		Bloque bloqueArriba = new Arriba();
		Posicion posicionFinal = new Posicion(8, 9);
		
		bloqueArriba.ejecutar();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
	}
	
	@Test
	public void test02BloqueDerechaFunciona() {
		
		Bloque bloqueDerecha = new Derecha();
		Posicion posicionFinal = new Posicion(9, 8);
		
		bloqueDerecha.ejecutar();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
	}
	
	@Test
	public void test03BloqueAbajoFunciona() {
		
		Bloque bloqueAbajo = new Abajo();
		Posicion posicionFinal = new Posicion(8, 7);
		
		bloqueAbajo.ejecutar();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
	}
	
	@Test
	public void test04BloqueIzquierdaFunciona() {
		
		Bloque bloqueIzquierda = new Izquierda();
		Posicion posicionFinal = new Posicion(7, 8);
		
		bloqueIzquierda.ejecutar();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
	}
	
	@Test
	public void test05BloqueLapizArribaFunciona() {
		
		Bloque bloqueLapizArriba = new LapizArriba();
		Posicion posInicial = new Posicion(8, 8);
		Posicion posFinal = new Posicion(7, 8);
		Direccion oeste = new Direccion();
		oeste.oeste();
		Linea lineaReferencia = new LineaSolida(posInicial, posFinal);
		
		bloqueLapizArriba.ejecutar();
		tablero.obtenerPersonaje().mover(oeste);
		
		assertFalse(lineaReferencia.igualA(tablero.obtenerLinea(posInicial, posFinal)));
	}
	
	@Test
	public void test06BloqueLapizAbajoFunciona() {
		
		Bloque bloqueLapizAbajo = new LapizAbajo();
		Posicion posInicial = new Posicion(8, 8);
		Posicion posFinal = new Posicion(8, 9);
		Direccion norte = new Direccion();
		norte.norte();
		Linea lineaReferencia = new LineaSolida(posInicial, posFinal);
		
		tablero.levantarLapiz();
		bloqueLapizAbajo.ejecutar();
		tablero.obtenerPersonaje().mover(norte);
		assertTrue(lineaReferencia.igualA(tablero.obtenerLinea(posInicial, posFinal)));
	}
		
	@Test
	public void test07BloqueCompuestoFunciona() {
		
		BloqueCompuesto bloqueCompuesto = new BloqueCompuesto();
		Posicion posicionFinal = new Posicion(10, 9);
		
		bloqueCompuesto.agregarBloque(new Derecha()); // (9, 8)
		bloqueCompuesto.agregarBloque(new Arriba()); // (9, 9)
		bloqueCompuesto.agregarBloque(new Derecha()); // (10, 9)
		bloqueCompuesto.agregarBloque(new Izquierda()); // (9, 9)
		bloqueCompuesto.quitarBloque(); // (10, 9)

		bloqueCompuesto.ejecutar();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
		
	}

}
