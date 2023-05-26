package importing;
import java.util.*;
public class Unit4pretest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0};
		System.out.println(Arrays.toString(reverseArray(arr)));
	}
	public static int[] reverseArray(int[] arr) {
		for(int i = 0; i < arr.length / 2; i++) {
			int x = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = x;
		}
		return arr;
	}
}
