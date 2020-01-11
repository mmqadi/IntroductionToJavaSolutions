package ch5;

public class Ch5_43 {

	public static void main(String[] args) {
		
		
		int noOfCombinations = 0;
		
		for(int i = 1; i <= 7; i++)
			for(int j = i + 1; j <= 7; j++) {
				System.out.println(i + " " + j);
				noOfCombinations++;
			}
		
		System.out.println();
		System.out.print("The total number of all combinations is " + noOfCombinations);
	}

}
