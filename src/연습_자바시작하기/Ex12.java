package 연습_자바시작하기;

public class Ex12 {
    public static void main(String[] args) {
        int num = 374;
        int oneDigit = num/100;
        int twoDigits = num%10;
        int threeDigits = num/10%10;

        System.out.println(oneDigit);
        System.out.println(twoDigits);
        System.out.println(threeDigits);


        System.out.println(oneDigit+twoDigits+threeDigits);


        int num2 = 557;
        int one = num2/100;
        int two = num2%10;
        int three = num2/10%10;


        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

    }
}
