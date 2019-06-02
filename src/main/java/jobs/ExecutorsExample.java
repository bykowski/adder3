package jobs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {

        public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 999; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 9999999; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });

            executorService.shutdown();
            executorService.shutdownNow();











    }

}
