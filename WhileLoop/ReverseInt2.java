
// Write a Program to reverse the integer number eg. Input n=231 reverse is 132
package WhileLoop;

public class ReverseInt2 {

    public static void main(String args[])
    {
        int m = 231, n, sum = 0;
        while(m > 0)
        {
            n = m % 10;
            sum = sum * 10 + n;
            m = m / 10;
        }
        System.out.println("Reverse of a Number is "+sum);
    }
     /*{
        int m = 231, n, sum = 0;
         while (m > 0) ;
        {
            n = m % 10;
            sum = sum * 10 + n;
            m = m / 10;
        }
        System.out.println("Reverse number is :" + sum);
    }*/
}


