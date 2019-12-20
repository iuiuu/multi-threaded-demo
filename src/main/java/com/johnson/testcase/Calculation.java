package com.johnson.testcase;

/**
 * @author johnson lin
 * @date 2019/12/20 6:28 PM
 */
public class Calculation {
    private static long count = 0;

    private void add10K() {
        long idx = 0;
        while(idx++ < 100_000_000) {
            count += 1;
        }
    }

    public static long calc() throws InterruptedException {
        final Calculation test = new Calculation();
        // 创建两个线程，执行add()操作
        Thread th1 = new Thread(test::add10K);
        Thread th2 = new Thread(()->{
            test.add10K();
        });
        // 启动两个线程
        th1.start();
        th2.start();
        // 等待两个线程执行结束
        th1.join();
        th2.join();

        return count;
    }
}
