package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kaoru-nakamura2 on 2017/05/17.
 */
public class Chapter3 {
    public static void main(String[] args) {
        try {
            chapter3_1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void chapter3_1() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        int x = Integer.parseInt( br.readLine() );
        int y = Integer.parseInt( br.readLine() );

        if( x > y )
            System.out.println( "xはyより大きい。" );
    }
}
