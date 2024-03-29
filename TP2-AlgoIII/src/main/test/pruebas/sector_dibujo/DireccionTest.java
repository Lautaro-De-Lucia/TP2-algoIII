package pruebas.sector_dibujo;

import static org.junit.jupiter.api.Assertions.*;

import modelo.sector_dibujo.Direccion;
import org.junit.jupiter.api.Test;

public class DireccionTest {

	@Test
	public void test01CrearDireccionVerificarEstadoInicial() {
		
		Direccion unaDireccion = new Direccion();
		
		assertEquals(0, unaDireccion.obtenerLongitud());
		assertEquals(0, unaDireccion.obtenerLatitud());				
		
	}
	
	@Test
	public void test02CrearDireccionCambiarANorteYVerificarLatYLong() {
		
		Direccion unaDireccion = new Direccion();
		unaDireccion.norte();
		
		assertEquals(0, unaDireccion.obtenerLongitud());
		assertEquals(1, unaDireccion.obtenerLatitud());			
		
	}
	
	@Test
	public void test03DireccionesContrariasSeCancelan() {
		
		Direccion unaDireccion = new Direccion();
		Direccion otraDireccion = new Direccion();

		unaDireccion.norte(); 
		otraDireccion.sur();
		
		assertEquals(0, unaDireccion.obtenerLongitud());
		assertEquals(0, otraDireccion.obtenerLongitud());
		assertEquals(0, unaDireccion.obtenerLatitud() + otraDireccion.obtenerLatitud());
		
		unaDireccion.este(); 
		otraDireccion.oeste();
		
		assertEquals(0, unaDireccion.obtenerLatitud());
		assertEquals(0, otraDireccion.obtenerLatitud());
		assertEquals(0, unaDireccion.obtenerLongitud() + otraDireccion.obtenerLongitud());
		
	}


}
