package ch5;

public class Ch5_15 {

	public static void main(String[] args) {
		int initialChar = (int)'!';
		int finalChar = (int)'~';
		
		for(int i = initialChar; i <= finalChar; i++) {
			System.out.print((char)i + " ");
			if(i % 8 == 0)
				System.out.println();
		}

	}

}
