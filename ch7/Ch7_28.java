package ch7;
import java.util.Scanner;
public class Ch7_28 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter 10 numbers: ");
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = input.nextInt();

        displayCombinations(numbers);
    }

    public static void displayCombinations(int[] list){

        for(int i = 0; i < list.length - 1; i++){
            for(int j = i+1; j < list.length; j++){
                System.out.println(list[i] + " " + list[j]);
            }
        }

        // If order matters than execute the code below.
        /*
        for(int i = 0; i < list.length - 1; i++){
            for(int j = 0; j < list.length; j++){
               if(i != j)
                   System.out.println(list[i] + " " + list[j]);
            }
        }
        */

    }
}
