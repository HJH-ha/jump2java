package ch04;

public class Ex04_01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

        int A = 55;

        if (A >= 90) {
            System.out.println("A");
        } else if (A >= 80) {
            System.out.println("B");
        } else if (A >= 70) {
            System.out.println("C");
        } else if (A >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }


        int year = 2020;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        System.out.println("Hello World!");

        int c = 1;
        int d = 3;

        System.out.println(c+d);
        System.out.println(c-d);
        System.out.println(c*d);
        System.out.println(c/d);
        System.out.println(c%d);


    }

}
