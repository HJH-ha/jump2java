package 연습_상속인터페이스;

public class CarTest {
    public static void main(String[] args) {
        Car c = new Car("티코");
        Truck t = new Truck("봉고", 1.5);

        System.out.println(c.toString());
        System.out.println(t.toString());

    }
}

class Car{
    protected String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("[자동차] { name: %s }\n", name);
    }
}

class Truck extends Car{
    protected double ton;

    public Truck(String name, double ton) {
        super(name);
        this.ton = ton;
    }

    @Override
    public String toString() {
        return String.format("[자동차] { name: %s, ton: %s }\n", name, ton);
    }

}