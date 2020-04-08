package com.company;

import java.util.*;
import java.io.*;

public class Chapter12 {
    public void main(String[] args) {
        Scanner input = new Scanner(System.in);
    }

    public void chapter12_1() throws Exception {
        try {
            int i = 0;
        }
        catch (Exception ex) {
            int i = 0;
            throw new Exception();
        }

        File file = new File("demo.txt");
        PrintWriter output = new PrintWriter(file);

    }


}
