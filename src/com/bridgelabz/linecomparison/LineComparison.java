package com.bridgelabz.linecomparison;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("--- Welcome to Line Comparison Computation Program ---");
        System.out.println("Enter the coordinates of 1st line");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 : ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 : ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 : ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 : ");
        int y2 = sc.nextInt();

        System.out.println("Enter the coordinates of 2nd Line");
        System.out.print("Enter x3 : ");
        int x3 = sc.nextInt();
        System.out.print("Enter y3 : ");
        int y3 = sc.nextInt();
        System.out.print("Enter x4 : ");
        int x4 = sc.nextInt();
        System.out.print("Enter y4 : ");
        int y4 = sc.nextInt();
        calculateLength(x1,y1,x2,y2,x3,y3,x4,y4);
    }

    private static void calculateLength(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        DecimalFormat deciForm = new DecimalFormat("0.##");

        //CALCULATE LENGTH OF TWO LINES
        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of first line is : " + deciForm.format(length1));
        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("Length of second line is : " + deciForm.format(length2));

        // COMPARISON OF LENGTHS
        if(length1.compareTo(length2) > 0)
            System.out.println("Line1 is larger than Line2");
        else if(length1.compareTo(length2) < 0)
            System.out.println("Line1 is smaller than Line2");
        else
            System.out.println("Both lines are same");
    }
}
