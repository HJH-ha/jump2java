package 연습_자바API;



import java.util.ArrayList;

public class TotalPrice {
    public static void main(String[] args) {
        ArrayList<Itemm> items = new ArrayList<Itemm>();

        items.add(new Itemm("스트라이프 셔츠", 49900));
        items.add(new Itemm("슬림 면바지", 58900));
        items.add(new Itemm("스니커즈", 46900));

        Cart myCart = new Cart();
        for (Itemm item : items) {
            myCart.add(item);
        }

        System.out.printf("총합: %d원", myCart.totalPrice());


    }
}

class Cart{
    private ArrayList<Itemm> list;

    public Cart() {
        this.list = new ArrayList<Itemm>();
    }

    public void add(Itemm item){
        list.add(item);
    }

    public int totalPrice(){
        int sum = 0;
        for (Itemm itemm : list) {
            sum += itemm.getPrice();
        }
        return sum;
    }
}

class Itemm{
    private String name;
    private int price;

    public Itemm(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}