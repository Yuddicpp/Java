package com.company;

import java.util.*;

public class Chapter11 {
    public static void main(String[] args) {
//        chapter11_1();
        chapter11_2();
    }

    public static void chapter11_1() {
        Triangle triangle = new Triangle(5,4,3);
        triangle.setColor("Blue");
        triangle.setFilled(true);
        System.out.println(triangle.getPerimeter()+" "+triangle.getArea()+" "+triangle.getColor()+triangle.getDateCreated());
    }

    public static void chapter11_2() {
        Person person = new Person();
        Student student = new Student();
        Employee employee = new Employee();
        Faculty faculty = new Faculty();
        Staff staff = new Staff();
        person.setName("person");
        student.setName("student");
        employee.setName("employee");
        faculty.setName("faculty");
        staff.setName("staff");
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}

class GeometricObject {
    private String color = "white";
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        dateCreated = new Date();
    }

    public GeometricObject(String color,boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on "+dateCreated+"\ncolor: "+color+" and filled: "+filled;
    }
}

class Triangle extends GeometricObject {
    private double side1,side2,side3;

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }

    public Triangle(double side1,double side2,double side3) {
        this.side3 = side3;
        this.side2 = side2;
        this.side1 = side1;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double angle = Math.acos((Math.pow(side1,2)+Math.pow(side2,2)-Math.pow(side3,2))/(2*side1*side2));
        return 0.5*side1*Math.sin(angle)*side2;
    }

    public double getPerimeter() {
        return (side1+side2+side3);
    }

    public String toString() {
        return "Triangle: side1 = "+side1+"side2 = "+side2+" side3 = "+side3;
    }
}

class Person {
    protected String name;
    private String address;
    private String tel;
    private String email;

    public Person() {

    }

    public Person (String name,String address,String tel,String email) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String toString() {
        return "Person"+this.name;
    }
}

class Student extends Person {
    final String ONE = "大一";
    final String TWO = "大二";
    final String THREE = "大三";
    final String FOUR = "大四";

    private String state;

    public Student() {

    }

    public Student(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public String toString() {
        return "Student"+this.name;
    }
}

class Employee extends Person {
    private String office;
    private int money;
    private Date dateWork;

    public Employee() {
        dateWork = new Date();
    }

    public Employee(String office,int money) {
        this.office = office;
        this.money = money;
        dateWork = new Date();
    }

    public Date getDateWork() {
        return dateWork;
    }

    public int getMoney() {
        return money;
    }

    public String getOffice() {
        return office;
    }

    public void setDateWork(Date dateWork) {
        this.dateWork = dateWork;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String toString() {
        return "Employee "+this.name;
    }

}

class Faculty extends Employee {
    private int workTime;
    private String stair;

    public Faculty() {

    }

    public Faculty(int workTime,String stair) {
        this.workTime = workTime;
        this.stair = stair;
    }

    public int getWorkTime() {
        return workTime;
    }

    public String getStair() {
        return stair;
    }

    public void setStair(String stair) {
        this.stair = stair;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public String toString() {
        return "Faculty"+this.name;
    }
}

class Staff extends Employee {
    private String call;

    public Staff() {

    }

    public Staff(String call) {
        this.call = call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getCall() {
        return call;
    }

    public String toString() {
        return "Staff"+this.name;
    }
}

