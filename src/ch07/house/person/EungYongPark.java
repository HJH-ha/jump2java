package ch07.house.person;

import ch07.house.HouseKim;
import ch07.house.HousePark;

public class EungYongPark extends HousePark {
    public static void main(String[] args) {
        HousePark hp = new HousePark();
        EungYongPark e = new EungYongPark();
        //다른 패키지에서 접근안되지만 상속하면 사용가능
        System.out.println(e.lastname);
    }
}
