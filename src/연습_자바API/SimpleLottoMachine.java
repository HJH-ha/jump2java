package 연습_자바API;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SimpleLottoMachine {
    public static void main(String[] args) {
        // 45개의 공을 만듬
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 45 ; i++) {
            numbers.add(i); // 1 ~ 45
        }
        //섞는다.
        Collections.shuffle(numbers);
        //뽑는다.
        int[] picked = new int[6];
        for (int i = 0; i < 6; i++) {// numbers의 앞 6개 숫자를 가져옴.
            picked[i] = numbers.get(i);
        }
        //결과 출력
        System.out.printf("자동 생성 번호: %s", Arrays.toString(picked));
    }
}

