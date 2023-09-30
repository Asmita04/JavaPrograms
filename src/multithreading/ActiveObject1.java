package multithreading;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Employee {
    private String name;
    private BlockingQueue<String> taskQueue = new LinkedBlockingQueue<>();

    public Employee(String name) {
        this.name = name;
        startProcessingThread();
    }

    public void performTask(String task) {
        taskQueue.add(task);
    }

    private void startProcessingThread() {
        Thread processingThread = new Thread(() -> {
            while (true) {
                try {
                    String task = taskQueue.take();
                    System.out.println(name + " is performing task: " + task);
                    // Simulate task execution
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        processingThread.start();
    }
}

public class ActiveObject1 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Alice");
        Employee employee2 = new Employee("Bob");

        employee1.performTask("Task 1");
        employee2.performTask("Task 2");
        employee1.performTask("Task 3");
    }
}
