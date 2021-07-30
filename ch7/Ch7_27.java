package ch7;
import java.util.Arrays;
import java.util.Scanner;

public class Ch7_27 {

    public static void main(String[] args){
        int[] list1, list2;

        System.out.print("Enter list1: ");
        list1 = getArrayFromUser();
        System.out.print("Enter list2: ");
        list2 = getArrayFromUser();

        boolean isIdentical = equals(list1, list2);

        System.out.print("Two lists are " + ((isIdentical)?"":"not") + " identical");


    }

    public static int[] getArrayFromUser(){
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int[] array = new int[length];

        for(int i = 0; i < array.length; i++){
            array[i] = input.nextInt();
        }

        return array;
    }

    public static boolean equals(int[] list1, int[] list2){
        if(list1.length != list2.length)
            return false;
        Arrays.sort(list1);
        Arrays.sort(list2);

        for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i])
                return false;
        }

        return true;
    }
}
