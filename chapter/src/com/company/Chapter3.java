package com.company;

import java.util.Scanner;

public class Chapter3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        chapter3_1(input);
//        chapter3_8(input);
        chapter3_12(input);
    }

    public static void chapter3_1(Scanner input) {
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double exist = Math.pow((Math.pow(b,2)-4*a*c),0.5);
        if (exist>0){
            System.out.println("The equation has two roots "+(-b+exist)/2/a+" and "+(-b-exist)/2/a);
        }else if (exist==0){
            System.out.println("The equation has one root "+(-b/2/a));
        }else{
            System.out.println("The equation has no real roots");
        }
    }

    public static void chapter3_8(Scanner input) {
        System.out.print("Enter three numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int temp = 0;
        if (a<b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b<c)
        {
            temp = b;
            b = c;
            c = temp;
            if (b>a) {
                temp = b;
                b = a;
                a = temp;
            }
        }
        System.out.println(c+" "+b+" "+a);
    }

    public static void chapter3_12(Scanner input) {
        System.out.print("Enter a three-digit integer: ");
        int num = input.nextInt();
        int a = num/100;
        int b = num%10;
        if (a==b) System.out.println(num + " is a palindrome");
        else System.out.println(num+" is not a palindrome");
        
    }


}
