package ch7;
import java.util.Scanner;
public class Ch7_26 {

    public static void main(String[] args) {
        int[] list1, list2;

        System.out.print("Enter list1: ");
        list1 = getListFromUser();
        System.out.print("Enter list2: ");
        list2 = getListFromUser();

        boolean areStrictlyIdentical = equals(list1, list2);

        System.out.print("Two lists are " + ((areStrictlyIdentical)?"": "not ") + "strictly identical");

    }

    public static  int[] getListFromUser(){
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] list = new int[length];

        for(int i = 0; i < list.length; i++)
            list[i] = input.nextInt();
        return list;
    }

    public static boolean equals(int[] list1, int[] list2){
        if(list1.length != list2.length)
            return false;

        for(int i = 0; i < list1.length; i++){
            if(list1[i] != list2[i])
                return false;
        }

        return true;
    }
}
