package com.company;

import java.util.*;
import java.io.*;

public class Chapter12 {
    public static void main(String[] args) throws Exception {
//        chapter12_1();
//        chapter12_2();
//        chapter12_3();
//        chapter12_4();
        chapter12_12();
    }

    public static void chapter12_1() throws NumberFormatException {
        System.out.println("Enter:");
        Scanner input = new Scanner(System.in);
        String num1 = input.next();
        String operation = input.next();
        String num2 = input.next();
        int num_1 = 0,num_2 = 0;

        try {
            num_1 = Integer.parseInt(num1);
        }
        catch (NumberFormatException nf) {
            System.out.println("Wrong input: "+num1);
            System.exit(0);
        }

        try {
            num_2 = Integer.parseInt(num2);
        }
        catch (NumberFormatException nf) {
            System.out.println("Wrong input: "+num2);
            System.exit(0);
        }

        if (operation.equals("/")) {
            if (num_2==0) {
                System.out.println("Wrong input");
                System.exit(0);
            }
        }

        switch (operation) {
            case "+":
                System.out.println(num1+operation+num2+"= "+(num_1+num_2));
                break;

            case "-":
                System.out.println(num1+operation+num2+"= "+(num_1-num_2));
                break;

            case "*":
                System.out.println(num1+operation+num2+"= "+(num_1*num_2));
                break;

            case "/":
                System.out.println(num1+operation+num2+"= "+(num_1/num_2));
                break;
        }

    }

    public static void chapter12_2() {
        System.out.println("Enter two Integer: ");
        int[] num = new int[2];
        for (int i = 0;i < 2;i++) {
            while (true) {
                try {
                    Scanner input = new Scanner(System.in);
                    num[i] = input.nextInt();
                    break;
                }
                catch (Exception ex) {
                    System.out.println("Enter a Integer");
                }
            }
        }
        System.out.println(num[0]+" + "+num[1]+" = "+(num[0]+num[1]));


    }

    public static void chapter12_3() {
        int[] num = new int[100];
        for (int i = 0;i < 100;i++) {
            num[i] = (int)(Math.random()*100);
        }

        System.out.println("Enter a integer");
        try {
            int k = chapter12_3_arrayNum();
            System.out.println(num[k]);
        }
        catch (InputMismatchException im) {
            System.out.println(im.toString());
        }



    }

    public static int chapter12_3_arrayNum() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num>99) {
            throw new InputMismatchException("Out");
        } else {
            return num;
        }
    }

    public static void chapter12_4() {
        double side1,side2,side3;
        Scanner input = new Scanner(System.in);
        side1 = input.nextDouble();
        side2 = input.nextDouble();
        side3 = input.nextDouble();
        try {
            IllegalTriangle illegalTriangle = new IllegalTriangle(side1,side2,side3);
        } catch (IllegalTriangleException e) {
            System.out.println("Input Error");
        }
    }

    public static void chapter12_12() throws FileNotFoundException {
        File file = new File("E:\\java\\chapter\\src\\com\\company\\Test.txt");
        if (file.exists()) {
            System.out.println("Exist");
        } else {
            System.out.println("File is not found");
            System.exit(1);
        }
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(new File("E:\\java\\chapter\\src\\com\\company\\Output.txt"));
        String line1="";
        while (input.hasNext()) {
            line1 = input.nextLine();
            if (line1.contains("{")) {
                output.print("{");
            } else output.print("\n"+line1);
        }

        input.close();
        output.close();

    }
}

class IllegalTriangleException extends Throwable {
    IllegalTriangleException() {

    }
}

class IllegalTriangle extends Triangle {
    public IllegalTriangle(double side1,double side2,double side3) throws IllegalTriangleException {
        if ((side1+side2)>side3&&(side1+side3)>side2&&(side2+side3)>side1) {
            this.side3 = side3;
            this.side2 = side2;
            this.side1 = side1;
        } else {
            throw new IllegalTriangleException();
        }
    }
}
