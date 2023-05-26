package importing;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] m = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		Trail t = new Trail(m);
		APLine a = new APLine(5,4,-17);
		double slope1 = a.getSlope();
		System.out.println(t.isDifficult());
		System.out.println(slope1);
		System.out.println(t.isLevelTrailSegment(7, 12));
	}

}
