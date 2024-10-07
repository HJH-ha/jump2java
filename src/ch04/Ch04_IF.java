package ch04;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch04_IF {
    public static void main(String[] args) {
        /* ctrl + shift + /  여러줄 주석
         * if 문*/
        int money = 4000;
        boolean hasCard = true;
        if (money >= 3000 || hasCard) {
            System.out.println("택시를 타고 간다.");
        } else {
            System.out.println("걸어가라!");
        }

        // if 조건에 리스트 contains
        ArrayList<String> pocket = new ArrayList<>(Arrays.asList("money12"));
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");


        if (pocket.contains("money1")) {
            System.out.println("현금으로 택시를 타고 간다.");
        } else if (hasCard && false) {
            System.out.println("카드로 택시를 타고 간다.");
        } else {
            System.out.println("걸어가라!");
        }

        boolean mon = true;
        if (mon) {
            System.out.println("택시를 타고가라");
        } else {
            System.out.println("걸어가라!");
        }


        int ha = 50;
        if (ha >= 50) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }

        ArrayList<Integer> ho = new ArrayList<>();


        ho.add(1);
        ho.add(2);
        ho.add(4);

        if (ho.contains(4)) {
            System.out.println("NUmber");
        } else if (ho.contains(3)) {
            System.out.println("Number3");

        } else {
            System.out.println("Number2");
        }


    }

}



