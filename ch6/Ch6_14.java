package ch6;

public class Ch6_14 {

	public static void main(String[] args) {
		
		
		System.out.println("i\t\tm(i)");
		System.out.println();
		for(int i = 1; i <= 1000; i += 100) {
			System.out.printf("%s\t\t%.4f\n", i, m(i));
		}

	}
	
	public static double m(int n) {
		
		double sum = 0;
		for(int i = 1; i <= n; i++) {
			
			sum += Math.pow(-1, i + 1) / (2 * i - 1);
		}
		
		return sum * 4;
	}

}
