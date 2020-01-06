package ch5;
import java.util.Scanner;
public class Ch5_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int noOfStudents = input.nextInt();
		
		double maxScore = -1;
		String maxStudent = "";
		
		for(int i = 1; i < noOfStudents + 1; i++) {
			System.out.print("Enter the name and score of student " + i + ": ");
			String name = input.next();
			double score = input.nextDouble();
			
			if(score > maxScore) {
				maxScore = score;
				maxStudent = name;
			}
		}
		input.close();
		
		System.out.printf("%s has the highest score of %.2f", maxStudent, maxScore);

	}

}
