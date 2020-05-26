package ch7;

public class Ch7_16 {

	public static void main(String[] args) {
		
		int[] numbers = new int[100000];
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = (int)(Math.random() * 100000);
		}
		
		int key = (int)(Math.random() * 100000);
		
		long startTime = System.currentTimeMillis();
		ch7.listing.Search.binarySearch(numbers, key);
		long endTime = System.currentTimeMillis();
		
		long executionTime = endTime - startTime;
		System.out.println("The key is " + key);
		System.out.println("It took the binary search " + executionTime + "ms to find the key.");
		

		startTime = System.currentTimeMillis();
		ch7.listing.Search.linearSearch(numbers, key);
		endTime = System.currentTimeMillis();
		
		executionTime = endTime - startTime;
		System.out.println("It took the linear search " + executionTime + "ms to find the key.");
	}
	
}
