package org.example.threads;

import java.util.ArrayList;
import java.util.List;

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrayList = new ArrayList<>();

        Runnable runnable = () -> {
            synchronized (arrayList) {
                for (int i = 0; i < 1000; i++) {
                    arrayList.add(i);
                }
//            System.out.println(arrayList.size());
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join(); // main thread waits until the completion of this thread
        thread2.join();
        arrayList.forEach(System.out::println);
        System.out.println(arrayList.size());
    }
}
