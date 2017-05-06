package com.company;

import java.io.IOException;

/**
 * Created by kaoru-nakamura2 on 2017/05/06.
 */
public class CallFork {
    public static void main() {

        try {
            Fork_3_1 fork_1 = new Fork_3_1();
            fork_1.main();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
