package pack;

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
		assertEquals("Hello, Bob.", tdd.exi1("Bob"));
	}
	@Test
	public void testeExi1_2() {
		assertEquals("Hello, Bob.", tdd.exi1("bob"));
	}
	@Test
	public void testeExi1_3() {
		assertEquals("Hello,  .", tdd.exi1(" "));
	}
	
	@Test
	public void testeExi1_4() {
		assertEquals("Hello, Kevin.", tdd.exi1("kevin"));
	}
	
	
}
