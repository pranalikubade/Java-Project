package Day2bridgelabzbasics;

import java.util.Scanner;

public class SumofDigitofNumber {
    public static void main (String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int num= scan.nextInt();
            int sum = 0;
        while(num!=0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println ("Sum of digits : " + sum);
    }
}
