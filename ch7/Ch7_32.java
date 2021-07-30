package ch7;

import java.util.Arrays;
import java.util.Scanner;

public class Ch7_32 {

    public static void main(String[] args){
        System.out.print("Enter List: ");
        int[] list = getUserInput();

        int index = partition(list);

        System.out.print("After partition, the list is " + Arrays.toString(list));
    }


    public static int[] getUserInput(){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] values = new int[size];

        for(int i = 0; i < values.length; i++)
            values[i] = input.nextInt();

        return values;
    }

    // not my solution: source: https://github.com/HarryDulaney/intro-to-java-programming/blob/master/src/ch_07/Exercise07_32.java
    public static int partition(int[] list) {
        int pivotPoint = 0;
        int pivot = list[0];

        while (true) {
            boolean partitioned = true;
            for (int j = 0; j < list.length; j++) {
                if (j == pivotPoint) {
                    continue;
                }

                if (list[j] < pivot) {
                    if (j > pivotPoint) {
                        partitioned = false;
                        int tmp = list[j];
                        list[j] = pivot;
                        list[pivotPoint] = tmp;
                        pivotPoint = j;
                    }

                } else if (list[j] > pivot) {
                    if (j < pivotPoint) {
                        partitioned = false;
                        int tmp = list[j];
                        list[j] = pivot;
                        list[pivotPoint] = tmp;
                        pivotPoint = j;
                    }

                }

            }
            if (partitioned) break;
        }
        return pivotPoint;

    }
}
