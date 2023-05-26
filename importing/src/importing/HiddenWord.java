package importing;

public class HiddenWord {
	private String hiddenWord;
	public HiddenWord(String word) {
	hiddenWord = word;
	}
	public void getHint(String guess){
	String ret = "";
	String w = getW();
		for(int a = 0; a < hiddenWord.length(); a++){     
		String check = guess.substring(a, a + 1);     
			if(hiddenWord.indexOf(check) != -1 && hiddenWord.indexOf(check) != a){  
				ret = ret + "+";    }
			else if(w.indexOf(check) == a){ 
				ret = ret + check;    
			}
			else {
				ret = ret + "*";  }
			}
	System.out.println(ret);
	}
	
	public String getW() {
		return hiddenWord;
	}
}
