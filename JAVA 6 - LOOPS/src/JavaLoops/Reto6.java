package JavaLoops;

public class Reto6 {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int next;

        System.out.print(a + " " + b);

        for (int i = 1; i < 11; i++) {
            next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }

        System.out.println();
    }
}
