package utils;

import java.util.concurrent.TimeUnit;

/**
 * @author gorag
 */
public class BTraceTest {
    public static void main(String[] args) {
        try {
            TimeUnit.SECONDS.sleep(15);

        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        System.out.println("start main method...");

        new Thread(() -> {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);

                } catch (InterruptedException e) {
                    e.printStackTrace();

                }

            }

        }).start();

    }

}
