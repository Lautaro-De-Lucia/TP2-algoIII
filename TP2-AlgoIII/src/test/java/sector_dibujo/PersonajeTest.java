package java.sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import modelo.sector_dibujo.Direccion;
import modelo.sector_dibujo.Personaje;
import modelo.sector_dibujo.Posicion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonajeTest {
	
	Direccion norte;
	Direccion sur;
	Direccion este;
	Direccion oeste;
		
	@BeforeEach
	void setup() {
		
		norte = new Direccion();
		norte.norte();
		
		sur = new Direccion();
		sur.sur();
		
		este = new Direccion();
		este.este();
		
		oeste = new Direccion();
		oeste.oeste();
	}

	@Test
	void test01ElPersonajeIniciaEnElOrigen() {
		
		// inicializacion de variables
				
		Personaje personaje = new Personaje();
		
		// verificacion de posicion inicial
		
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(7, 7)));
		
	}
	
	@Test
	void test02ElPersonajeSeMueveHaciaElNorte() {
		
		// inicializacion de variables
				
		Personaje personaje = new Personaje();

		// mover hacia el norte
		
		personaje.mover(norte); // (7, 8)
		
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(7, 8)));
		
	}
	
	@Test
	void test03ElPersonajeSeMueveEnLasCuatroDirecciones() {
		
		// inicializacion de variables
				
		Personaje personaje = new Personaje();
		
		// mover hacia el norte
		
		personaje.mover(norte); // (7, 8)
		
		// assertion
		
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(7, 8)));
		
		// mover hacia el este
		
		personaje.mover(este); // (8, 8)
				
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(8, 8)));
		
		// mover hacia el sur
		
		personaje.mover(sur); // (8, 7)
				
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(8, 7)));
		
		// mover hacia el oeste
		
		personaje.mover(oeste); // (7, 7)
				
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(7, 7)));
		
	}

}
