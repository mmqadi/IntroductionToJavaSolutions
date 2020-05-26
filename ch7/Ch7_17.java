package ch7;

import java.util.Scanner;

public class Ch7_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int numberOfStudents = input.nextInt();
		
		double[] scores = new double[numberOfStudents];
		String[] names = new String[numberOfStudents];
		
		System.out.print("Enter the name and mark of each student: ");
		
		for(int i = 0; i < numberOfStudents; i++) {
			names[i] = input.next();
			scores[i] = input.nextDouble();
		}
		
		input.close();
		sortMarks(names, scores);
		System.out.println("The students listed by decreasing scores: ");
		for(int i = numberOfStudents - 1; i >= 0; i--) {
			System.out.println(names[i] + " " + scores[i]);
		}
	}
	
	public static void sortMarks(String[] names, double[] scores) {
		for(int i = 0; i < scores.length - 1; i++) {
			
			double currentMin = scores[i];
			String currentStudent = names[i];
			int currentMinIndex = i;
			
			for(int j = i + 1; j < scores.length; j++) {
				if(currentMin > scores[j]) {
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i) {
				double tempScore = scores[currentMinIndex];
				String tempName = names[currentMinIndex];
				
				scores[currentMinIndex] = currentMin;
				names[currentMinIndex] = currentStudent;
				
				scores[i] = tempScore;
				names[i] = tempName;
					
			}
		}
	}

}
