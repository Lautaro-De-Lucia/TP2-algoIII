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
	
}

