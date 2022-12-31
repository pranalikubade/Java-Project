package ArrayPractiseProblems;

import java.util.Scanner;

public class ElementsonOddPositionofArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Enter values of an array : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Elements present on odd position of an array : ");
        for (int i = 0; i < array.length; i = i + 2)
            System.out.print(array[i] + " ");
    }
}
