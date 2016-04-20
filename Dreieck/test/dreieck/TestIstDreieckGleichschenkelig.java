/*
 * @author Johannes Bishara
 * @version 2016-04-19
 * 
 */
package dreieck;

import static org.junit.Assert.*;

import org.junit.*;

public class TestIstDreieckGleichschenkelig {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	@Test
	public void istDreieckGleichschenkligAB() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(5);
		
		assertTrue(dreieck.istDreieck() && dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istDreieckGleichschenkligAC() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(5);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
	
	@Test
	public void istDreieckGleichschenkligBC() {
		dreieck.setSeite_a(5);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.gleichSchenkelig());
	}
}
