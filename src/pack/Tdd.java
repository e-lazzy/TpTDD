package pack;

public class Tdd {
	
	public Tdd() {
		
	}
	
	public String exi1(String nom) {
		
		return "Hello, " + nom.substring(0, 1).toUpperCase() + nom.substring(1)+ ".";
	}
	
public String exi2(String nom) {
		if(nom==null || nom.isEmpty() || nom.isBlank() || "".equals(nom)) 
			return "Hello, my friend.";
		else
			return "Hello, " + nom.substring(0, 1).toUpperCase() + nom.substring(1)+ ".";
	}
}

