package ch7;
import java.util.Arrays;
import java.util.Scanner;
public class Ch7_34 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.next();

        System.out.print("The sorted string is " + sort(userInput));

    }
    public static String sort(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        return new String(chars);
    }
}
