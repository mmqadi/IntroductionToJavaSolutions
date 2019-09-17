package ch3;

import java.util.Scanner;

public class Ch3_30 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// obtain current time
		long totalMilliSeconds = System.currentTimeMillis();
		
		// total seconds 
		long totalSeconds = totalMilliSeconds / 1000;
		
		// compute current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// compute current minute
		long currentMinute = totalMinutes % 60;
		
		// obtain total hours
		long totalHours = totalMinutes / 60;
		
		// compute current hour
		long currentHour = totalHours % 24;
		
		// prompt the user for input
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = in.nextInt();
		in.close();
		
		long updatedHour = currentHour + offset;
		
		boolean isAm = updatedHour <= 12;
		
		updatedHour %= 12;
		updatedHour = updatedHour == 0?12:updatedHour;
		
		// display results
		System.out.println("the current time is " + updatedHour + ":" + currentMinute + ":" + currentSecond + " "
				+(isAm?"AM":"PM"));
	}
}
