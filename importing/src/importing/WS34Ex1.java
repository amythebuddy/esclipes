package importing;

public class WS34Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Diameter of the circular path: " + distance(0,0,3,4));
		System.out.println("The circumference of the trip is " + roadTrip(5));	
		stopTour();
		
		//Crystal Mountain, Fillydelphia, Attle Loosa, Unicorn Range
		System.out.println("The total distance of the trip: " + totalTrip(20,3,31,11,20,18,10,10));
	}
	public static double distance(double x1, double y1, double x2, double y2) {
		double x = Math.pow(x2-x1,2);
		double y = Math.pow(y2-y1,2);
		return Math.sqrt(x+y);
	}
	public static double roadTrip(double d) {
		return Math.PI * d;
		 
	}
	public static void stopTour() {
		//Ponyville (16,14) Manehatten (34,8) Baltimare (29,16)
		System.out.println("Distance between Ponyville and Manhatten: " + distance(16,14,34,7));
		
		System.out.println("Distance between Ponyville and Baltimare: " + distance(16,14,29,16));
		
		System.out.println("Distance between Manhatten and Baltimare: " + distance(34,8,29,16));
	}
	public static double totalTrip(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		// A circle trip
		double start = distance(x1,y1,x2,y2);
		double stillFar = distance(x2,y2,x3,y3);
		double halfway = distance(x3,y3,x4,y4);	
		double finish = distance(x4,y4,x1,y1);
		return start + stillFar + halfway + finish;
	}
}
