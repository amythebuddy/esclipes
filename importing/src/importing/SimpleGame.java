package importing;
import java.util.*;
public class SimpleGame {
	static Random rand = new Random();
	static int dice = rand.nextInt(6) + 1;
	public static void main(String[] args) {
		System.out.println("Welcome to The Pig Dice Game!\n"
				+ "You are going to play against a computer.\n"
				+ "\nThe rule:\n"
				+ "You will roll a dice and score as many points as the number on the dice,\n"
				+ "You can continue rolling and adding up your points\n"
				+ "If you roll a 1 then you lose all the point you are having and the computer roll\n" 
				+ "Or you can choose to hold and the computer will start to roll\n"
				+ "You will win when you reach 50 points!\n"
				+ "Press 1 to roll or press 2 to hold\n"
				+ "You will go first!\n");
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		int playerPoints = 0;
		int computerPoints = 0;
		while(playerPoints < 50 || computerPoints < 50) {
			while(dice != 1 && playerPoints < 50) {
				repeated();
				playerPoints += dice;
				System.out.println("Your points are " + playerPoints);
				System.out.print("Roll(1) or Hold(2): ");
				int nextStep = input.nextInt();
				System.out.println();
				if(nextStep == 1) {
				dice = rand.nextInt(6) + 1;
				} else {
					System.out.println("You chosed to hold.\n");
					break;
				}
			}
			if(playerPoints > 50) {
				System.out.println("Congratulations! \n"
						+ "You won against the computer!");
				break;
			} else if(dice == 1) {
				repeated();
				playerPoints = 0;
				System.out.println("Your points are now 0 :( \n");
			}
		System.out.println("It's the computer's turn!\n");
		dice = rand.nextInt(6) + 1;
			while(dice != 1 && computerPoints < 50) {
				System.out.println("The computer got a " + dice);
				int roll = rand.nextInt(2)+1;
				computerPoints += dice;
				System.out.println("Computer's points are now " + computerPoints);
				if(roll == 1) {
				System.out.println("Computer chose to continue\n");
				dice = rand.nextInt(6) + 1;
				} else {
				System.out.println("Computer chose to hold.\n");
				break;
				}
			}
			if(computerPoints > 50) {
				System.out.println("The computer won! \n"
						+ "You lost against the computer :(");
				break;
			}else if(dice == 1) {
				System.out.println("The computer got a " + dice + ".");
				computerPoints = 0;
				System.out.println("Computer's points are now 0 :) \n");
		}
			System.out.println("It's your turn!\n");
		}
		input.close();
	}
	
	public static void repeated() {
		System.out.println("You got a " + dice + ".");
	}
	}
