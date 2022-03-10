package com.bridgelabz.linecomparison;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("--- Welcome to Line Comparison Computation Program ---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Let (x1,y1) and (x2,y2) be the two coordinates");
        System.out.println("Enter x1 : ");
        int x1 = sc.nextInt();
        System.out.println("Enter y1 : ");
        int y1 = sc.nextInt();
        System.out.println("Enter x2 : ");
        int x2 = sc.nextInt();
        System.out.println("Enter y2 : ");
        int y2 = sc.nextInt();
        getResult(x1,y1,x2,y2);
    }

    private static void getResult(int x1, int y1, int x2, int y2) {
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        DecimalFormat deciForm = new DecimalFormat("0.##");
        System.out.println("The distance is : " + deciForm.format(length));
    }
}
