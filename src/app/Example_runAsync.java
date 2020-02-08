package app;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Example_runAsync {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {

            try {

                TimeUnit.SECONDS.sleep(1);

            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("I'll run in a separate thread than the main thread.");

        });

        future.get();
    }
}