package importing;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(2));
	}
	public static int sum(int n) {
		if(n == 0) 
			return 0;
		else if(n == 1)
			return 1;
		else 
			return n + sum(n-1);
	}
}
