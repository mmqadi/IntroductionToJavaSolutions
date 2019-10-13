package ch4;
import java.util.Scanner;
public class Ch4_14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a letter grade: ");
		char grade = input.nextLine().charAt(0);
		input.close();
		if((grade < 'A' || grade > 'F' || grade == 'E')) {
			System.out.println(grade + " is an invalid grade");
			System.exit(1);
		}
		int gradeValue = (int)('D' -grade + 1);
		
		System.out.println("The numerical value of grade " + grade + " is " + gradeValue);
		
	}

}
