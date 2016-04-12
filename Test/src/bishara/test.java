package bishara;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {
	StringTokenizer st;
	@Before
	public void setUp() throws Exception {
		st = new StringTokenizer("Hallo Welt");
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testNextTokenSpaceDelimiter() {
		st = new StringTokenizer("Hallo Welt");
		assertEquals("Hallo", st.nextToken());
	}
	
	@Test
	public void testNextTokenTabulatorDelimiter() {
		st = new StringTokenizer("Hallo\tWelt");
		assertEquals("Hallo", st.nextToken());
	}
	
	@Test
	public void testNextTokenNewLineDelimiter() {
		st = new StringTokenizer("Hallo\nWelt");
		assertEquals("Hallo", st.nextToken());
	}
	
	@Test
	public void testNextTokenCarriageDelimiter() {
		st = new StringTokenizer("Hallo\rWelt");
		assertEquals("Hallo", st.nextToken());
	}
	
	@Test
	public void testNextTokenFormFeedDelimiter() {
		st = new StringTokenizer("Hallo\fWelt");
		assertEquals("Hallo", st.nextToken());
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testNextTokenWithoutExistingToken() {
		st = new StringTokenizer("");
		st.nextToken();
	}

	@Test(expected=NoSuchElementException.class)
	public void testOnlySpaceDelimiter() {
		st = new StringTokenizer(" ");
		st.nextToken();
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testOnlyTabulatorDelimiter() {
		st = new StringTokenizer("\t");
		st.nextToken();
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testOnlyNewLineDelimiter() {
		st = new StringTokenizer("\n");
		st.nextToken();
	}
}