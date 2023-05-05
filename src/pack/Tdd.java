package pack;

public class Tdd {
	
	public Tdd() {
		
	}
	
public String welcome(String listeNoms) {
		String listeNomsConcat[]= new String[100];
		String listeNomsMaj[]=new String[100];
		int indConcat=0;
		int indMaj=0;
		String phrase = "";
		if(NomsIsEmpty(listeNoms)) 
			return "Hello, my friend.";
		else {
			String[] noms = listeNoms.split(",");
			for(int i=0;i<noms.length;i++) {
				
				if(noms[i].toUpperCase().equals(noms[i])) {
					listeNomsMaj[indMaj++]=firstMaj(noms[i]);
				}				
				else {
					listeNomsConcat[indConcat++]=firstMaj(noms[i]);
				}
			
			}
			String nomsConcat=nomsConcatenation(listeNomsConcat,indConcat,"and");
			String nomsMaj=nomsConcatenation(listeNomsMaj,indMaj,"AND");
			
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
	
	private String nomsConcatenation(String[] listeNoms,int ind,String fin) {
		String concat = "";
		if(	ind>1) {
			for(int i=0;i<ind-1;i++) {
				concat=concat.concat(", "+listeNoms[i]);
			}
			concat=concat.concat(" "+fin+ " "+listeNoms[ind-1]);
		}else if(ind==1) {
			concat=", "+listeNoms[0];
		}
		return concat;
	}
	
}

