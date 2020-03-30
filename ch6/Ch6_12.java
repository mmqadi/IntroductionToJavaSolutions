package ch6;

public class Ch6_12 {

	public static void main(String[] args) {
		
		
		printChar('1', 'z', 10);
	}
	
	public static void printChar(char ch1, char ch2, int numberperline) {
		
		int count = 0;
		
		for(int i = ch1; i <= ch2; i++) {
			System.out.print((char)i + " ");
			count++;
			if(count % numberperline == 0)
				System.out.println();
		}
	}

}
