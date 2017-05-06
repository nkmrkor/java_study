package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kaoru-nakamura2 on 2017/05/06.
 */
public class Input_2_3 {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );

        int x = Integer.parseInt( br.readLine() );

        System.out.println( Math.pow( x, 1 ) );
        System.out.println( Math.pow( x, 2 ) );
        System.out.println( Math.pow( x, 3 ) );
    }
}
