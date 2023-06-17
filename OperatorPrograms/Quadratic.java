package OperatorPrograms;
// Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
//Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation can be found using a formula
//delta = b*b - 4*a*c
//Root 1 of x = (-b + sqrt(delta))/(2*a)
//Root 2 of x = (-b - sqrt(delta))/(2*a)

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void main(String[] args) {
        double a = -2.3, b = -15,c = 17;
        double root1 , root2;

        //calculate the delta
        double delta = b*b - 4*a*c;
         // check if delta is greater than zero
        if (delta>0){
            root1 = (-b + sqrt(delta))/(2*a);
            root2 = (-b - sqrt(delta))/(2*a);
            System.out.printf("root1 = "+root1+"root2 = "+root2);
        }
        //check delta is equal to 0
        else if(delta==0){
            root1 = root2 = -b/(2*a);
            System.out.printf("root1 = root2 ="+root1);
        }
        //check delta is less than zero
        else if (delta<0) {
            double real = -b/(2*a);
            double imaginary = (-sqrt(delta)/(2*a));
            System.out.printf("root1 = "+real+" root2 = "+imaginary);
        }


    }
}
