package ArrayPractiseProblems;

import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int sort;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    sort = arr[i];
                    arr[i] = arr[j];
                    arr[j] = sort;
                }
            }
        }
        System.out.println("Array Elements after sorting");
        for (int i = 0; i < arr.length; i++)
            System.out.print(" "+arr[i]);
    }
}
