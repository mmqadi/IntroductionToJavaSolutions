package ch7;
import java.util.Scanner;
public class Ch7_33 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.println(getZodiac(year));
    }

    public static String getZodiac(int year){
        String[] signs = {"monkey", "rooster", "dog", "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        return signs[year % 12];
    }
}
