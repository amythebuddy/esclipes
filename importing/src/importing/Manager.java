package importing;

import java.util.Scanner;

public class Manager extends Employee {
	@Override
	public double getSalary() {
		return super.getSalary() + 8000;
	}
	@Override
	public double getVacationDays() {
		return super.getSalary() + 5;
	}
	void checkOrder() { // updating order
			Scanner input = new Scanner(System.in);
			boolean cont = true;
			boolean more = true;
			while(cont) {
			System.out.print("Manager, please press number from 1 to 3\n"
					+ "List order (1), update order (2)\n"
					+ "Close order (3)");
			int in = input.nextInt();
				switch(in) {
				case 1:
					showOrder();
					break;
				case 2:
					while(more == true) {
						System.out.print("What item you want to change ? ");
						int index = input.nextInt();
						System.out.print("Please enter the new amount: ");
						int amount = input.nextInt();
						orderList.set(index, amount);
						System.out.print("Do you want to change more ? Enter true for yes or false for no.");
						more = input.nextBoolean();
					}
					break;
				case 3:
					cont = false;
					break;
				}
			}
			input.close();
		}
		
	}


