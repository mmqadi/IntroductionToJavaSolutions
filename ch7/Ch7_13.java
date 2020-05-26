package ch7;

public class Ch7_13 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++)
			System.out.print(getRandom(1,7, 15, 8, 10, 25) + " ");
	}
	
	public static int getRandom(int... numbers) {
		int x;
		do {
			x = (int)(Math.random()* 54) + 1;
			
			
		}while(contains(numbers, x));
		
		return x;
	}
	
	public static boolean contains(int[] numbers, int x) {
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] == x)
				return true;
		}
		
		return false;
	}

}
