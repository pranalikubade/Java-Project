package ArrayPractiseProblems;

import java.util.Scanner;

public class FrequencyofElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Frequency of elements are: ");
        //Search for duplicate element
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (visited[i] != true) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + "count is " + count);
            }
        }
    }
}
