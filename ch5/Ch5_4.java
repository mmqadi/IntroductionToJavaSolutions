package ch5;

public class Ch5_4 {

	public static void main(String[] args) {
		System.out.println("Miles\t\tKilometer");
		for(int i = 1; i < 10; i++) {
			double kilometer = i * 1.609;
			
			System.out.printf("%d\t\t%2.3f\n", i,kilometer);
		}


	}

}
