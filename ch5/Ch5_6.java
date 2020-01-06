package ch5;

public class Ch5_6 {

	public static void main(String[] args) {
		System.out.println("Miles\t\tKilometer\t|\tkilometers\tMiles");
		
		
		for(int i = 1, j = 20; i < 11 && j < 70; i++, j+=5) {
			double kilometer = i * 1.609;
			double miles = j / 1.609;
			System.out.printf("%d\t\t%3.3f\t\t|\t%d\t\t%3.3f\n", i, kilometer, j, miles);
		}

	}

}
