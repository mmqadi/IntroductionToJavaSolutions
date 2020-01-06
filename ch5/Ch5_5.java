package ch5;

public class Ch5_5 {

	public static void main(String[] args) {
		System.out.println("Kilograms\t\tPounds\t|\tPounds\t\tKilograms");
		
		
		for(int i = 1, j = 20; i < 200 && j < 520; i+=2, j+=5) {
			double pounds = i * 2.2;
			double kilograms = j / 2.2;
			System.out.printf("%d\t\t\t%3.1f\t|\t%d\t\t%3.1f\n", i, pounds, j, kilograms);
		}


	}

}
