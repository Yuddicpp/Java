package com.company;

import java.util.Scanner;

public class Chapter5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        chapter5(input);
        chapter5_1(input);
    }

    public static void chapter5(Scanner input) {

        int enter = input.nextInt();
        int num =(int) (Math.random()*100);
        while (num!=enter){
            if (num<enter) System.out.println("High");
            else System.out.println("Low");
            enter = input.nextInt();
        }
    }

    public static void chapter5_1(Scanner input) {
        System.out.print("Enter an integer, the input end if it is 0: ");
        int num = input.nextInt();
        int positive =0,negative = 0, total = 0;
        double average = 0;
        while (num!=0){
            if (num>0) positive++;
            else negative++;
            total+=num;
            average=((double) total)/(positive+negative);
            num = input.nextInt();
        }
        System.out.println("The number of positive is "+positive);
        System.out.println("The number of negative is "+negative);
        System.out.println("The total is "+total);
        System.out.println("The average is "+average);
    }
}
