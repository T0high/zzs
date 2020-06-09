package com.zzs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created on Date 2020/5/26 05 2020
 *
 * @author zzs
 */
public class ThreadPoolTest {

    public static void main(String[] args) {
       // ExecutorService executorService=Executors.newFixedThreadPool(5);
       // ExecutorService executorService=Executors.newSingleThreadExecutor();
        ExecutorService executorService=Executors.newCachedThreadPool();
        try {
            for (int i = 1; i <=10; i++) {
                executorService.execute(()->{
                    System.out.println(Thread.currentThread().getName()+"办理业务");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}
