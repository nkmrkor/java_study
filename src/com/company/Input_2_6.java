package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kaoru-nakamura2 on 2017/05/06.
 */
public class Input_2_6 {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.println( "How old are you？" );

        int age = Integer.parseInt( br.readLine() );

        System.out.println( "生まれてからの日数" + ( age * 360 ) );
    }
}
