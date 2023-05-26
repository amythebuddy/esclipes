package importing;

public class APLine {
	private double a;
	private double b;
	private double c;
	public APLine(int a, int b, int c) {
		if(a == 0 || b==0) {
			throw new IllegalArgumentException("a or b can't be 0");
		} else {
		this.a = a;
		this.b = b;
		this.c = c;
		}
	}
	public double getSlope() {
		return -a/b;
	}
	public boolean isOnline(int x, int y) {
		double result = a*x + b*y + c;
		if(result == 0.0){
			return true;
		} else {
			return false;
		}
	}
}
