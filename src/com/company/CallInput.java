package com.company;
import java.io.*;
/**
 * Created by kaoru-nakamura2 on 2017/05/05.
 */
public class CallInput {
    public static void main() {

        try {
            Input_2_1 inp_1 = new Input_2_1();
            Input_2_1.main();
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }

        try {
            Input_2_2 inp_2 = new Input_2_2();
            Input_2_2.main();
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
