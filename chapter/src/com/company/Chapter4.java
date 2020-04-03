package com.company;

import java.util.Scanner;

/*
    类命名方法：第一个字母大写
    函数命名方法：第一个小写后面单词开头大写

 */


public class Chapter4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        chapter4_1(input);
//        chapter4_2(input);
//        chapter4_8(input);
//        chapter4_11(input);
        chapter4_12(input);
    }

    public static void chapter4_1(Scanner input){
        System.out.print("Enter the length from the center to a vertex: ");
        double length = input.nextDouble();
        double area = (5*Math.pow((2*length*Math.sin(Math.PI/5)),2))/(4*Math.tan(Math.PI/5));
        System.out.printf("The area of the pentagon is %4.2f",area);
    }

    public static void chapter4_2(Scanner input) {
        System.out.print("Enter point1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double d = 6371.01*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));
        System.out.println("The distance between the two points is "+d+" km");
    }

    public static void chapter4_8(Scanner input) {
        System.out.print("Enter an ASCII code: ");
        int ch = input.nextInt();
        System.out.println("The character for ASCII code "+(int)(char)ch+" is "+(char)ch);
    }

    public static void chapter4_11(Scanner input) {
        System.out.print("Enter a decimal value(0-15): ");
        int num = input.nextInt();
        if (num<16) {
            if (num>9) System.out.println("The hex value is "+(char)(num+55));
            else System.out.println("The hex value is "+num);
        }else System.out.println(num+" is an invalid input");
    }

    public static void chapter4_12(Scanner input) {
        System.out.print("Enter a hex digit: ");
        String str = input.next();
        char ch = str.charAt(0);
        if ((ch<71&&ch>64)||(ch<58&&ch>48)) {
            if (ch<58&&ch>48) System.out.println("The binary value is "+Integer.toBinaryString((int)ch-48));
            else System.out.println("The binary value is "+Integer.toBinaryString((int)ch - 55));
        }
        else {
            System.out.println(ch+" is an invalid input");
        }
    }




}
