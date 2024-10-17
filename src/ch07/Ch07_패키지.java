package ch07;

import ch07.house.*;
import java.util.*; // 이패키지에 있는 클래스들 전체 임포트함. * < 전체, 모두

public class Ch07_패키지 {
    public static void main(String[] args) {
        String str = "미리 임포트 된 패키지 java.long";
        ArrayList<Integer> list = new ArrayList<>();
        Double pi = Math.PI;
        Random r = new Random();
        HashMap<Integer, Integer> map = new HashMap<>();

        HouseKim kim = new HouseKim();
        HousePark park = new HousePark();
    }
}
