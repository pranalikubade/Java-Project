package Day2bridgelabzbasics;

public class VariableTypes {
    static int staticVar = 20;

    static void m1() {
        System.out.println("c => " + staticVar); // 0  // 36
        staticVar = 78;
        System.out.println("d => " + staticVar); // 0 // 36 // 78
    }

    public static void main(String[] args) {
//        int x;
//        System.out.println("x => " + x);

        System.out.println("main starting ");
        System.out.println("a => " + staticVar); // 0
        staticVar = 36;
        System.out.println("b => " + staticVar); // 36
        m1();
        System.out.println("e => " + staticVar); // 0 // 36 // 78
        System.out.println("main ending");
    }


}
