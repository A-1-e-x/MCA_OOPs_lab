
class Fibonacci implements Runnable {
    int n;

    Fibonacci(int n) {
        this.n = n;
    }

    public void run() {
        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;

            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}

class EvenNumbers implements Runnable {
    int start, end;

    EvenNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Even Numbers:");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            try {
                Thread.sleep(200); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println();
    }
}
public class Fib {
    public static void main(String[] args) throws InterruptedException {

        Fibonacci fib = new Fibonacci(10);
        EvenNumbers even = new EvenNumbers(1, 20);

        Thread t1 = new Thread(fib);
        Thread t2 = new Thread(even);

        t1.start();
        t1.join(); 

        t2.start();
        t2.join();
    }
}
