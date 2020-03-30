package ch6;

public class Ch6_1 {

	public static void main(String[] args) {
		
		final int NUMBER_OF_PERNTAGONAL_NUMBERS_PER_LINE = 10;
		
		for(int i = 1; i < 101; i++) {
			
			System.out.print(getPentagonalNumber(i) + "\t");
			
			if(i % NUMBER_OF_PERNTAGONAL_NUMBERS_PER_LINE == 0)
				System.out.println();
		}

	}
	
	public static int getPentagonalNumber(int n) {
		return n * (3 * n - 1) / 2;
	}
}
