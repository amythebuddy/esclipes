package importing;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class Restaurant{
	private Manager manag;
	private static double[] price = {2.5, 1.5, 1.8, 2, 3};
	public static void main(String[] args) {
		System.out.println("Welcome to the restaurant! What would you like to order?\n"
				+ "\nPlease press number 1 for Hamburger($2.50), number 2 for Hot Dogs($1.50)\n"
				+ "number 3 for French Fries($1.80), number 4 for Drinks($2)\n"
				+ "and number 5 for Dessert($3).");
		int[] order = new int[5];
		int[] order1 = new int[5];
		
		takeOrder(order);
		takeOrder(order1);

		bill(order);
		bill(order1);
	}
	static Scanner input;
	public static void takeOrder(int[] order){
		input = new Scanner(System.in);
		orderNumber();
		int c = 0;
		while(c != 9) {
		System.out.print("Number: ");
		int food = input.nextInt();
		System.out.print("Quantity: ");
		int quantity = input.nextInt();
		switch(food) { //ordering
		case 1:
			order[0] = quantity;
			break;
		case 2:
			order[1] = quantity;
			break;
		case 3: 
			order[2] = quantity;
			break;
		case 4:
			order[3] = quantity;
			break;
		case 5:
			order[4] = quantity;
			break;
		}
		System.out.println("Do you want to order more? Press any number to order more\n"
				+ "If not, press 9");
		c = input.nextInt();
		
		}
	}
	public String timeTagged() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm a");
		String time = format.format(LocalTime.now());
		return time;
	}
	static int num = 0;
	public static void orderNumber() {
		num++;
		System.out.println("Order# " + num);
		}
	
	public static void bill(int[] o) {
		double total = 0;
		for(int i = 0; i < o.length; i++) {
			total += price[i] * o[i];
		}
		System.out.println("Your order is $" + total);
		System.out.print("Please enter your money: ");
		double pay = input.nextDouble();
		if(pay < total) {
			System.out.println("You don't have enough money. Please come back when you do.");
		} else if(pay > total){
			System.out.println("Here is your change: " + (pay - total)
					+ "\n Thanks for coming!");
		} else {
			System.out.println("Please come back next time!");
		}
		
	}
}
