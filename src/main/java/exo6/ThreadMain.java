package exo6;

import java.util.concurrent.Semaphore;

public class ThreadMain {

    static Semaphore hello = new Semaphore(1);
    static Semaphore world = new Semaphore(0);

    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.hello = hello;
        mt.world = world;
        mt.start();

        for (int i = 0; i < 5; i++) {
            hello.acquire(); //wait for it
            System.out.println("Hello");
            world.release(); //go say world
        }
    }
}
