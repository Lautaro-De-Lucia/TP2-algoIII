package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

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
	
	/*
	
	@Test
	void test03ElPersonajeDibujaLineasAdecuadamente() {
		
		// inicializacion de variables
		
		ArrayList<Linea> lineas = new ArrayList<Linea>();
		
		Personaje personaje = new Personaje();
				
		// mover al personaje
		
		lineas.add(personaje.mover(sur)); // (0, -1) negra
		lineas.add(personaje.mover(este)); // (-1, -1) negra
		personaje.ponerLapizEnBorrador();
		lineas.add(personaje.mover(norte)); // (1, 0) blanca
		personaje.bajarLapiz();
		lineas.add(personaje.mover(este)); // (2, 0) negra
		personaje.levantarLapiz();
		lineas.add(personaje.mover(norte)); // (2, 1) nada
		lineas.add(personaje.mover(norte)); // (2, 2) nada
		
		// creacion de lineas que debieron agregarse al arreglo
		
		Linea linea1 = new Linea(new Posicion(0, 0), new Posicion(0, -1), "negro");
		Linea linea2 = new Linea(new Posicion(0, -1), new Posicion(1, -1), "negro");
		Linea linea3 = new Linea(new Posicion(1, -1), new Posicion(1, 0), "blanco");
		Linea linea4 = new Linea(new Posicion(1, 0), new Posicion(2, 0), "negro");
		Linea linea5 = new Linea(new Posicion(2, 0), new Posicion(2, 1));
		Linea linea6 = new Linea(new Posicion(2, 1), new Posicion(2, 2));
		
		// assertion

		assertTrue(linea1.igualA(lineas.get(0)));
		assertTrue(linea2.igualA(lineas.get(1)));
		assertTrue(linea3.igualA(lineas.get(2)));
		assertTrue(linea4.igualA(lineas.get(3)));
		assertTrue(linea5.igualA(lineas.get(4)));
		assertTrue(linea6.igualA(lineas.get(5)));

	}
	
	*/

}
