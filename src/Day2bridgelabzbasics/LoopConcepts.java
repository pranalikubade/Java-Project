package Day2bridgelabzbasics;

    // 3 Loops -> for , while , do-while
// forEach

    public class LoopConcepts {

        public static void main(String[] args) {

            System.out.println("for started");
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            System.out.println("for ended");
            System.out.println();
            System.out.println("while started");
            int j = 0;
            while (j < 10) {
                System.out.println(j);
                j++;
            }
            System.out.println("while ended");
            System.out.println();
            System.out.println("do-while started");
            int k = 200;
            do {
                System.out.println(k);
                k++;
            } while (k < 10);
            System.out.println("do-while ended");
        }
    }