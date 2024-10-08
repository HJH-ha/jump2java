package 연습_클래스;

public class MinerTest {
    public static void main(String[] args) {
        //객체 생성
        Miner malon = new Miner("말런");
        Miner gloria = new Miner("글로리아");

        //코인채굴
        malon.mine();
        malon.mine();
        malon.mine();

        gloria.mine();
        gloria.mine();

        //객체 정보 출력
        System.out.println(malon);
        System.out.println(gloria);
    }
}


class Miner{
    //필드(인스턴스 변수)
    String name;
    int coins;

    //생성자
    public Miner(String str) {
        name = str;
        coins = 0;
    }

    //메소드(인스턴스 메소드) -객책의 정보를 문자열로 반환
    @Override
    public String toString() {
        return String.format("Miner { name: %s, coins: %d }", name, coins);
    }

    //메소드 (인스턴스 메소드) - 코인채굴
    public void mine(){
        coins += 1;
    }
}