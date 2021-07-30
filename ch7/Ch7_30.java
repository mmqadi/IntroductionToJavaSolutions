package ch7;
import java.util.Scanner;
public class Ch7_30 {

    public static void main(String[] args){
        int[] values = getUserInput();

        boolean result = isConsecutiveFour(values);

        System.out.print("The list has " + ((result)?"":"no ") + "consecutive fours");
    }

    public static int[] getUserInput(){
        Scanner input = new Scanner(System.in);
        int[] values;
        int size;

        System.out.print("Enter the number of values: ");
        size = input.nextInt();
        values = new int[size];
        System.out.print("Enter the values: ");

        for(int i = 0; i < values.length; i++)
            values[i] = input.nextInt();

        return values;
    }

    public static boolean isConsecutiveFour(int[] values){

        if(values == null || values.length < 4)
            return false;

        int current = values[0];
        int count = 1;
        for(int i = 1; i < values.length; i++){
            if(values[i] == current){
                count++;
                if(count == 4)
                    return true;
            }
            else {
                count = 1;
                current = values[i];
            }
        }

        return false;
    }
}
