package importing;
import java.util.*;

public class Testing {

	public static void main(String[] args) {
		int[] number = {10,-2,4,-4,9,-5,19,-7,-39,-1};
		int[] array = Arrays.copyOf(number, number.length*2);
		int[] arr = Arrays.copyOfRange(number, 0, 3);
		Arrays.fill(number, 42);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(number));
		int[] list = {36, 12, 25, 19, 46, 31,22};
		System.out.println(range(list));
		int[] data = {27,15,11,15,27};
		System.out.println(mode(data));
	}
	public static int range(int[] arr2) {
		Arrays.sort(arr2);
		int max = arr2[arr2.length-1];
		int min = arr2[0];
		return max - min + 1;
	}
	public static int mode(int[] array) {
		int[] spareArray = new int[101];
		for (int i = 0; i < array.length; i++) {
	        spareArray[array[i]]++;
	    }
		int mode = 101;
	    int count = 0;
	    for (int i = 0; i < spareArray.length; i++) {
	        if (spareArray[i] > count) {
	            count = spareArray[i];
	            mode = i;
	        }
	    }
	    
	    return mode;
	}

}