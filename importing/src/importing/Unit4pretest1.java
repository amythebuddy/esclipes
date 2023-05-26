package importing;
import java.util.*;
public class Unit4pretest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(multiplesOf(1,15)));
	}
	public static int[] multiplesOf(int number, int count) {
		int[] arr = new int[count];
		arr[0] = number;
		for(int i = 1; i < arr.length; i++) {
			arr[i] = arr[i - 1] + number;
		}
	return arr;	
	}
}
