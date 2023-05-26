package importing;
import java.util.*;
public class BattlePokemon {
	static Scanner pokemon = new Scanner(System.in);
 public String pokemonName = pokemon.nextLine();
	public static void main(String[] args) {
		battleStart();
		damage("Arcaine");
		statsTable("Arcaine", 40, 96, 51, 52, 121, 81, 107, "Thunder Wave", "Hidden Power", "Psycho Cut", "Recover");
	}
	public static void battleStart() {
		System.out.println("Another trainer is issuing a challenge!\n" 
							+ "Zebstrika appeared.");
		System.out.print("Which Pokemom do you choose? ");
		String pokemonName = pokemon.nextLine();
		
		System.out.println("You chose " + pokemonName + "!\n"
							+ "It's a Pokemon battle between " + pokemonName + " and Zebstrika!	Go!");
	}
	public static void damage(String pokemonName) {	
		System.out.println("Zebstrika used Thunderbolt!\n");
		System.out.println("Trainer, what are your " + pokemonName + "'s stats?");
		System.out.print("Level: ");
		int level = pokemon.nextInt();
		System.out.print("Attack: ");
		int attack = pokemon.nextInt();
		System.out.print("Defense: ");
		int defense = pokemon.nextInt();
		System.out.print("Base: ");
		int base = pokemon.nextInt();
		System.out.print("STAB: ");
		int stab = pokemon.nextInt();
		System.out.print("HP: ");
		int hp = pokemon.nextInt();
		
		double min = 0.85, max = 1.0;
		int modifier = (int) (stab * Math.floor(Math.random()*(max-min+1) + min));
		int damage = ((2*level+10)/250 + (attack/defense) * base + 2) * modifier;
		int afterDamage = hp - damage;
		
		System.out.println(pokemonName + " sustained " + damage + " points damage.\n" 
							+ "HP, after damage, are now " + afterDamage);
		System.out.println();
	}
	public static void statsTable(String pokemonName, int level, int hp, int attack, int defense, int spAtk, int spDef, int speed, String learnedMoves1, String learnedMoves2, String learnedMoves3, String learnedMoves4) {
		System.out.println("Name		" + pokemonName);
		System.out.println("Level		" + level);
		line();
		System.out.println("HP		" + hp);
		System.out.println("ATTACK		" + attack);
		System.out.println("DEFENSE		" + defense);
		System.out.println("SP. ATK		" + spAtk);
		System.out.println("SP. DEF		" + spDef);
		System.out.println("SPEED		" + speed);
		line();
		System.out.println("Moves Learned: " + learnedMoves1 + ", " + learnedMoves2 + ", " +learnedMoves3 + ", " +learnedMoves4);
	}
	public static void line() {
		System.out.println("------------------------------");
	}
}


