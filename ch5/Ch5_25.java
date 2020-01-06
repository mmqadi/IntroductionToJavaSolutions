package ch5;

public class Ch5_25 {

	public static void main(String[] args) {
		
		double sum = 0;
		
		for(double i = 10000; i >= 1; i--) {
			sum += Math.pow(-1, i+1) / ( 2 * i -1);
		}
		
		System.out.println("PI for i = 10000 is :" + 4 * sum);
		
		sum = 0;
			
		for(double i = 20000; i >= 1; i--) {
			sum += Math.pow(-1, i+1) / ( 2 * i -1);
		}
		
		System.out.println("PI for i = 20000 is :" + 4 * sum);
		
		sum = 0;
		
		for(double i = 1000000; i >= 1; i--) {
			sum += Math.pow(-1, i+1) / ( 2 * i -1);
		}
		
		System.out.println("PI for i = 1000000 is :" + 4 * sum);

	}

}
