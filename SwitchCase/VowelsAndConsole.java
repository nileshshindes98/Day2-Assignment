package SwitchCase;

import java.util.Scanner;

public class VowelsAndConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER CHARACTER :");
        char ch = scanner.next().charAt(0);

        switch (ch) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("This character is vowels");
            default:
                System.out.println("This character is Consonant");
        }
    }

}
