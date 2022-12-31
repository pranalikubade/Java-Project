package ArrayPractiseProblems;

import java.util.Scanner;

public class LargestElementofarray {

    public static void main(String args[]) {

        int[] array = new int[5];
        int max = array[0];
        System.out.println("Enter values of array : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("Largest Element of array : " + max);
    }
}



