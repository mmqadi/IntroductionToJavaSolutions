package ch5;

public class Ch5_7 {

	public static void main(String[] args) {
		double tuition = 10000;
		
		for(int i = 0; i < 10; i ++) {
			tuition += tuition * 0.05;
		}
		
		System.out.printf("Tuition after 10 years %.2f",tuition);
		
		double total = 0;
		for(int i = 0; i < 4; i++) {
			tuition += tuition * 0.05;
			total += tuition;
		}
		
		System.out.printf("\nThe total cost of four year's worth of tution is %.2f",total);
	}

}
