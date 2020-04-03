package com.company;

public class Chapter6 {
    public static void main(String[] args) {
        for (int i = 1;i<101;i++){
            System.out.print(getPentagonalNumber(i)+"  ");
            if (i%10==0) System.out.print("\n");
        }

    }

    public static int getPentagonalNumber(int i) {
        return i*(3*i-1)/2;
    }
}
