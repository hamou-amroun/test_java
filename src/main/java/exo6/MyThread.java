package exo6;

import java.util.concurrent.Semaphore;

public class MyThread extends Thread {

    Semaphore hello, world;

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                world.acquire(); // wait-for it
                System.out.println("  World!");
                hello.release(); // go say hello
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
