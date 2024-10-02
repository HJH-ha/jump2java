package 연습_자바시작하기;

public class Ex03 {
    public static void main(String[] args) {
        double mon=8.62;
        double tue=10.23;
        double wen=12.48;
        double thu=7.82;
        double fri=9.54;

        double total = mon+tue+wen+thu+fri;

        System.out.println(total);
        System.out.println(String.format("$%.2f",total));
        System.out.printf("$%.2f",total);

        // 배열을 써야함
//        for (double i = 0; i < 5; i++) {
//           System.out.println(total[i]);
//        }


        }
    }

