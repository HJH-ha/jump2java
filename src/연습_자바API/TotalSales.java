package 연습_자바API;


import java.util.ArrayList;

public class TotalSales {
    public static void main(String[] args) {
        ArrayList<Menuu> items = new ArrayList<Menuu>();

        items.add(new Menuu("김밥", 2000, 57));
        items.add(new Menuu("돈까스", 6000, 29));
        items.add(new Menuu("냉면", 5000, 34));

        Store store = new Store();
        for (Menuu item : items) {
            store.add(item);
        }

        System.out.printf("총 매출: %d원", store.totalSales());

    }
}

class Store{
    private ArrayList<Menuu> list;

    public Store(){
        this.list = new ArrayList<Menuu>();
    }

    public void add(Menuu menuu){
        list.add(menuu);
    }

    public int totalSales(){
        int total = 0;
        for (Menuu menuu : list) {
            total += menuu.getPrice() * menuu.getCount();
        }
        return total;
    }
}

class Menuu{
    private String name;
    private int price;
    private int count;

    public Menuu(String name, int price, int count){
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }
}
