package ch5;

import java.util.Scanner;

public class Ch5_29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter year eg..2012: ");
		int year = input.nextInt();
		
		System.out.print("Enter the first day of the year");
		int day = input.nextInt();
		
		input.close();
		
		System.out.println();
		
		for(int month = 1; month <= 12; month++) {
			
			String monthString = "";
			
			switch (month) {
			case 1: monthString += "January "; break;
			case 2: monthString += "February "; break;
			case 3: monthString += "March "; break;
			case 4: monthString += "April "; break;
			case 5: monthString += "May "; break;
			case 6: monthString += "June "; break;
			case 7: monthString += "July "; break;
			case 8: monthString += "August "; break;
			case 9: monthString += "September "; break;
			case 10: monthString += "October "; break;
			case 11: monthString += "November "; break;
			case 12: monthString += "December "; break;
			}
			
			monthString += " " + year;
			
			System.out.println("\t\t\t" + monthString);
			System.out.println("---------------------------------------------------");
			System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
			
			String weekString = "";
			int formatCount = 0;
			
			for(int gap = 0; gap < day %7; gap++) {
				weekString += " \t";
				formatCount++;
			}
			
			int monthEnd;
			if ( month == 1 || month == 3  || month == 5 || month == 7 ||
					  month == 8 || month == 10 ||month == 12) {
					day += 31;
					monthEnd = 31;
			}
				else if (month == 4 || month == 6 || month == 9 || month == 11) {
					day += 30;
					monthEnd = 30;
				}
				else {
					if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
						day += 29;
						monthEnd = 29;
					}
					else {
						day += 28;
						monthEnd = 28;
					}
				}
			
			for(int dayy = 1; dayy <= monthEnd; dayy++) {
				weekString += dayy +"\t";
				formatCount++;
				if(formatCount % 7 ==0){
					weekString += "\n";
				}
			}
			
			System.out.println(weekString);
			 day %= 7;
			System.out.println();
		}

	}

}
