package Day2bridgelabzbasics;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num= scan.nextInt();
        int reverse = 0, rem, temp;

        temp = num;
        //loop to find reverse number
        while (temp != 0)
        {
            rem = temp % 10;
            reverse = reverse * 10 + rem;
            temp /= 10;
        }
        if (num == reverse)
            System.out.println (num + " is Palindrome Number");
        else
            System.out.println (num + " is not Palindrome Number");
    }
}
