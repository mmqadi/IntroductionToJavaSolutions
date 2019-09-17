package ch3;

public class Ch3_16 {

	public static void main(String[] args) {
		int x = (int)(Math.random() * 50);
		int y = (int)(Math.random() * 100);
		
		int isNegativeX = (int)(Math.random() * 2);
		int isNegativeY = (int)(Math.random() * 2);
		
		x = (isNegativeX < 1)?-x:x;
		y = (isNegativeY < 1)? -y:y;
		
		System.out.print("The coordinates are (" + x + ", " + y + ")");
	}

}
