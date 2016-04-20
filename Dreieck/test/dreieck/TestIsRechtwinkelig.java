/*
 * @author Johannes Bishara
 * @version 2016-04-19
 * 
 */
package dreieck;

import static org.junit.Assert.*;

import org.junit.*;

public class TestIsRechtwinkelig{

		int seite_a;
		int seite_b;
		int seite_c;
		
		private Dreieck dreieck;
		
		@Before
		public void setUp() {
			dreieck = new Dreieck(seite_a, seite_b, seite_c);
		}

	@Test
	public void istDreieckRechtwinkligTrue1() {
		dreieck.setSeite_a(9);
		dreieck.setSeite_b(12);
		dreieck.setSeite_c(15);
			
		assertTrue(dreieck.istDreieck() && dreieck.rechtWinkelig());
	}
		
	@Test
	public void istDreieckRechtwinkligTrue2() {
		dreieck.setSeite_a(15);
		dreieck.setSeite_b(9);
		dreieck.setSeite_c(12);
		
		assertTrue(dreieck.istDreieck() && dreieck.rechtWinkelig());
	}
		
	@Test
	public void istDreieckRechtwinkligTrue3() {
		dreieck.setSeite_a(12);
		dreieck.setSeite_b(15);
		dreieck.setSeite_c(9);
			
		assertTrue(dreieck.istDreieck() && dreieck.rechtWinkelig());
	}
		
	@Test
	public void istDreieckRechtwinkligFalse() {
		dreieck.setSeite_a(8);
		dreieck.setSeite_b(7);
		dreieck.setSeite_c(6);
			
		assertFalse(dreieck.rechtWinkelig());
	}
		
	@Test
	public void istDreieckFalseRechtwinklig() {
		dreieck.setSeite_a(-1);
		dreieck.setSeite_b(-5);
		dreieck.setSeite_c(2);
			
		assertFalse(dreieck.rechtWinkelig());
	}
}