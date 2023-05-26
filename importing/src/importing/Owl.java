package importing;
import java.util.*;
public abstract class Owl extends Bird {
	public Owl(String name) {
		super(name, "hoot");
	}
}
class SnowyOwl extends Owl {
	public SnowyOwl() {
		super("Snow owl");
	}
	public String getFood() {
		Random rand = new Random();
		int r = rand.nextInt(3);
		String[] food = {"hare", "small bird", "lemming"};
		return food[r];
	}
}
class ElfOwl extends Owl {

	public ElfOwl() {
		super("Elf owl");
	}
	public String getFood() {
		return "insects";
	}
}

