package com.company;

import java.io.IOException;

/**
 * Created by kaoru-nakamura2 on 2017/05/17.
 */
public class Chapter4 {
    public static void main(String[] args) {
        try {
            chapter4_1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            chapter4_2();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            chapter4_3();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            chapter4_4();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void chapter4_1() throws IOException {
        for (int i=0; i<10; i++) {
            System.out.println("SPAM");
        }
    }
    private static void chapter4_2() throws IOException {
        for (int i=1; i<10; i++) {
            System.out.println( "3 * " + i + " = " + 3*i );
        }
    }
    private static void chapter4_3() throws IOException {
        for (int i=1; i<9; i++) {
            System.out.println( Math.pow(2, i) );
        }
    }
    private static void chapter4_4() throws IOException {
        int x = 1;
        System.out.println("chapter4_4");
        for (int i = 2 ; i <= 7 ; i++) {
            x *= i;
        }
        System.out.println( x );
    }

}
