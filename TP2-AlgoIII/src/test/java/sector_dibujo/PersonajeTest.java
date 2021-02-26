package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

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
		
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(0, 0)));
		
	}
	
	@Test
	void test02ElPersonajeSeMueveHaciaElNorte() {
		
		// inicializacion de variables
				
		Personaje personaje = new Personaje();

		// mover hacia el norte
		
		personaje.mover(norte); // (0, 1)
		
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(0, 1)));
		
	}
	
	@Test
	void test03ElPersonajeSeMueveEnLasCuatroDirecciones() {
		
		// inicializacion de variables
				
		Personaje personaje = new Personaje();
		
		// mover hacia el norte
		
		personaje.mover(norte); // (0, 1)
		
		// assertion
		
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(0, 1)));
		
		// mover hacia el este
		
		personaje.mover(este); // (1, 1)
				
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(1, 1)));
		
		// mover hacia el sur
		
		personaje.mover(sur); // (1, 0)
				
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(1, 0)));
		
		// mover hacia el oeste
		
		personaje.mover(oeste); // (0, 0)
				
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(0, 0)));
		
	}

}
