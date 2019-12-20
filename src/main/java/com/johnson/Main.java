package com.johnson;

import com.johnson.testcase.Calculation;

/**
 * @author johnson lin
 * @date 2019/12/20 6:31 PM
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        long count = Calculation.calc();
        System.out.println(count);
    }
}
