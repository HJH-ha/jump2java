package ch03;

public class Ch03_불린 {
    public static void main(String[] args) {
        //불(boolean) : 참(true , 1) 또는 거짓(false , 0) 자료형 ,  불린 타입은 is가 많이 나옴 앞에 붙는영어로
        boolean isSuccess = true;  // 1
        boolean isTest = false;    // 0
        // 참 또는 거짓을 판단하는 연산
        // 조건문에 사용하거나 불타입에 대입
        System.out.println(2>1); // 참
        System.out.println(2<1); // 거짓
        System.out.println(1 == 2); // == 는 같다비교 거짓
        System.out.println(3%2 == 1); // 3나누기 2의 나머지가 1이다 참

        // 조건문에 사용
        int base = 180;
        int h = 179;
        boolean isTall = h > base; // base 보다 h가 크면 참
        // if 문에는 조건이 참일때만 명령문을 실행!
        if (isTall) {
            System.out.println("키가 큽니다.");
        }


    }
}
