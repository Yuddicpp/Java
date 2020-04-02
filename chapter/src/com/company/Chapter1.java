package com.company;

/*Chapter1 test*/



public class Chapter1 {
    public static void chapter1_1(){
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    }

    public static void main(String []args) {
        chapter1_1();
        chapter1_2();
        chapter1_3();
        chapter1_4();
        chapter1_5();
        chapter1_6();
        chapter1_7();
        chapter1_8();
        chapter1_9();
        chapter1_10();
        chapter1_11();
        chapter1_12();
        chapter1_13();

    }

    public static void chapter1_2() {
        for(int i=0;i<5;i++) {
            System.out.println("Welcome to Java");
        }
    }

    public static void chapter1_3() {
        System.out.println("    J     A     V     V     A");
        System.out.println("    J    A A     V   V     A A");
        System.out.println("J   J   A   A     V V     A   A");
        System.out.println(" J J   A     A     V     A     A");

    }

    public static void chapter1_4() {
        System.out.println("a   a^2   a^3");
        for(int i=1;i<4;i++) {
            System.out.println(i+"   "+i*i+"   "+i*i*i);
        }
        System.out.println("4   16  64");
    }

    public static void chapter1_5() {
        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));
    }

    public static void chapter1_6() {
        int k = 0;
        for(int i = 1;i<10;i++) {
            k+=i;
        }
        System.out.println(k);
    }

    public static void chapter1_7() {
        double pi=0;
        double k = 0;
        for(int i = 0;i<1000000;i++) {
            k=((Math.pow(-1, i))*1.0/(2*i+1));
            pi+=k;
        }
        pi*=4;
        System.out.println(pi);
    }

    public static void chapter1_8() {
        System.out.println(String.valueOf(2*5.5*Math.PI)+"  "+String.valueOf(5.5*5.5*Math.PI));
    }

    public static void chapter1_9() {
        System.out.println(4.5*7.9);
    }

    public static void chapter1_10() {
        System.out.println(14/1.6/(45.5/60));
    }

    public static void chapter1_11() {
        int num = 312032486;
        for(int i =1;i<365*5+1;i++) {
            if(i%7==0)	num++;
            else if(i%13==0)	num--;
            else if(i%45==0)	num++;
        }
        System.out.print(num);
    }

    public static void chapter1_12() {
        System.out.println(24*1.6/((100+35/60)/60));
    }

    public static void chapter1_13() {
        System.out.println((44.5*0.55-50.2*5.9)/(3.4*0.55-50.2*2.1));
        System.out.println((3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1));
    }
}

