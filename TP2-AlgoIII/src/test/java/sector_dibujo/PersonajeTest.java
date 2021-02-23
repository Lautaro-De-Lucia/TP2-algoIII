package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonajeTest {

	@Test
	void testElPersonajeDibujaUnaLinea() {
		
		Personaje personaje = new Personaje();
		
		Posicion posicion1 = new Posicion(0,0);
		Posicion posicion2 = new Posicion(0,-1);
		Linea linea = new Linea(posicion1, posicion2, "negro");
		Direccion direccion = new Direccion();
		direccion.sur();
		
		Linea lineaDibujada = personaje.mover(direccion);
		
		assertTrue(linea.igualA(lineaDibujada));
	}
	
	@Test
	void testElPersonajeDibujaLineasAdecuadamente() {
		
		// inicializacion de variables
		
		ArrayList<Linea> lineas = new ArrayList<Linea>();
		
		Direccion norte = new Direccion();
		norte.norte();
		
		Direccion sur = new Direccion();
		sur.sur();
		
		Direccion este = new Direccion();
		este.este();
		
		Direccion oeste = new Direccion();
		oeste.oeste();
		
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

		assertTrue(linea1.igualA(lineas.get(0)));
		assertTrue(linea2.igualA(lineas.get(1)));
		assertTrue(linea3.igualA(lineas.get(2)));
		assertTrue(linea4.igualA(lineas.get(3)));
		assertTrue(linea5.igualA(lineas.get(4)));
		assertTrue(linea6.igualA(lineas.get(5)));

	}

}
