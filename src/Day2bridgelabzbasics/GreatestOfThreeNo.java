package Day2bridgelabzbasics;

public class GreatestOfThreeNo {
    public static void main(String[] args) {
        int num1 = 30, num2 = 2, num3 = 39;
        if ((num1 > num2) && (num1 > num3))
            System.out.println (num1 + " is the greatest number");
        else if (num2 > num1 && num2 > num3)
            System.out.println (num2 + " is the greatest number");
        else
            System.out.println (num3 + " is the greatest number");
    }
}
