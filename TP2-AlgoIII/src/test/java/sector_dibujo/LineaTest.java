package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineaTest {

	@Test
	public void testLinea() {
		Posicion Posinicial =  new Posicion(1,1);
		Posicion Posfinal =  new Posicion(2,2);
		Linea nuevaLinea = new Linea(Posinicial, Posfinal);

		assertEquals(nuevaLinea.getOrigen(), Posinicial);
		assertEquals(nuevaLinea.getDestino(), Posfinal);
	}

	@Test
	public void LineasIgualASiMisma(){
		Posicion Posinicial =  new Posicion(1,1);
		Posicion Posfinal =  new Posicion(2,2);
		Linea nuevaLinea = new Linea(Posinicial, Posfinal);

		assertTrue(nuevaLinea.igualA(nuevaLinea));
	}

}
