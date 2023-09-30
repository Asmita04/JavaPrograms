package multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

// ActiveObject class represents an active object that performs tasks asynchronously
class ActiveObject {
    private final BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(10);

    // Constructor starts the background thread
    public ActiveObject() {
        Thread workerThread = new Thread(() -> {
            while (true) {
                try {
                    Runnable task = queue.take();
                    task.run();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        workerThread.start();
    }

    // Method to asynchronously execute a task
    public void execute(Runnable task) {
        try {
            queue.put(task);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an active object
        ActiveObject activeObject = new ActiveObject();

        // Define tasks
        Runnable task1 = () -> System.out.println("Task 1 executed");
        Runnable task2 = () -> System.out.println("Task 2 executed");

        // Execute tasks asynchronously
        activeObject.execute(task1);
        activeObject.execute(task2);

        // Allow some time for tasks to execute
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
