package Day2bridgelabzbasics;

//public class MethodTypes {
//   static void sum() {
//        int x = 20;
//        int y = 90;
//        int sum = x + y;
//      System.out.println("sum = " + sum);
//  }
//    public static void main(String[] args) {
//        sum();
//    }
//}

//public class MethodTypes {
//static void mul(int x, int y) {
//        int mul = x * y;
//        System.out.println("Multiplication = " + mul);
 //   }
//    public static void main(String[] args) {
//        mul(45,80);
//    }
//}

public class MethodTypes {
    static float div(int x, int y) {
        float div = (float) x / y;
        return div;

    }
    public static void main(String[] args) {
        float divide = div(10,3);
        System.out.println("Division = " + divide);
    }
}
