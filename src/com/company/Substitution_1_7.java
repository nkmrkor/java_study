package com.company;

/**
 * Created by kaoru-nakamura2 on 2017/05/05.
 */
public class Substitution_1_7 {
    public static void main(){
        int x, y, z;

        x = 3;
        y = 7;

        z = x;
        x = y;
        y = z;

        System.out.println("x = " + x + ", y = " + y);
    }
}
