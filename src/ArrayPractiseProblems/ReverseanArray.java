package ArrayPractiseProblems;

import java.util.Scanner;

public class ReverseanArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println("Enter values of an array : ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n=array.length;
        for(int i=n-1; i>=0; i--)
            System.out.print(array[i]+" ");
    }
}
