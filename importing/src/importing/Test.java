package importing;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner coordinate = new Scanner(System.in);
		double x1,y1,x2,y2,x3,y3;
		System.out.print("x1 value: ");
		 x1 = coordinate.nextDouble();
		System.out.print("y1 value: ");
		 y1 = coordinate.nextDouble(); 
		System.out.print("x2 value: ");
		 x2 = coordinate.nextDouble(); 
		 System.out.print("y2 value: ");
		 y2 = coordinate.nextDouble(); 
		 System.out.print("x3 value: ");
		 x3 = coordinate.nextDouble(); 
		 System.out.print("y3 value: ");
		 y3 = coordinate.nextDouble(); 

		 System.out.println("Total trip is " + totalTrip(x1,y1,x2,y2,x3,y3));
		 coordinate.close();
	}
	public static double distance(double x1, double y1, double x2, double y2) {
		double x = Math.pow(x2-x1,2);
		double y = Math.pow(y2-y1,2);
		return Math.sqrt(x+y);
	}
	public static double totalTrip(double x1, double y1, double x2, double y2, double x3, double y3) {
		double start = distance(x1,y1,x2,y2);
		double stillFar = distance(x2,y2,x3,y3);
		double halfway = distance(x3,y3,x1,y1);	
	 return start + stillFar + halfway;
	}
}
