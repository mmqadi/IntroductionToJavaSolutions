package ch3;

import java.util.Scanner;

public class Ch3_11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a month and year (eg. 2 2015): ");
		int month = in.nextInt();
		int year = in.nextInt();
		in.close();
		
		if(month == 2) {
			if(year % 4 == 0 && year % 400 == 0) {
				System.out.println("February " + year + " has 29 days");
			}
			
			else {
				System.out.println("February " + year + " has 28 days");
			}
			
			System.exit(1);
		}
		
		String monthStr = "";
		
		switch(month) {
		case 1: {
			monthStr = "January";
			break;
		}
		case 3: {
			monthStr = "March";
			break;
		}
		case 4: {
			monthStr = "April";
			break;
		}
		case 5: {
			monthStr = "May";
			break;
		}
		case 6: {
			monthStr = "June";
			break;
		}
		case 7: {
			monthStr = "July";
			break;
		}
		case 8: {
			monthStr = "August";
			break;
		}
		case 9: {
			monthStr = "September";
			break;
		}
		case 10: {
			monthStr = "October";
			break;
		}
		case 11: {
			monthStr = "Novermber";
			break;
		}
		case 12: {
			monthStr = "December";
			break;
		}
		}
		
		String days = "";
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			days = "31";
			break;
		}
		
		case 4:
		case 6:
		case 9:
		case 11:{
			days = "30";
			break;
		}
		}
		
		System.out.println(monthStr +" " + year + " has " + days + " days");
	}

}
