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
        try {
            chapter3_2();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            chapter3_3();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            chapter3_4();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            chapter3_5();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            chapter3_6();
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

    private static void chapter3_2() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        int x = Integer.parseInt( br.readLine() );
        int y = Integer.parseInt( br.readLine() );

        if( x > y ) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }

    private static void chapter3_3() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));

        int x = Integer.parseInt( br.readLine() );
        int y = Integer.parseInt( br.readLine() );

        if( x < y ) {
            System.out.println("xはyより小さい");
        }

    }

    private static void chapter3_4() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));

        int x = Integer.parseInt( br.readLine() );
        int y = Integer.parseInt( br.readLine() );

        if( x < y ) {
            System.out.println("xはyより小さい");
        } else if( x > y ) {
            System.out.println("xはyより大きい");
        } else {
            System.out.println("xとyは等しい");
        }
    }

    private static void chapter3_5() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));

        int x = Integer.parseInt( br.readLine() );

        if( ( x % 2 ) == 0 ) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }
    }

    private static void chapter3_6() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));

        int x = Integer.parseInt( br.readLine() );

        if( ( x % 2 ) == 0 ){
            if( x >= 0 ){
                System.out.println("正の偶数");
            } else {
                System.out.println("負の偶数");
            }
        } else {
            if( x >= 0 ){
                System.out.println("正の奇数");
            } else {
                System.out.println("負の奇数");
            }
        }
    }

    private static void chapter3_9() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));

        int x = Integer.parseInt( br.readLine() );
        
    }

}
