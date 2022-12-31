package ArrayPractiseProblems;

import java.util.Scanner;

public class SmallestElementofarray {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Enter values of array : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        System.out.println("Smallest Element of array : " + min);
    }
}
