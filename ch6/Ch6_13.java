package ch6;

public class Ch6_13 {

	public static void main(String[] args) {
	
		System.out.println("i\t\tm(i)");
		
		for(int i = 1; i <= 20.0; i++) {
			System.out.printf("%s\t\t%.4f\n", i, m(i));
		}
	}
	
	public static double m(int i) {
		double sum = 0;
		
		for(int x = 1; x <= i; x++) {
			sum += (double)x / ((double)x + 1);
		}
		
		return sum;
	}

}
