package 연습_상속인터페이스;

public class CurrencyTest {
    public static void main(String[] args) {
      KRW krw = new KRW("KRW", 1500, "원");
      USD usd = new USD("USD", 100.50, "달러");
      EUR eur = new EUR("EUR", 260.87, "유로");
      JPY jpy = new JPY("JPY", 1400, "엔");

        Currency[] currencies = {krw, usd, eur, jpy};

        for (Currency currency : currencies) {
            System.out.println(currency.toString());

        }

    }
}

class Currency {
    private String name;
    private double amount;   // 수량
    private String notation;  // 표기법

    public Currency(String name, double amount, String notation) {
        this.name = name;
        this.amount = amount;
        this.notation = notation;
    }

    @Override
    public String toString() {
        return name + ": " + amount  + notation;
    }
}

class KRW extends Currency {


    public KRW(String name, double amount, String notation) {
        super(name, amount, notation);
    }
}

class USD extends Currency {


    public USD(String name, double amount, String notation) {
        super(name, amount, notation);
    }
}

class EUR extends Currency {

    public EUR(String name, double amount, String notation) {
        super(name, amount, notation);
    }
}

class JPY extends Currency {

    public JPY(String name, double amount, String notation) {
        super(name, amount, notation);
    }
}