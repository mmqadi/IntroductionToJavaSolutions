package ch6;

public class Ch6_24 {

	public static void main(String[] args) {
		long seconds = System.currentTimeMillis() / 1000;
		System.out.println(getTime(seconds) + " UTC, " + getDate(seconds));

	}
	
	/*
	 * returns the value of the current second in time.
	 */
	public static long getCurrentSeconds(long seconds) {
		return seconds % 60;
	}
	
	/*
	 * returns the current minute.
	 */
	public static long getCurrentMinute(long seconds) {
		long totalMinutes = seconds / 60;
		
		return totalMinutes % 60;
	}
	
	/*
	 * returns the current hour
	 */
	public static long getCurrentHour(long seconds) {
		long totalHours = seconds / 3600;
		return totalHours % 24;
	}
	
	/*
	 * returns a string representing the current time in UTC.
	 */
	public static String getTime(long seconds) {
		
		int currentSecond = (int)getCurrentSeconds(seconds);
		int currentMinute = (int)getCurrentMinute(seconds);
		int currentHour = (int)getCurrentHour(seconds);
		
		
		boolean isAm = false;
		
		if(currentHour == 0) {
			currentHour = 12;
			isAm = true;
		}
		
		if(currentHour > 12) {
			
			currentHour -= 12;
		
			isAm = false;
		}
		
		String time = currentHour + ":" + currentMinute + ":" + currentSecond + ((isAm)?" AM":" PM");
		
				
		
		return time;
	}
	
	/*
	 * returns the current year
	 */
	public static String getDate(long seconds) {
		long numberOfDays = seconds / 86400;
		
		
		int year = 1970;
		
		while((numberOfDays >= 365) ) {
			if(isLeapYear(year)) {
				numberOfDays -= 366;
				year++;
			}
			else {
				numberOfDays -= 365;
				year++;
			}
		}
		
		return getMonthAndDate(year, (int)numberOfDays) + " " +Integer.toString(year);
	}
	
	public static String getMonthAndDate(int year, int daysRemain) {
		
		daysRemain++;
		
		if(daysRemain > 31)
			daysRemain -= 31;
		else return daysRemain + " " + getMonthName(1);
		
		if(isLeapYear(year) && (daysRemain > 29))
			daysRemain -= 29;
		else if(daysRemain > 28)
			daysRemain -= 28;
		else return daysRemain + " " + getMonthName(2);
		
		if(daysRemain > 31)
			daysRemain -= 31;
		else return daysRemain + " " + getMonthName(3);
		
		if(daysRemain > 30)
			daysRemain -= 30;
		else return daysRemain + " " + getMonthName(4);
		
		if(daysRemain > 31)
			daysRemain -= 31;
		else return daysRemain + " " + getMonthName(5);
		
		if(daysRemain > 30)
			daysRemain -= 30;
		else return daysRemain + " " + getMonthName(6);
		
		if(daysRemain > 31)
			daysRemain -= 31;
		else return daysRemain + " " + getMonthName(7);
		
		if(daysRemain > 31)
			daysRemain -= 31;
		else return daysRemain + " " + getMonthName(8);
		
		if(daysRemain > 30)
			daysRemain -= 30;
		else return daysRemain + " " + getMonthName(9);
		
		if(daysRemain > 31)
			daysRemain -= 31;
		else return daysRemain + " " + getMonthName(10);
		
		if(daysRemain > 30)
			daysRemain -= 30;
		else return daysRemain + " " + getMonthName(11);
		
		return daysRemain + " " + getMonthName(12);
		
	}
	
	public static String getMonthName(int month) {
		String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        
        return monthString;
	}
	
	public static boolean isLeapYear(int year) {
	    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
}
