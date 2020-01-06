package ch5;

public class Ch5_3 {

	public static void main(String[] args) {
		System.out.println("Kilograms\t\tPounds");
		for(int i = 1; i < 200; i+=2) {
			double pound = i * 2.2;
			
			System.out.printf("%d\t\t\t%3.1f\n", i,pound);
		}

	}

}
