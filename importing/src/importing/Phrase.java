package importing;

public class Phrase {
	private String currentPhrase;
	public Phrase(String p) {
		currentPhrase = p;
	}
	public int findNthOccurrence(String str, int n) {
		int occur = 0;
		for(int i = 0; i < currentPhrase.length(); i++) {
			if(currentPhrase.equals(str)) occur++;
			if(occur == n) break;
			}
		return occur;
	}

}
