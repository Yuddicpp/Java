package com.company;

import java.util.Scanner;

public class Chapter8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        chapter8_1(input);
        chapter8_2(input);
    }

    public static void chapter8_1(Scanner input) {
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] matrix = new double[3][4];
        for (int i = 0;i<3;i++){
            for (int j = 0;j<4;j++){
                matrix[i][j]=input.nextDouble();
            }
        }
        for (int i = 0;i<4;i++){
            System.out.println("Sum of the elements at column "+i+" is "+(matrix[0][i]+matrix[1][i]+matrix[2][i]));
        }
    }

    public static void chapter8_2(Scanner input) {
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        for (int i = 0;i<4;i++){
            for (int j = 0;j<4;j++){
                matrix[i][j]=input.nextDouble();
            }
        }
        double sum = sumMajorDiagonal(matrix);
        System.out.println("Sum of the elements in the major diagonal is "+sum);
    }

    public static double sumMajorDiagonal(double[][] m) {
        int x = m.length;
        int y = m[0].length;
        double sum = 0;
        for (int i = 0;i<x;i++){
            sum+=m[i][i];
        }
        return sum;
    }
}
