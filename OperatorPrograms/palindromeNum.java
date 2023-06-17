package OperatorPrograms;

public class palindromeNum {
    public static void main(String[] args) {
        int m = 256 , n, reversed = 0;
        int z = m ;
        for (; m != 0; m /= 10) {
            n = m % 10;
            reversed = reversed * 10 + n;

        }
        System.out.println(reversed + "");

        if (z != reversed) {
            System.out.println(m+"Number is not a palindrome");
        } else {
            System.out.println(m+"Number is palindrome");
        }
    }
}
