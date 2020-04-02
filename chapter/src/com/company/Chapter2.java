package com.company;

import java.util.Scanner;

/*Chapter2 test*/


public class Chapter2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
//		chapter2_1(input);
//		chapter2_2(input);
//		chapter2_3(input);
//		chapter2_4(input);
        chapter2_5(input);
//		chapter2_6(input);
    }

    public static void chapter2_1(Scanner input) {
        System.out.print("Enter a degree in Celsius:");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0/5)*celsius+32;
        System.out.println(celsius+" Celsius is "+fahrenheit+" Fahrenheit");
    }

    public static void chapter2_2(Scanner input) {
        System.out.print("Enter the radius and length of a cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        System.out.println("The area is "+Math.PI*Math.pow(radius,2));
        System.out.println("The volume is "+Math.PI*Math.pow(radius,2)*length);
    }

    public static void chapter2_3(Scanner input) {
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        System.out.println(feet+" feet is "+0.305*feet+" meters");
    }

    public static void chapter2_4(Scanner input) {
        System.out.print("Enter a number in pounds ");
        double pounds = input.nextDouble();
        System.out.println(pounds+" pounds is "+pounds*0.454 +" kilograms");
    }

    public static void chapter2_5(Scanner input) {
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity_rate = input.nextDouble();
        System.out.println("The gratuity is $"+subtotal*gratuity_rate/100 +" and total is $"+(subtotal*gratuity_rate/100+subtotal));
    }

    public static void chapter2_6(Scanner input) {
        System.out.print("Enter a number between 0 and 1000: ");
        int num = input.nextInt();
        System.out.println("The sum of the digits is "+(num%10+num%100/10+num/100));

    }
}
