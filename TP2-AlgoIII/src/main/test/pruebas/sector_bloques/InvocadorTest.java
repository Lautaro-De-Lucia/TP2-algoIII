package pruebas.sector_bloques;

import static org.junit.jupiter.api.Assertions.*;

import modelo.sector_bloques.*;
import modelo.sector_bloques.Invocador;
import org.junit.jupiter.api.Test;

import modelo.sector_dibujo.Posicion;
import modelo.sector_dibujo.SectorDibujo;

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
				
		invocador.agregarBloque(new Derecha()); // (9, 8)
		invocador.agregarBloque(new Arriba()); // (9, 9)
		invocador.agregarBloque(new Derecha()); // (10, 9)
		invocador.agregarBloque(new Izquierda()); // (9, 9)
		
		Posicion posicionOriginal = new Posicion(8, 8);
		Posicion posicionFinal = new Posicion(9, 9);
		
		assertTrue(posicionOriginal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));

		invocador.ejecutarSecuencia();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
		
	}
	
	@Test
	void test02SecuenciaInvertidaDeBloquesSeEjecutaCorrectamente() {
		
		Invocador invocador = new Invocador();
				
		invocador.agregarBloque(new Izquierda()); // (9, 8)
		invocador.agregarBloque(new Abajo()); // (9, 9)
		invocador.agregarBloque(new Izquierda()); // (10, 9)
		invocador.agregarBloque(new Derecha()); // (9, 9)
		
		Posicion posicionOriginal = new Posicion(8, 8);
		Posicion posicionFinal = new Posicion(9, 9);
		
		assertTrue(posicionOriginal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));

		invocador.revertirSecuencia();
		
		assertTrue(posicionFinal.igualA(tablero.obtenerPersonaje().obtenerPosicion()));
		
	}
}



