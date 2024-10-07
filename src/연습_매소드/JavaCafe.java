package 연습_매소드;

public class JavaCafe {
    public static void main(String[] args) {
        printPay(10.00, 40);
        printPay(10.00, 50);
        printPay(7.50, 38);
        printPay(8.50, 66);

    }
    // if 문을 따로

    private static void printPay(double basePay, int hours) {
        double pay = basePay * hours;
        if (basePay < 8.00) {
            System.out.println("최저 시급 에러!");
            return;
        } else if (hours > 60) {
            System.out.println("초과 근무시간 에러!");
            return;
        } else if (hours > 40 || hours < 60) {
            pay = pay*1.1;
        }
        System.out.printf("$ %.2f\n", pay);
    }
}
