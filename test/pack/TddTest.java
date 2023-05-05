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
	
	@Test
	public void testeExi4_1() {
		assertEquals("Hello, Zack and Belette.", tdd.welcome("Zack,Belette"));
	}
	
	@Test
	public void testeExi4_2() {
		assertEquals("Hello, Zack and Belette.", tdd.welcome("zack,belette"));	
	}
	 
	@Test
	public void testeExi4_3() {
		assertEquals("Hello, Zack and Belette.", tdd.welcome("zack,Belette"));	
	}
	
	@Test
	public void testeExi4_4() {
		assertEquals("Hello, Zack and Belette.", tdd.welcome("zack,belette"));	
	}
	
	@Test
	public void testeExi5_1() {
		assertEquals("Hello, Zack, Belette and Marmotten.", tdd.welcome("zack,belette,marmotten"));	
	}
	@Test
	public void testeExi5_2() {
		assertEquals("Hello, Zack, Belette, Marmotten, Kevin and PHilipe.", tdd.welcome("zack,Belette,marmotten,Kevin,pHilipe"));	
	}
	
	@Test
	public void testeExi6_1() {		
		assertEquals("Hello, Zack and Philipe. AND HELLO, BELETTE !", tdd.welcome("Zack,BELETTE,philipe"));	
	}
	
	@Test
	public void testeExi6_2() {
		assertEquals("Hello, Bob, Zack and PHilipe. AND HELLO, BELETTE AND MARMOTTEN !", tdd.welcome("bob,BELETTE,MARMOTTEN,Zack,pHilipe"));	
	}
	
	@Test
	public void testeExi7_1() {
		assertEquals("Hello, Bob, Zack and PHilipe. AND HELLO, BELETTE AND MARMOTTEN !", tdd.welcome("bob,BELETTE,MARMOTTEN,Zack,pHilipe"));
	}
	
	@Test
	public void testeExi7_2() {
		assertEquals("Hello, Bob, Zack and PHilipe. AND HELLO, BELETTE !", tdd.welcome("bob,BELETTE,Zack,pHilipe"));
	}
	
	@Test
	public void testeExi7_3() {
		assertEquals("Hello, Bob. AND HELLO, BELETTE AND MARMOTTEN !", tdd.welcome("bob,BELETTE,MARMOTTEN"));
	}
}
