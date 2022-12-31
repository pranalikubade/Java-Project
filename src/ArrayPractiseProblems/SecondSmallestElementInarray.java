package ArrayPractiseProblems;

public class SecondSmallestElementInarray {
    static int secSmallest(int arr[], int n)
    {
        // assigning first element as smallest temporarily
        int small = arr[0];

        // search for smallest element
        for (int i=0; i < n; i++){
            if(arr[i] < small)
                small = arr[i];
        }

        // temporarily assinging max value
        int sec_smallest = Integer.MAX_VALUE;


        // finding second smallest
        for (int i=0; i < n; i++){
            if(arr[i] != small && arr[i] < sec_smallest)
                sec_smallest = arr[i];
        }

        return sec_smallest;

    }
    public static void main(String args[])
    {

        int arr[] = {12, 13, 1, 10, 34, 20};
        int n = arr.length;
        System.out.print(secSmallest(arr, n));
    }
}
