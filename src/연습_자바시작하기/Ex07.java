package 연습_자바시작하기;

public class Ex07 {
    public static void main(String[] args) {
        int a = 24;
        int b = 6;

        System.out.println("곱하기: 24 x 6 = "+ a*b);
        System.out.printf("곱하기: %d x %d = %d\n" , 24, 6 , 24*6);
        System.out.println("나누기: 24 / 6 = "+ a/b);
        System.out.printf("누나기: %d / %d = %d\n" , 24 , 6 , 24/6);
        System.out.println("나누기 나머지 : 24 / 6 = "+ a%b);
        System.out.printf("나누기 나머지 : %d / %d = %d\n" , 24 , 6 , 24%6);
    }
}
