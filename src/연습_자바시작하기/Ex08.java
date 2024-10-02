package 연습_자바시작하기;

public class Ex08 {
    public static void main(String[] args) {
        int totalSec = 7582;
        int min = totalSec/60;  //126분
        int sec = totalSec%60;  //22초
        int time = min/60;
        int min2 = min%60;

        System.out.println(min);
        System.out.println(sec);
        System.out.println(time);
        System.out.println(min2);

        System.out.println(time+"시간 " + min2+"분 " + sec+"초");

    }
}
