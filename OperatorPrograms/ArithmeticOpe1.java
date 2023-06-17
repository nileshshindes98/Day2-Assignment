package OperatorPrograms;

// Enter two numbers and do the following arithmetic Operations find max and min.
//i) a+b*c ii) c+a/b
//iii) a%b+c iV) a*b+c
public class ArithmeticOpe1 {
    public static void main(String[] args) {
        int a = 30, b=20,c=10;
        int d = a+b*c;
        int e = c+a/b;
        int f = a%b+c;
        int g = a*b+c;

        System.out.println("Answer of above equation (1)="+d+"  (2)="+e+"  (3)="+f+"  (4)="+g);

        int max = d;
         if(max<e){
             System.out.println("Min value of above equation : "+ e);
         } if(max<f){
            System.out.println("Min value of above equation : "+ f);
        }if(max<g){
            System.out.println("Min value of above equation : "+ g);
        }
        int min = d;
        if(min>e){
            System.out.println("Min value of above equation : "+ e);
        } if(min>f){
            System.out.println("Min value of above equation : "+ f);
        }if(min>g){
            System.out.println("Min value of above equation : "+ g);
        }


    }
}
