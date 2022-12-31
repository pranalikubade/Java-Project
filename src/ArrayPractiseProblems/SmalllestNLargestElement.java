package ArrayPractiseProblems;

import java.util.Scanner;

public class SmalllestNLargestElement {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Enter values of array : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
            if (max < array[i])
                max = array[i];

        }
        System.out.println("Largest Element of array : " + max);
        System.out.println("Smallest Element of array : " + min);
    }
}
