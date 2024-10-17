package ch07_6;

@FunctionalInterface
interface Calculator{
    int sum(int a, int b);

}

class MyCalculator implements Calculator{
    public int sum(int a, int b){
        return a+b;
    }
}


public class Ch07_함수형 {
    public static void main(String[] args) {
        //일반적인 클래스로 객체를 만들경우
        Calculator mc = new MyCalculator();
        int result =mc.sum(3,4);
        System.out.println(result);

        //객체 대신 익명클래스로 만들기
        Calculator mc2 = new Calculator() {
            public int sum(int a, int b) {
                return a+b;
            }
        };
        int result2 =mc2.sum(5,7);
        System.out.println(result2);

        //람다식으로 익명 클래스를 대체
        Calculator mc3 = (int a, int b) -> a+b; // (->)이거뒤 a+b 는 return 생략
        int result3 =mc3.sum(5,7);
        System.out.println(result3);
    }
}
