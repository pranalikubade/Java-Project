package ArrayPractiseProblems;

import java.util.Scanner;

public class SumofAllElementsInArray {
    public static void main(String[] args) {

        int[] array = new int[5];
        System.out.println("Enter values of array : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum of all Elements in Array : " +sum );
    }
}