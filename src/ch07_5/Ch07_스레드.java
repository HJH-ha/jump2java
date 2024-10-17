package ch07_5;

import java.util.ArrayList;

// 스레드 상속한 클래스 sample
class Sample extends Thread {
    int seq;

    //생성자
    public Sample(int seq) {
        this.seq = seq;
    }

    //Thread 사용할때는(상속도 포함) run 메소드를 만들어줘야함. 필수임.
    @Override
    public void run() {
        //실제 스레드 실행코드
        System.out.println(this.seq+"thread start."); // 스레드 시작
        try {
            Thread.sleep(1000);//1초 대기
        } catch (InterruptedException e) {
            System.out.println("스레드 대기 예외발생 "+ e.getMessage());
        }
        System.out.println(this.seq+"thread end."); // 스레드 종료
    }
}


public class Ch07_스레드 {
    public static void main(String[] args) {
        ArrayList<Thread>  threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Sample(i); // 상속받아서 부모타입으로 선언가능
            t.start(); // 각 샘플 스레드 실행
            //스레드는 동시에 실행되서 순서 x
            threads.add(t);
        }
        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("main 종료");
    }
}
