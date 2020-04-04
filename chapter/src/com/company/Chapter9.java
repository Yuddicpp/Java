package com.company;

import java.util.*;


public class Chapter9 {
    public static void main(String[] args) {
//        chapter9_1();
//        chapter9_2();
//        chapter9_3();
//        chapter9_4();
//        chapter9_5();
//        chapter9_6();
//        chapter9_7();
//        chapter9_8();
//        chapter9_9();
//        chapter9_10();
//        chapter9_11();
//        chapter9_12();
        chapter9_13();
    }

    public static void chapter9_1() {
        Rectangle a = new Rectangle(4,40);
        Rectangle b = new Rectangle(3.5,35.9);
        System.out.println(a.width+" "+a.height+" "+a.getArea()+" "+a.getPerimeter());
    }

    public static void chapter9_2() {
        Stock stock = new Stock("ORCL","Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println(stock.getChangePercent()*100+"%");
    }

    public static void chapter9_3() {
        Date date = new Date();
        date.setTime(1000000000);
        System.out.println(date.toString());
    }

    public static void chapter9_4() {
        Random random = new Random(1000);
        System.out.println(random.nextInt(100));
    }

    public static void chapter9_5() {
        GregorianCalendar gre = new GregorianCalendar();
        System.out.println(gre.get(GregorianCalendar.YEAR)+" "+(gre.get(GregorianCalendar.DATE)+1)+" "+gre.get(GregorianCalendar.DATE));

        gre.setTimeInMillis(1234567898765L);
        System.out.println(gre.get(GregorianCalendar.YEAR)+" "+(gre.get(GregorianCalendar.DATE)+1)+" "+gre.get(GregorianCalendar.DATE));

    }

    public static void chapter9_6() {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start(System.currentTimeMillis());
        for (int i = 0;i<1000;i++);
        stopWatch.stop(System.currentTimeMillis());
        System.out.println(stopWatch.getElapsedTime());
    }

    public static void chapter9_7() {
        Account account = new Account(1122,20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println(account.getMonthlyInterestRate());
        System.out.println(account.getBalance());
        System.out.println(account.getDateCreated().toString());
    }

    public static void chapter9_8() {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }

    public static void chapter9_9() {
        RegularPolygon regularPolygon1 = new RegularPolygon();
        RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
        RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println(regularPolygon1.getPerimeter()+" "+regularPolygon1.getArea());
        System.out.println(regularPolygon2.getPerimeter()+" "+regularPolygon2.getArea());
        System.out.println(regularPolygon3.getPerimeter()+" "+regularPolygon3.getArea());

    }

    public static void chapter9_10() {
        System.out.print("Enter a b c: ");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double d = quadraticEquation.getDiscriminant();
        if (d>0) {
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (d==0) {
            System.out.println(quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }

    public static void chapter9_11() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
        if (!linearEquation.isSolvable()){
            System.out.println("The equation has no solutions.");
        } else {
            System.out.println(linearEquation.getX());
            System.out.println(linearEquation.getY());
        }
    }

    public static void chapter9_12() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter (x1,y1):");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter (x2,y2):");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Enter (x3,y3):");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        System.out.print("Enter (x4,y4):");
        double x4 = input.nextDouble();
        double y4 = input.nextDouble();
        double a = -(y2-y1)/(x2-x1);
        double b = 1;
        double e = b*y1+a*x1;
        double c = -(y4-y3)/(x4-x3);
        double d = 1;
        double f = c*x3+d*y3;
        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
        if (!linearEquation.isSolvable()) {
            System.out.println("The is no point.");
        }else {
            System.out.println("("+linearEquation.getX()+","+linearEquation.getY()+")");
        }
    }

    public static void chapter9_13() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] array = new double[row][col];
        System.out.println("Enter the array:");
        for (int i = 0;i<row;i++){
            for (int j = 0;j<col;j++){
                array[i][j] = input.nextDouble();
            }
        }
        Location location = new Location(array);
        System.out.print("The location of the largest element is "+location.getMaxValue()+" at ("+
                location.getRow()+", "+location.getColumn()+")");

    }
}



class Rectangle {
    double width;
    double height;

    public Rectangle() {
        this.width=1;
        this.height=1;
    }

    public Rectangle(double width,double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return 2*(width+height);
    }
}

class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbol,String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        return (currentPrice-previousClosingPrice)/previousClosingPrice;
    }
}

class StopWatch {

    private long startTime;
    private long endTime;

    public void start(long startTime) {
        this.startTime = startTime;
    }

    public void stop(long endTime) {
        this.endTime = endTime;
    }

    public long getElapsedTime() {
        return endTime-startTime;
    }

}

class Account {
    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int id,double balance) {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return balance*(annualInterestRate/1200);
    }

    public void withDraw(double money) {
        balance-=money;
    }

    public void deposit(double money) {
        balance+=money;
    }
}

class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public String toString() {
        if (on) {
            return speed+" "+color+" "+radius;
        }else {
            return "fan is off"+color+radius;
        }
    }

}

class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon() {
        n = 3;
        side = 1;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n,double side) {
        this.n = n;
        this.side = side;
        x = 0;
        y = 0;
    }

    public RegularPolygon(int n,double side,double x,double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getPerimeter() {
        return n*side;
    }

    public double getArea() {
        double area = n*(Math.pow(side,2))/(4*Math.tan(Math.PI/n));
        return area;
    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a,double b,double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b,2)-4*a*c;
    }

    public double getRoot1() {
        if ((Math.pow(b,2)-4*a*c)>=0) {
            return ((-b+Math.pow((Math.pow(b,2)-4*a*c),0.5))/2/a);
        } else {
            return 0;
        }
    }

    public double getRoot2() {
        if ((Math.pow(b,2)-4*a*c)>=0) {
            return ((-b-Math.pow((Math.pow(b,2)-4*a*c),0.5))/2/a);
        } else {
            return 0;
        }
    }
}

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a,double b,double c,double d,double e,double f) {
        this.a = a;
        this.d = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        if ((a*d-b*c)!=0) return true;
        else return false;
    }

    public double getX() {
        return ((e*d-b*f)/(a*d-b*c));
    }

    public double getY() {
        return ((a*f-e*c)/(a*d-b*c));
    }
}

class Location {
    private int row,column;
    private double maxValue;

    public Location(double[][] array) {
        int y =array[0].length;
        int x = array.length;
        maxValue = 0;
        for (int i = 0;i<x;i++){
            for (int j = 0;j<y;j++){
                if (array[i][j]>maxValue) {
                    maxValue=array[i][j];
                    row = i;
                    column = j;
                }
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }
}
