package Day2bridgelabzbasics;
import java.util.Scanner;
public class Switchcase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice");
        char choice = scanner.next().charAt(0);

        switch (choice) {
            case 'A':
                System.out.println("case - 1");
                break;
            case 'B':
                System.out.println("case - 2");
                break;
            case 'C':
                System.out.println("case - 3");
                break;
            case 'D':
                System.out.println("case - 4");
                break;
            default:
                System.out.println("default");
        }

    }
}
