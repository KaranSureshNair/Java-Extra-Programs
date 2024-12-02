class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        // Wait until the producer has put a value
        while (!valueSet) {
            try {
                System.out.println("\nConsumer waiting\n");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();  // Set interrupt flag
                return -1; // Handle interruption gracefully
            }
        }

        System.out.println("Got: " + n);
        valueSet = false;
        notify();  // Notify the producer that the consumer has consumed the item
        return n;
    }

    synchronized void put(int n) {
        // Wait until the consumer consumes the previous value
        while (valueSet) {
            try {
                System.out.println("\nProducer waiting\n");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();  // Set interrupt flag
                return; // Handle interruption gracefully
            }
        }

        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);
        notify();  // Notify the consumer that a new item is available
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (i < 15) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        int i = 0;
        while (i < 15) {
            int r = q.get();
            if (r != -1) { // Handle interrupted exception gracefully
                System.out.println("Consumed: " + r);
            }
            i++;
        }
    }
}

public class ProducerConsumerFix {
    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}
