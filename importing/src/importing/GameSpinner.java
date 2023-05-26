package importing;

public class GameSpinner {
	private int sector;
	public GameSpinner(int s){
		sector = s;
		}
	public int spin(){
		int r = (int) Math.random() * sector + 1;
		return r;
		}
	public int currentRun(){
		int length = 0;
		int x = spin();
		if(spin() == x){
			length++;
		} 
		else {
			return 1;
		}
		return length;
		}
}
