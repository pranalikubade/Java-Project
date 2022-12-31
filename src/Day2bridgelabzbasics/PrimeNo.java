package Day2bridgelabzbasics;
import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number");
        int n= scan.nextInt();
        int count = 0;

        // negative numbers, 0 and 1 are not prime
        if (n < 2)
            System.out.println("The given is number " + n + " is not prime");

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count += 1;
        }

        // if count of divisors greater than 2 then its not prime
        if (count > 2)
            System.out.println("The given is number " + n + " is not prime");

        else
            System.out.println("The given is number " + n + " is prime");
    }
}
