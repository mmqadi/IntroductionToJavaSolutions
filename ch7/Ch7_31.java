package ch7;
import java.util.Arrays;
import java.util.Scanner;
public class Ch7_31 {

    public static void main(String[] args){
        int[] list1, list2, merged;

        System.out.print("Enter list1: ");
        list1 = getUserInput();
        System.out.print("Enter list2: ");
        list2 = getUserInput();
        merged = merge(list1, list2);
        System.out.print("The merged list is " + Arrays.toString(merged));

    }

    public static int[] getUserInput(){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] values = new int[size];

        for(int i = 0; i < values.length; i++)
            values[i] = input.nextInt();

        return values;
    }
    public static int[] merge(int[] list1, int[] list2){
        int[] merged = new int[list1.length + list2.length];

        System.arraycopy(list1, 0, merged, 0, list1.length);
        System.arraycopy(list2, 0, merged, list1.length, list2.length);

        Arrays.sort(merged);
        return merged;
    }
}
