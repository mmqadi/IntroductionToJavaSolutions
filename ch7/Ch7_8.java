package ch7;



public class Ch7_8 {

	public static void main(String[] args) {
		
		
		//test methods here.

	}
	
	public static int average(int[] array) {
		int sum = 0;
		
		for(int i = 0; i < array.length; i++)
			sum += array[i];
		return sum / array.length;
	}
	
	public static double average(double[] array) {
		double sum = 0; 
		
		for(int i = 0; i < array.length; i++)
			sum += array[i];
		
		return sum / array.length;
	}
}
