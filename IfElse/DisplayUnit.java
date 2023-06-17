package IfElse;

public class DisplayUnit {

    public static void main(String[] args) {
        int n = 1, n1 = 100;
        {
            if (n == 1) {
                System.out.println("This is UNIT");
            } else if (n == 10) {
                System.out.println("This is Ten");
            } else if (n == 100) {
                System.out.println("This is Hundred");
            } else if (n == 1000) {
                System.out.println("This is Thousand");
            }
        }

        {
            for (; n1 <= 1000; n1 *= 10)
                if (n1 == 1) {
                    System.out.println("This is UNIT");
                } else if (n1 == 10) {
                    System.out.println("This is Ten");
                } else if (n1 == 100) {
                    System.out.println("This is Hundred");
                } else if (n1 == 1000) {
                    System.out.println("This is Thousand");
                }
        }
    }
}



