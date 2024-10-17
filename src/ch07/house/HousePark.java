package ch07.house;

public class HousePark {
    /* protected 는 같은 패키지 + 이클래스를 상속받은 클래스*/
    protected String lastname = "park";
    public static void main(String[] args) {
        //같은 패키지에서는 import 하지않음(자동으로 됨)
        //같은 패키지에 동일한 클래스가 있으면 안됨
        HouseKim kim = new HouseKim();
        System.out.println(kim.lastname);
    }
}
