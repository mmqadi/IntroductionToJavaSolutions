package ch5;

public class Ch5_40 {

	public static void main(String[] args) {
		
		int head = 0;
		int headCount = 0;
		
		for(int i = 0; i < 1000000; i++) {
			int flip = (int)(Math.random() * 2);
			
			if(flip == head)
				headCount++;
		}
		
		System.out.println("The number of heads is " + headCount);
		System.out.println("The number of tails is " + (1000000 - headCount));

	}

}
