package ch6;

public class Ch6_16 {

	public static void main(String[] args) {
		
		System.out.println("year\t\tdays");
		System.out.println("--------------------");
		for(int i = 2000; i <= 2020; i++) {
			System.out.printf("%s\t\t%s\n", i, numberOfDaysInAYear(i));
		}

	}
	
	public static int 	numberOfDaysInAYear(int year) {
		return isLeapYear(year)?366:365;
	}
	
	
	public static boolean isLeapYear(int year) {
	return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
	}
}
