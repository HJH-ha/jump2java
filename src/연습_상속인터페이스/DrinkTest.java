package 연습_상속인터페이스;

public class DrinkTest {
    public static void main(String[] args) {
        Juice j = new Juice();
        Coffee c = new Coffee();
        Beer b = new Beer();
        Water w = new Water();
        Tea t = new Tea();

        Drink[] drinks = {j, c, b, w, t};

        for (Drink drink : drinks) {
            drink.ordered();
        }


    }
}

class Drink{
    String name;
    double price;

    public void ordered() {
        System.out.println("주문되었습니다.");
    }
    }



class Juice extends Drink {

//    public void ordered() {
//        System.out.println("주문되었습니다.");
//    }
}

class Coffee extends Drink {

//    public void ordered() {
//        System.out.println("주문되었습니다.");
//    }
}

class Beer extends Drink {

//    public void ordered() {
//        System.out.println("주문되었습니다.");
//    }
}

class Water extends Drink {

//    public void ordered() {
//        System.out.println("주문되었습니다.");
//    }
}

class Tea extends Drink {

//    public void ordered() {
//        System.out.println("주문되었습니다.");
//    }
}

