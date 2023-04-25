package pack;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TddTest {
	Tdd tdd;
	@BeforeEach
	public void initialisation(){
		tdd = new Tdd();
		
	}

	@Test
	public void testeExi1_1() {
		assertEquals("Hello, Bob.", tdd.welcome("Bob"));
	}
	@Test
	public void testeExi1_2() {
		assertEquals("Hello, Bob.", tdd.welcome("bob"));
	}
	@Test
	public void testeExi1_3() {
		assertNotEquals("Hello, kiki.", tdd.welcome("Kiki"));
	}
	
	@Test
	public void testeExi1_4() {
		assertEquals("Hello, Kevin.", tdd.welcome("kevin"));
	}
	
	@Test
	public void testeExi2_1() {
		assertEquals("Hello, my friend.", tdd.welcome(""));
	}
	
	@Test
	public void testeExi2_2() {
		assertEquals("Hello, my friend.", tdd.welcome(null));
	}
	
	@Test
	public void testeExi2_3() {
		assertEquals("Hello, my friend.", tdd.welcome("  "));
	}
	
	@Test
	public void testeExi3_1() {
		assertEquals("HELLO, BELETTE !", tdd.welcome("BELETTE"));
	}
	
	@Test
	public void testeExi3_2() {
		assertEquals("HELLO, FRANCOIS !", tdd.welcome("FRANCOIS"));
	}
	
	@Test
	public void testeExi3_3() {
		assertEquals("Hello, BERNAD.", tdd.welcome("bERNAD"));
	}
	
	@Test
	public void testeExi3_4() {
		assertEquals("Hello, ZaCk.", tdd.welcome("ZaCk"));
	}
}
