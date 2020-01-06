package ch5;

public class Ch5_19 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 8; i++) {
			for(int space = 0; space < 8 - i; space++)
				
				System.out.print(" \t");
			
			int val = 1;
			for(int j = 1; j <= i; j++) {
				System.out.print(val +"\t");
				val *= 2;
			}
			val /= 2;
			
			for(int j = 1; j < i; j++) {
				val /= 2;
				System.out.print(val +"\t");
			}
				
			System.out.println();
		}

	}

}
