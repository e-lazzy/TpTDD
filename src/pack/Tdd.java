package pack;

public class Tdd {
	
	public Tdd() {
		
	}
	
public String welcome(String nom) {
		if(nom==null || nom.isEmpty() || nom.isBlank() || "".equals(nom)) 
			return "Hello, my friend.";
		else if(nom.toUpperCase().equals(nom)) {
			return "HELLO, "+ nom + " !";
		}
		
		else
			return "Hello, " + nom.substring(0, 1).toUpperCase() + nom.substring(1)+ ".";
	}

}