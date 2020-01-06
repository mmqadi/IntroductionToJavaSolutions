package ch5;

public class Ch5_27 {

	public static void main(String[] args) {
		
		int leapCounter = 0;
		
		for(int year = 101; year <= 2100; year++) {
			if((year % 4 == 0 || year % 400 == 0) && year % 100 != 0) {
				leapCounter++;
				System.out.print(year + " ");
				if(leapCounter % 10 == 0)
					System.out.println();
			}
			
		}
	}

}
