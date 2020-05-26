package ch7;

public class Ch7_12 {

	public static void main(String[] args) {
		int[] numbers = new int[11];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		System.out.print(numbers[i] + " ");	
		}
		System.out.println();
		System.out.println();
		
		reverse(numbers);
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		

	}
	
	public static void reverse(int[] x) {
		for(int i = 0; i <= x.length / 2; i++) {
			int temp = x[i];
			int temp2 = x[x.length - 1 - i];
			
			x[i] = temp2;
			x[x.length - 1 - i] = temp;
		}
	}

}
