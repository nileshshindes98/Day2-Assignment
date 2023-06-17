package OperatorPrograms;

import static java.lang.Math.sqrt;

//Write a program Distance.java that takes two integer command-line arguments x and y and prints
// the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate
//distance = sqrt(x*x + y*y). Use Math.power function
public class Distance {
    public static void main(String[] args) {
        int x =10, y=20;
        double distance = sqrt(x*x + y*y);

        System.out.printf("Distance from origin : "+ distance);
    }
}
