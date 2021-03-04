package pruebas.sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import modelo.sector_dibujo.LineaSolida;
import modelo.sector_dibujo.Posicion;
import org.junit.jupiter.api.Test;

public class LineaTest {
	
	@Test
	public void test01LineaConstruidaPorParametrosCambiaSusAtributos(){
		
		Posicion posInicial =  new Posicion(8,8);
		Posicion posFinal =  new Posicion(8,9);
		LineaSolida unaLinea = new LineaSolida(posInicial, posFinal);
		
		assertEquals(unaLinea.getPunto1(), posInicial);
		assertEquals(unaLinea.getPunto2(), posFinal);
	}
	
	@Test
	public void test02LineaConstruidaPorCopiaEsIgualAOriginal() {
		
		Posicion posInicial =  new Posicion(8,8);
		Posicion posFinal =  new Posicion(8,9);
		LineaSolida unaLinea = new LineaSolida(posInicial, posFinal);
		LineaSolida otraLinea = new LineaSolida(unaLinea);
		
		assertTrue(unaLinea.igualA(otraLinea));
	}
	
	@Test
	public void test03ModificarLinea() {
		
		Posicion posInicial1 =  new Posicion(7,7);
		Posicion posFinal =  new Posicion(7,8);
		Posicion posInicial2 =  new Posicion(8,8);
		
		LineaSolida unaLinea = new LineaSolida(posInicial1, posFinal);
		
		unaLinea.setPunto1(posInicial2);
		
		assertEquals(unaLinea.getPunto1(), posInicial2);
		assertEquals(unaLinea.getPunto2(), posFinal);
	}
	
}

