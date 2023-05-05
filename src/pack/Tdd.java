package pack;

public class Tdd {
	
	public Tdd() {
		
	}
	
public String welcome(String listeNoms) {
		String nomsConcat="";
		String hello="";
		String point = ".";
		if(NomsIsEmpty(listeNoms)) 
			return "Hello, my friend.";
		else {
			String[] noms = listeNoms.split(",");
			for(int i=0;i<noms.length;i++) {
				
				if(noms[i].toUpperCase().equals(noms[i])) {
					nomsConcat=nomsConcat.concat(", "+firstMaj(noms[i]));
					hello="HELLO";
					point=" !";
				}				
				else {
					nomsConcat=nomsConcat.concat(", "+firstMaj(noms[i]));
					hello="Hello";
				}
			
			}
			return hello + nomsConcat + point;
		}
	}
	private String firstMaj(String mot) {
		return mot.substring(0, 1).toUpperCase() + mot.substring(1);
	}
	private boolean NomsIsEmpty(String listeNoms) {
		return listeNoms==null || listeNoms.isEmpty() || listeNoms.isBlank() || "".equals(listeNoms);
	}
	
}

