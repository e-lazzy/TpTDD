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
	public void testeExi1() {
		assertEquals("Hello, Bob.", tdd.exi1("Bob"));
		assertEquals("Hello, Bob.", tdd.exi1("bob"));
		assertEquals("Hello, .", tdd.exi1(""));
	}

}
