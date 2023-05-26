package importing;

import java.util.ArrayList;

public class Employee {
	protected ArrayList<Integer> orderList; // every employee has access to the order
	public double getSalary() {
		return 2000;
	}
	public double getVacationDays() {
		return 10;
	}
	public void showOrder() {
		System.out.print("The order is ");
		for(int i = 0; i < orderList.size(); i++) {
			System.out.print(orderList.get(i));
			switch(i) {
			case 0:
				System.out.print(" Hamburgers ");
				break;
			case 1:
				System.out.print(" Hot Dogs ");
				break;
			case 2: 
				System.out.print(" French Fries ");
				break;
			case 3: 
				System.out.print(" Drinks ");
				break;
			case 4: 
				System.out.print(" Desserts\n");
				break;
			}
		}
	}
	
}

