package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Chapter10 {
    public static void main(String[] args) {
//        chapter10_1();
        chapter10_10();
    }

    public static void chapter10_1() {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        time1.showTime();
        time2.showTime();
    }

    public static void chapter10_10() {
        Queue queue = new Queue();
        System.out.println(queue.empty());
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.getSize());
    }
}

class Time {
    long hour,minute,second;

    public Time () {
        hour = GregorianCalendar.HOUR;
        minute = GregorianCalendar.MINUTE;
        second = GregorianCalendar.SECOND;
    }

    public Time (long ms) {
        Calendar calendar = Calendar.getInstance();
        Date date = new Date(ms);
        calendar.setTime(date);
        hour = calendar.get(Calendar.MONTH);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);

    }

    public Time(int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        hour =(elapseTime/(1000*60*60));
        minute = (elapseTime%(1000*60*60))/1000/60;
        second = (elapseTime%(1000*60))/1000;
    }

    public void showTime() {
        System.out.println(hour+":"+minute+":"+second);
    }
}

class Queue {
    private int[] element;
    private int size;

    public Queue() {
        element = new int[8];
        size = 0;
    }

    public void enqueue(int v) {
        element[size] = v;
        size++;
    }

    public int dequeue() {
        int pop = element[0];
        if (size>0) {
            for (int i = 0;i<size-1;i++) {
                element[i]=element[i+1];
            }
            size--;
            return pop;
        } else {
            return 0;
        }

    }

    public boolean empty() {
        if (size>0) {
            return false;
        } else {
            return true;
        }
    }

    public int getSize() {
        return size;
    }
}
