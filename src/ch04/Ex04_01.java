package ch04;

public class Ex04_01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

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
        System.out.println();


        int year = 2020;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        System.out.println();

        int x = -9;
        int y = 13;

        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        } else if (x < 0 && y > 0) {
            System.out.println("2");

        } else {
            System.out.println("3");
        }
        System.out.println();



    }

}



