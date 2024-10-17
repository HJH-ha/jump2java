package ch07_5;

class Sample2 extends Thread {
    int n;

    public Sample2(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.n + "스레드 : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Ch07_멀티스레드 {
    public static void main(String[] args) {
        Thread t1 = new Sample2(1);
        Thread t2 = new Sample2(2);
        t1.start();
        t2.start();
        System.out.println("Main thread 종료");
    }
}
