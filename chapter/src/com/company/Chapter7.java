package com.company;

import java.util.Scanner;

public class Chapter7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        chapter7_1(input);
    }

    public static void chapter7_1(Scanner input) {
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        int[] scores = new int[num];
        char[] grade = new char[num];
        System.out.print("Enter "+num+" scores: ");
        int best = 0;
        for (int i = 0;i<num;i++){
            scores[i] = input.nextInt();
            if (scores[i]>best) best=scores[i];
        }
        for (int i = 0;i<num;i++){
            if (scores[i]>=(best-10)) grade[i]='A';
            else if (scores[i]>=(best-20)) grade[i]='B';
            else if (scores[i]>=(best-30)) grade[i]='C';
            else if (scores[i]>=(best-40)) grade[i]='E';
            else grade[i]='F';
        }

        for (int i = 0;i<num;i++){
            System.out.println("Student "+i+" score is "+scores[i]+" and grade "+grade[i]);
        }


    }
}
