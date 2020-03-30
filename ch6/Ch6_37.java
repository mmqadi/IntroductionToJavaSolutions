package ch6;

public class Ch6_37 {

	public static void main(String[] args) {
		
		System.out.print(format(34, 5));

	}
	
	public static String format(int number, int width) {
		
		int noOfDigits = (int)(Math.log10(number)) + 1;
		
		if(noOfDigits > width)
			return number + "";
		
		String str = "";
		
		for(int i = 0; i < width - noOfDigits; i++)
			str += "0";
		return str + number;
		
	}

}
