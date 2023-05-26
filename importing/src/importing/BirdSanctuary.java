package importing;

public class BirdSanctuary {
	private SnowyOwl snowOwl;
	private ElfOwl elfOwl;
	private Bird[] birdList;
	public BirdSanctuary(SnowyOwl snow, ElfOwl elf) {
		snowOwl = snow;
		elfOwl = elf;
	}
	public void allEat() {
		for(Bird b : birdList) {
			System.out.println(b.getName() + "eats" + b.getFood());
		}
	}
}
