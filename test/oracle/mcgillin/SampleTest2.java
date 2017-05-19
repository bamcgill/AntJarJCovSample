package oracle.mcgillin;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest2 {

	@Test
	public final void testHelloworld() {
		Sample2 s = new Sample2();
		assertEquals(Boolean.TRUE, s.helloworld(false));
	}
	
	@Test
	public final void testHelloworld2() {
		Sample2 s = new Sample2();
		assertEquals(Boolean.FALSE, s.helloworld(true));
	}

}
