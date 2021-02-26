package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineaTest {

	@Test
	public void test01LineaConstruidaPorParametrosCambiaSusAtributos(){
		
		Posicion posInicial =  new Posicion(1,1);
		Posicion posFinal =  new Posicion(1,2);
		LineaSolida unaLinea = new LineaSolida(posInicial, posFinal);
		
		assertEquals(unaLinea.getPunto1(), posInicial);
		assertEquals(unaLinea.getPunto2(), posFinal);
	}
	
	@Test
	public void test02LineaConstruidaPorCopiaEsIgualAOriginal() {
		
		Posicion posInicial =  new Posicion(1,1);
		Posicion posFinal =  new Posicion(1,2);
		LineaSolida unaLinea = new LineaSolida(posInicial, posFinal);
		LineaSolida otraLinea = new LineaSolida(unaLinea);
		
		assertTrue(unaLinea.igualA(otraLinea));
	}
	
	@Test
	public void test03ModificarLinea() {
		
		Posicion posInicial1 =  new Posicion(0,0);
		Posicion posFinal =  new Posicion(0,1);
		Posicion posInicial2 =  new Posicion(1,1);
		
		LineaSolida unaLinea = new LineaSolida(posInicial1, posFinal);
		
		unaLinea.setPunto1(posInicial2);
		
		assertEquals(unaLinea.getPunto1(), posInicial2);
		assertEquals(unaLinea.getPunto2(), posFinal);
	}
	
	/*
	@Test
	public void test04TEMP() {
		
		Posicion posInicial1 =  new Posicion(0,0);
		Posicion posFinal =  new Posicion(0,1);
		Posicion posInicial2 =  new Posicion(1,1);
		
		LineaSolida linea1 = new LineaSolida(posInicial1, posFinal, Color.NEGRO); // (0, 0) / (0, 1) / NEGRO
		LineaSolida linea2 = new LineaSolida(posInicial1, posFinal, Color.NEGRO); // (0, 0) / (0, 1) / NEGRO
		LineaSolida linea3 = new LineaSolida(posInicial2, posFinal, Color.NEGRO); // (1, 1) / (0, 1) / NEGRO
		LineaSolida linea4 = new LineaSolida(posInicial1, posFinal, Color.ROJO); // (0, 0) / (0, 1) / ROJO
		
		// linea1 == linea2
		
		assertTrue(linea1.igualA(linea2));
		
		// linea1 != linea3
		
		assertFalse(linea1.igualA(linea3));
		
		// linea1 != linea4 (por el color)
		
		assertFalse(linea1.igualA(linea4));

	}
	*/
}

