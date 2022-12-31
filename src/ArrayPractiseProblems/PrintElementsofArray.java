package ArrayPractiseProblems;

import java.util.Scanner;
public class PrintElementsofArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Enter values of array : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
    }
}
