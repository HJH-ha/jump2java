package ch05;

class Sample{
    //메서드 입력 매개변수(parameter) a,b
    int sum(int a, int b){
        return a + b;
    }
    //리턴값이 없는 매서드
    void sum2(int a, int b){
        System.out.println(a+"와 "+b+"의 합은 "+ (a+b)+"입니다.");
        System.out.printf("%d와 %d의 합은 %d입니다.%n", a ,b , a+b);
    }

    //입력값은 없고 문자열 "HI"가 반환됨.
    String say(){
        return "Hi";
    }
    //입력 리턴 없는 메서드
    void hello(){
        System.out.println("헬로우!");
    }
    //리턴으로 빠져나오기 (매서드에서 리턴을 만나면 종료된다.)
    void sayNick(String nick){
        if("바보".equals(nick) || "등신".equals(nick)){
            return;  // 종료 , (아래의 코드는 실행 안됨)
        }
        System.out.println("나의 별명은 "+nick+" 입니다.");

    }
}

public class Ch05_매서드 {
    /*int sum(int a, int b){
        return a + b;
    }*/
    public static void main(String[] args) {
//        int a = 3;
//        int b = 4;

        Sample ad = new Sample();
        // 객체.매서드명 => 매소드 호출(사용) , 이때 전달하는 입력값을 인수(arguments)라고함 3,4
        int c = ad.sum(3, 4);
        int d = ad.sum(c, 5);

        System.out.println(c);
        System.out.println(d);

        String say = ad.say();
        System.out.println(say);

        ad.sum2(3,4);

        ad.hello();

        int e = ad.sum(5,6);
        System.out.println(e);

        ad.sayNick("천재");
        ad.sayNick("바보"); // 출력안됨.
        ad.sayNick("짱구");
        ad.sayNick("등신"); // 출력안됨.




    }
}
