import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    private Queue<Integer> buffer = new LinkedList<>();
    private final int CAPACITY = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == CAPACITY) {
                    wait(); // Buffer is full, wait for consumer to consume
                }

                buffer.offer(value++);
                System.out.println("Produced: " + value);
                notify(); // Notify consumer that an item is produced
                Thread.sleep(1000); // Simulate some time to produce
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    wait(); // Buffer is empty, wait for producer to produce
                }

                int consumedValue = buffer.poll();
                System.out.println("Consumed: " + consumedValue);
                notify(); // Notify producer that an item is consumed
                Thread.sleep(1500); // Simulate some time to consume
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
