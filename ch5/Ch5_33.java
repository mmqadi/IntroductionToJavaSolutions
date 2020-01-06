package ch5;

public class Ch5_33 {

	public static void main(String[] args) {
		
		for(int i = 3; i < 10000; i++) {
			int sum = 1;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0)
					sum += j;
			}
			
			if(sum == i)
				System.out.println(i);
		}
	}

}
