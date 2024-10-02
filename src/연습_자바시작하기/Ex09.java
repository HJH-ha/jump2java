package 연습_자바시작하기;

public class Ex09 {
    public static void main(String[] args) {
        // 속도 = 거리 / 시간
        double meter = 100;
        double sec = 18;
        double speed = meter/sec;

        System.out.println(speed);// 5.555555555 미터 퍼 세컨드
        System.out.printf("%.2f",speed);
        System.out.println();

        //이거를 키로미터 퍼 아워로 변경

        double kilo = meter/1000;
        double hour = sec/3600;
        //1시간은 60분 1분은 60초 60*60 3600초 한시간
        double speed2 = kilo/hour;

        System.out.println(speed2 + " km/h");
    }
}
