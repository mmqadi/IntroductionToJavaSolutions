package ch3;

import java.util.Scanner;

public class Ch3_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter today's day: ");
		int today = in.nextInt();
		String todayStr = "";
		switch(today) {
		case 0:
			todayStr = "Sunday";
			break;
		case 1:
			todayStr = "Monday";
			break;
		case 2:
			todayStr = "Tuesday";
			break;
		case 3:
			todayStr = "Wednesday";
			break;
		case 4:
			todayStr = "Thursday";
			break;
		case 5:
			todayStr = "Friday";
			break;
		case 6:
			todayStr = "Saturday";
			break;
		}
		
		System.out.print("Enter the number of days elapsed since today: ");
		int daysElapsed = in.nextInt();
		in.close();
		
		daysElapsed = (today + daysElapsed) % 7;
		String futureday = "";
		switch(daysElapsed) {
		case 0:
			futureday = "Sunday";
			break;
		case 1:
			futureday = "Monday";
			break;
		case 2:
			futureday = "Tuesday";
			break;
		case 3:
			futureday = "Wednesday";
			break;
		case 4:
			futureday = "Thursday";
			break;
		case 5:
			futureday = "Friday";
			break;
		case 6:
			futureday = "Saturday";
			break;
		}
		System.out.println("Today is " + todayStr + " and the future day is " + futureday);
	}
	

}
