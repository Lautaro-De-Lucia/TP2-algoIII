package pruebas.sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import modelo.sector_dibujo.Direccion;
import modelo.sector_dibujo.Personaje;
import modelo.sector_dibujo.Posicion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonajeTest {
	
	Direccion norte;
	Direccion sur;
	Direccion este;
	Direccion oeste;
		
	@BeforeEach
	public void setup() {
		
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
	public void test01ElPersonajeIniciaEnElOrigen() {
		
		// inicializacion de variables
				
		Personaje personaje = new Personaje();
		
		// verificacion de posicion inicial
		
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(8, 8)));
		
	}
	
	@Test
	public void test02ElPersonajeSeMueveHaciaElNorte() {
		
		// inicializacion de variables
				
		Personaje personaje = new Personaje();

		// mover hacia el norte
		
		personaje.mover(norte); // (8, 9)
		
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(8, 9)));
		
	}
	
	@Test
	public void test03ElPersonajeSeMueveEnLasCuatroDirecciones() {
		
		// inicializacion de variables
				
		Personaje personaje = new Personaje();
		
		// mover hacia el norte
		
		personaje.mover(norte); // (8, 9)
		
		// assertion
		
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(8, 9)));
		
		// mover hacia el este
		
		personaje.mover(este); // (9, 9)
				
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(9, 9)));
		
		// mover hacia el sur
		
		personaje.mover(sur); // (9, 8)
				
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(9, 8)));
		
		// mover hacia el oeste
		
		personaje.mover(oeste); // (8, 8)
				
		// assertion
				
		assertTrue((personaje.obtenerPosicion()).igualA(new Posicion(8, 8)));
		
	}

}
