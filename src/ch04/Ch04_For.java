package ch04;

import java.util.ArrayList;
import java.util.Arrays;

public class Ch04_For {
    public static void main(String[] args) {
        // for 반복문 : ';'을 구분자로함.
        String[] n = {"one", "two", "three"};
//       초기값(int i = 0) ; 조건문(i<n.length); 증가값(i++)
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

//        예시 : 5명이 시험을 봤는데 점수가 60점 넘으면 합격 아니면 불합격
        int[] marks = {90, 25, 67, 45, 88};
        for (int i = 0; i < marks.length; i++) {
//            if (marks[i] >= 60) {
//                System.out.println((i+1) + "번 학생은 합격입니다.");
//            } else {
//                System.out.println((i+1) + "번 학생은 불합격입니다.");
//            }
//        }
//        합격한 학생만 출력하기
            if (marks[i] < 60) {
                continue;
            }
            System.out.println((i + 1) + "번 학생 축하합니다. 합격입니다.");
        }

        // 이중 for 문 : for 문 안에 for 문 을 사용 (for문 2번사용)
        // 구구단

        for (int i = 2;i < 10; i++) {
            //초기값 2
            for (int j = 1; j < 10; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }

        // for each 반복문
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("one", "two", "three"));
        for (String s : numbers){
            System.out.println(s);

        }

    }
}
