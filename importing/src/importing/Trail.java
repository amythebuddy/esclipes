package importing;

public class Trail {
	private int[] markers;
	public Trail(int[] m) {
		markers = m;
	}
	public boolean isDifficult() {
		int changes = 0;
		for(int i = 0; i < markers.length-1; i++){
			if(markers[i+1] - markers[i] >= 30 || markers[i+1] - markers[i] <= -30) {
				changes++;
			}
		}
		if(changes > 2) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isLevelTrailSegment(int start, int end){
		int biggest = markers[start];
		int smallest = markers[start];
		for(int i = start; i < end; i++) {
			if(markers[i] < smallest) {
				smallest = markers[i];
			}
			if(biggest < markers[i]){
				biggest = markers[i];
			}
		}
		if(biggest - smallest > 10) {
			return false;
		} else {
			return true;
		}
	}
}
