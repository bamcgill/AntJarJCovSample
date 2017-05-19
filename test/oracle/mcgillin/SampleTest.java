package oracle.mcgillin;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public final void testHelloworld() {
		Sample s = new Sample();
		assertEquals(Boolean.TRUE, s.helloworld(false));
	}
	
	@Test
	public final void testHelloworld2() {
		Sample s = new Sample();
		assertEquals(Boolean.FALSE, s.helloworld(true));
	}

}
