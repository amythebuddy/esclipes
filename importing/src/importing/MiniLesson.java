package importing;
import java.util.*;

public class MiniLesson {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Sentence: ");
	String phrase = input.nextLine();
char letter = input.next().charAt(0);
	int vowel = 0;
	int count = 0; phrase.toLowerCase();
	
	for(int i = 0; i < phrase.length(); i++) {
		if(phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u') {
			
			vowel++;
		}
		if(phrase.charAt(i) == letter) {
			count++;
		}
	}
	System.out.println(count);
	System.out.println(vowel);
	input.close();
	}
}




