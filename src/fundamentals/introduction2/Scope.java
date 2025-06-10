package fundamentals.introduction2;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        random();

        {
            a = 20;
            int c = 30;
            System.out.println(a);
            System.out.println(c);
        }
        int c = 40;
        System.out.println(c);

    }

    static void random() {
        int a = 100;
        System.out.println(a);
    }
}
