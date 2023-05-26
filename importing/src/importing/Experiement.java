package importing;

import java.util.*;

public class Experiement {

	public static void main(String[] args) {
		/* Write a method called averageVowels that takes an ArrayList of strings 
		 * as a parameter and returns the average number of vowel characters (a, e,i, o, u) 
		 * in all Strings in the list. If your method is passed an empty
		 * ArrayList, it should return 0.0. */
	ArrayList<String> list = new ArrayList<String>(5);
	list.add("what");
	list.add("am");
	list.add("i");
	list.add("doing");
	list.add("here");
	System.out.println(list);
	System.out.println(averageVowels(list));
	}
	public static double averageVowels(ArrayList<String> list) {
		if(list.size() == 0) {
			return 0.0;
		}
		double count = 0.0;
		for (int i = 0; i < list.size(); i++) {
			String value = list.get(i);
			for(int j = 0; j < value.length(); j++) {
				if(value.charAt(j) == 'a' ||value.charAt(j) == 'e'
				|| value.charAt(j) == 'i' || value.charAt(j) == 'o' || value.charAt(j) == 'u') {
				count++;
				} 
			}
		}
		count /= list.size();
		return count;
	}
}
