/*
 * @author Johannes Bishara
 * @version 2016-04-19
 * 
 */
package dreieck;

import static org.junit.Assert.*;

import org.junit.*;

public class TestIstDreieckGleichseitig {

	int seite_a;
	int seite_b;
	int seite_c;
	
	private Dreieck dreieck;
	
	@Before
	public void setUp() {
		dreieck = new Dreieck(seite_a, seite_b, seite_c);
	}
	
	@Test
	public void istDreieckGleichseitig() {
		dreieck.setSeite_a(3);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(3);
		
		assertTrue(dreieck.istDreieck() && dreieck.gleichSeitig());
	}
	
	@Test
	public void istDreieckNichtGleichseitig() {
		dreieck.setSeite_a(2);
		dreieck.setSeite_b(3);
		dreieck.setSeite_c(1);
		
		assertFalse(dreieck.gleichSeitig());
	}
}