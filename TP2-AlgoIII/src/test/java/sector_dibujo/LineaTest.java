package sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LineaTest {

	@Test
	public void test01LineaConstruidaPorParametrosCambiaSusAtributos(){
		
		Posicion posInicial =  new Posicion(1,1);
		Posicion posFinal =  new Posicion(1,2);
		Linea unaLinea = new Linea(posInicial, posFinal);
		
		assertEquals(unaLinea.getPunto1(), posInicial);
		assertEquals(unaLinea.getPunto2(), posFinal);
	}
	
	@Test
	public void test02LineaConstruidaPorCopiaEsIgualAOriginal() {
		
		Posicion posInicial =  new Posicion(1,1);
		Posicion posFinal =  new Posicion(1,2);
		Linea unaLinea = new Linea(posInicial, posFinal);
		Linea otraLinea = new Linea(unaLinea);
		
		assertTrue(unaLinea.igualA(otraLinea));
	}
	
	@Test
	public void test03ModificarLinea() {
		
		Posicion posInicial1 =  new Posicion(0,0);
		Posicion posFinal =  new Posicion(0,1);
		Posicion posInicial2 =  new Posicion(1,1);
		
		Linea unaLinea = new Linea(posInicial1, posFinal);
		
		unaLinea.setPunto1(posInicial2);
		
		assertEquals(unaLinea.getPunto1(), posInicial2);
		assertEquals(unaLinea.getPunto2(), posFinal);
	}
	
}

