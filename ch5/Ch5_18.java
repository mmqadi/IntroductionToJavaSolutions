package ch5;

public class Ch5_18 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print(j+ " ");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i <= 6; i++) {
			for(int j = 1; j <= 6 - i; j++)
				System.out.print(j+ " ");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 6; i++) {
			for(int j = 1; j < 6 - i; j++)
				System.out.print("  ");
			
			for(int j = i + 1; j > 0; j--)
				System.out.print(j+ " ");
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 6; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print("  ");
			
			for(int j = 1; j <=6 - i; j++)
				System.out.print(j+ " ");
			System.out.println();
		}
	}

}
