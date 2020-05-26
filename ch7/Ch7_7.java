package ch7;

public class Ch7_7 {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		
		for(int i = 0; i < 100; i++)
			numbers[(int)(Math.random() * 10)]++;
		
		for(int i = 0; i < numbers.length; i++)
			System.out.println(i + " was generated " + numbers[i] + " times");

	}

}
