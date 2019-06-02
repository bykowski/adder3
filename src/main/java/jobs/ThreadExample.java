package jobs;

public class ThreadExample {


    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 99999; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });
        t1.setName("t1");
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 99999; i++) {
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                }
            }
        });
        t2.setName("t2");
        t2.setPriority(10);
        t2.start();


    }



}
