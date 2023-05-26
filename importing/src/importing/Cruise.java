package importing;

public class Cruise {
	private int price;
	private int signup;
	public Cruise(int p, int s) {
		price = p;
		signup = s;
	}
	public int setPrice(int p) {
		return price = p;
	}
	public int checkResponse(String c) {
		if(c.indexOf("cruise") != -1) signup++;
		return signup;
	}
	public int calculateRevenue() {
		if(signup > 300) return signup * (price - 500);
		else if(signup >= 200 && signup < 300) return signup * (price - 350);
		else return signup * price;
	}
}
