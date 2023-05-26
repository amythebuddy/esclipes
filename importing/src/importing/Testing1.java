package importing;
import java.util.*;
public class Testing1 {

	public static void main(String[] args) {
		HiddenWord puzzle = new HiddenWord("HARPS");
		puzzle.getHint("AAAAA");
		puzzle.getHint("HELLO");
		puzzle.getHint("HEART");
		puzzle.getHint("HARMS");
		puzzle.getHint("HARPS");

	}
	public static int arraySum(int arr[]){ 
		int sum = 0;   
		for(int s : arr){sum += s;   }
		return sum;
	}
	public static int[] rowSums(int [][] arr2D){
		int[] rowS = new int[arr2D.length];
		for(int a = 0; a < arr2D.length; a++){
			rowS[a] = arraySum(arr2D[a]);
		}
		return rowS;
	}
	public static boolean isDiverse(int[][] arr2D) {
		int[] arr = rowSums(arr2D);
		Arrays.sort(arr);
		for(int a = 0; a < arr.length - 1; a++) {
			if(arr[a] != arr[a + 1]) {
				return true;
			}
		}
		return false;
	}
}
