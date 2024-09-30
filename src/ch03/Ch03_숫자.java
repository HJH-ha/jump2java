package ch03;

public class Ch03_숫자 {
    public static void main(String[] args) {
        //정수 타입(자료형) int가 기본
        int age = 10;
        long count = 2183548465115644568L;
        //실수는 더블이 기본 , 기본이 아닐때 끝에 영어를 적어줌
        double pi2 = 3.141592653589793238;
        float pi = 3.14f;  // 특별한 경우가 아니면 사용 안함 그냥 더블 사용
        // 8진수(0)와 16진수(0x) 표기방법
        int oxtal = 023;   // 8진수
        int hex = 0xc3;    // 16진수
        // 숫자 연산 ( + - * / %  ,  더하기 빼기 곱하기 나누기 나머지)
        int a = 10;
        int b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(7%3); // 나머지
        System.out.println(3%7);

        //증감연산(++ , --) 1씩 증가 또는 감소
        int i = 0;
        int j = 10;
        i++; // i = i + 1;
        j--; // j = j - 1;
        System.out.println(i);  // 1
        System.out.println(j);  // 9
        //증감연산자가 앞에 있을때 먼저 증감 뒤에는 뒤에 증감
        System.out.println(++i);  // 2
        System.out.println(j--);  // 9 ==> 뒤에 8이됨
        System.out.println(j);    // 8
        int x = i++;    // x = 2 , i = 3
        int y = i + --j; // y = 3 + 7 = 10
        System.out.println(x);
        System.out.println(y);
        System.out.println(i);
        System.out.println(j);

        //불 타입 1비트 0(false) 아니면 1(true) , 참 또는 거짓



        System.out.println(age);
        System.out.println(count);
        System.out.println(pi);
        System.out.println(pi2);
        System.out.println(oxtal);
        System.out.println(hex);
        System.out.println(15);
    }
}
