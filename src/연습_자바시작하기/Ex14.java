package 연습_자바시작하기;

public class Ex14 {
    public static void main(String[] args) {
        int total = 152365;
        int oman = total / 50000;   //  3
        int man = (total - 50000*oman) / 10000;  //  0
        int ochun = (total - 50000*oman) / 5000;  //  0
        int chun = (total - 50000*oman) / 1000;  //  2
        int dis = total % 1000;
        int bill = oman + man + ochun + chun;

        // \n 은 줄바꿈을 의미
        System.out.printf("5만원권 x %d\n" , oman);
        System.out.printf("1만원권 x %d\n" , man);
        System.out.printf("5천원권 x %d\n" , ochun);
        System.out.printf("1천원권 x %d\n" , chun);
        System.out.println("----------------------");
        System.out.printf("총 장수: %d장\n" , bill);
        System.out.printf("금액: %d원\n" , total-dis);
        System.out.printf("할인: %d원\n" , dis);

//        System.out.println(oman);
//        System.out.println(man);
//        System.out.println(ochun);
//        System.out.println(chun);
//        System.out.println(dis);
//        System.out.println(bill);

//        System.out.println("ㅡㅡㅡㅡㅡㅡㅡ");
//        System.out.printf("5만원권 x %d\n", oman);
//        System.out.printf("1만원권 x %d\n ", man);
//        System.out.printf("5천원권 x %d\n ", ochun);
//        System.out.printf("1천원권 x %d\n ", chun);
//        System.out.println("----------------------------");
//        System.out.printf("총 장수: %d장\n", bill);
//        System.out.printf("금액: %d원\n", total-dis);
//        System.out.printf("할인: %d원\n", dis);



    }
}
