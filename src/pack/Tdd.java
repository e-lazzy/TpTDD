package pack;

public class Tdd {
	
	public Tdd() {
		
	}
	
public String welcome(String listeNoms) {
		String nomsConcat="";
		String nomsMaj="";
		String phrase = "";
		if(NomsIsEmpty(listeNoms)) 
			return "Hello, my friend.";
		else {
			String[] noms = listeNoms.split(",");
			for(int i=0;i<noms.length;i++) {
				
				if(noms[i].toUpperCase().equals(noms[i])) {
					nomsMaj=nomsMaj.concat(", "+firstMaj(noms[i]));
				}				
				else {
					nomsConcat=nomsConcat.concat(", "+firstMaj(noms[i]));
				}
			
			}
			if(NomsIsEmpty(nomsMaj))
				phrase="Hello"+ nomsConcat +".";
			else if(NomsIsEmpty(nomsConcat))
				phrase="HELLO"+nomsMaj+ " !";
			else
				phrase="Hello"+ nomsConcat +". AND HELLO"+nomsMaj+ " !";
			return phrase;
		}
	}
	private String firstMaj(String mot) {
		return mot.substring(0, 1).toUpperCase() + mot.substring(1);
	}
	
	private boolean NomsIsEmpty(String listeNoms) {
		return listeNoms==null || listeNoms.isEmpty() || listeNoms.isBlank() || "".equals(listeNoms);
	}
	
}

