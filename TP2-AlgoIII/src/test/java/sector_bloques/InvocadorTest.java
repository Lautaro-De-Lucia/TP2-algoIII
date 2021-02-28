package sector_bloques;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sector_dibujo.Posicion;
import sector_dibujo.SectorDibujo;

import org.junit.jupiter.api.BeforeEach;


class InvocadorTest {
	
	SectorDibujo tablero;
	
	@BeforeEach
	void setup() {
		
		tablero = SectorDibujo.obtenerInstancia();
		tablero.reiniciarTablero();
	}
	
	@Test
	void test01SecuenciaDeBloquesSeEjecutaCorrectamente() {
		
		Invocador invocador = new Invocador();
				
		invocador.agregarBloque(new Derecha()); // (8, 7)
		invocador.agregarBloque(new Arriba()); // (8, 8)
		invocador.agregarBloque(new Derecha()); // (9, 8)
		invocador.agregarBloque(new Izquierda()); // (8, 8)
		
		Posicion posicionOriginal = new Posicion(7, 7);
		Posicion posicionFinal = new Posicion(8, 8);
		
		assertTrue(posicionOriginal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));

		invocador.ejecutarSecuencia();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
		
	}
	
	@Test
	void test02SecuenciaInvertidaDeBloquesSeEjecutaCorrectamente() {
		
		Invocador invocador = new Invocador();
				
		invocador.agregarBloque(new Izquierda()); // (8, 7)
		invocador.agregarBloque(new Abajo()); // (8, 8)
		invocador.agregarBloque(new Izquierda()); // (9, 8)
		invocador.agregarBloque(new Derecha()); // (8, 8)
		
		Posicion posicionOriginal = new Posicion(7, 7);
		Posicion posicionFinal = new Posicion(8, 8);
		
		assertTrue(posicionOriginal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));

		invocador.revertirSecuencia();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
		
	}
}



