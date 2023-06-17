package WhileLoop;

public class SumofNaturalNum2 {
    public static void main(String[] args) {
        int n = 5; int i=1; int sum=0;
        while(i <= n)
        {
             sum = i++;
            System.out.print("+" + sum);
        }
    }
}
