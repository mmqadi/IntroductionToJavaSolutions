package ch3;

import java.util.Scanner;

public class Ch3_21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter year: (e.g., 2012: ");
		int year = in.nextInt();
		
	
		System.out.print("Enter month: 1-12: ");
		int m = in.nextInt();
		
		if(m == 1 || m == 2) {
			m += 12;
			year--;
		}
		int j = year / 100;
		int k = year % 100;
		
		System.out.print("Enter the day of the month: 1-31: ");
		int q = in.nextInt();
		in.close();
		
		int h = (q + (26 * (m + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		String day = "";
		switch(h) {
		case 0:{
			day = "Saturday";
			break;
		}
		case 1:{
			day = "Sunday";
			break;
		}
		case 2:{
			day = "Monday";
			break;
		}
		case 3:{
			day = "Tuesday";
			break;
		}
		case 4:{
			day = "Wednesday";
			break;
		}
		case 5:{
			day = "Thursday";
			break;
		}
		case 6:{
			day = "Friday";
			break;
		}
		}
		
		System.out.println("The day of the week is " + day);

	}

}
