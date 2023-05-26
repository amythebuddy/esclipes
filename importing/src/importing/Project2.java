package importing;
import java.util.*;
public class Project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Day: ");
		int day = input.nextInt();
		System.out.print("Month: ");
		int month = input.nextInt();
		System.out.print("The last 2 digits of the year: ");
		int last2DigitsYear = input.nextInt();
		System.out.print("Year: ");
		int year = input.nextInt();
		
		int yearCode = yearCode(last2DigitsYear);
		int monthCode = monthCode(month);
		int centuryCode = (int) centuryCode(year);
		int leapYearCode = leapYearCode(month, year);
		
		int result = (yearCode + monthCode + centuryCode + day + leapYearCode) % 7;
		System.out.println(dayOfWeek(result));
		input.close();
	}
	public static int yearCode(int last2DigitsYear) {
		int remainder = (last2DigitsYear + (last2DigitsYear / 4)) % 7;
		return remainder;
	} 
	public static int monthCode(int month) {
		switch(month) {
		case 1:
			return 0;
		case 2:
			return 3;
		case 3: 
			return 3;
		case 4:
			return 6;
		case 5: 
			return 1;
		case 6:
			return 4;
		case 7:
			return 6;
		case 8:
			return 2;
		case 9:
			return 5;
		case 10:
			return 0;
		case 11:
			return 3;
		case 12: 
			return 5;
		}
		return month;
	}
	public static Object centuryCode(int year) {
		if(year >= 1600 && year <= 1699) {
			return 6;
		} else if(year >= 1700  && year <= 1799) {
			return 4;
		} else if(year >= 1800 && year <= 1899) {
			return 2;
		} else if(year >= 1900 && year <= 1999) {
			return 0;
		} else if(year >= 2000 && year <= 2099) {
			return 6;
		} else if(year >= 2100 && year <= 2199) {
			return 4;
		} else if(year >= 2200 && year <= 2299) {
			return 2;
		} else if(year >= 2300 && year <= 2399) {
			return 0;
		} else {
			return null;
		}
	} 
	public static int leapYearCode(int month, int year) {
		if(year % 4 == 0) { // leap year
			if(month == 1 || month == 2) {
				return -1;
			} else {
			return 1;
			}
		} else {
			return 0;
		}
	}
	public static String dayOfWeek(int result) {
		if(result == 0) {
			return "Sunday";
		} else if(result == 1) {
			return "Monday";
		} else if(result == 2) {
			return "Tuesday";
		} else if(result == 3) {
			return "Wednesday";
		} else if(result == 4) {
			return "Thursday";
		} else if(result == 5) {
			return "Friday";
		} else if(result == 6) {
			return "Saturday";
		} else {
			return "Unknown";
		}
	}
}

