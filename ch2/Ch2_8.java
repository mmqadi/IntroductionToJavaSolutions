package ch2;

import java.util.Scanner;

/*
 * Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 * the current time in GMT. Revise the program so that it prompts the user to enter
 * the time zone offset to GMT and displays the time in the specified time zone. Here
 * is a sample run:
 * 
 * 		Enter the time zone offset to GMT: −5
 * 		The current time is 4:50:34
 */

public class Ch2_8 {

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
		
		// display results
		System.out.println("the current time is " + (currentHour + offset) + ":" + currentMinute + ":" + currentSecond + " GMT");
	}

}
