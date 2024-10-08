package 연습_클래스;


public class ChinesRestaurant {
    public static void main(String[] args) {
        Menu jjajang = new Menu("짜장", 4900);
        Menu jjambbong = new Menu("짬뽕", 5900);
        Menu tangsook = new Menu("탕수육", 13900);

        //메뉴를 조합 주문 생성
        Menu[] menuArr = { jjajang, jjambbong, tangsook };
        Order order = new Order(123, menuArr);

        //주문 결과
        System.out.printf("주문 합계: %d원\n", order.totalPrice());

    }
}

class Order{
    //필드
    int orderNum;
    Menu[] menus;

    //생성자
    public Order(int i, Menu[] arr) {
        orderNum = i;
        menus = arr;
    }
    //메소드
    public int totalPrice() {
        int totalPrice = 0;
        for (Menu menu : menus) {
            totalPrice +=menu.price;
        }
        return totalPrice;
    }
}
class Menu{
    //필드
    String name;
    int price;

    //생성자
    public Menu(String str, int i) {
        name = str;
        price = i;
    }
}