package ch05_7;


//클래스 처럼 만듬.
interface Predator{
    // 추상메서드 (구현이 되지 않은 매서드) 인터페이스에서는 항상 추상메서드 사용
    // 메서드로 {몸통} 없음 < 실제 실행되는 코드가 없음{} << 이게 없음
    // 추상 메서드는 항상 public 접근 제한자가
    // 리턴타입 이름 입력변수 < 이3개는 꼭 입력
    String getFood();
    //디폴트 메서드(실제 구현된 메서드 앞에 default 표시)
    default void printFood(){
        System.out.printf("내 사료는 %s이다.\n", getFood());
    }
}

interface Barkable{
    void bark();
}

class Animal {
    String name;
    void setName(String name){
        this.name = name;
    }

    //다형성 : 하나의 객체가 어려 자료형 타입 Tiger 와 Lion 은 Animal 타입 선언.
    //호랑이와 사자타입의 메소드를 따로 만들 필요가 없음.
//    void barkAnimal(Animal animal){
//        // instanceof = 실제객체가 클래스타입과 같으면 참 아니면 거짓.
//        if(animal instanceof Tiger){
//            System.out.println("어흥~~");
//        } else if (animal instanceof Lion) {
//            System.out.println("으르렁~~");
//        }
//    }
    void barkAnimal(Barkable animal){
        animal.bark();
    }
}
// implements << 인터페이스 구현하는 용어
// 에러가 당연히 생김. 클릭해서 만들면됨.
// 인터페이스는 상속(1개만 가능)과 달리 여러개 가능 (구분을 , 로 하면됨)
class Tiger extends Animal implements Predator , Barkable{

    @Override
    public String getFood() {
        return "사과";
    }

    @Override
    public void bark() {
        System.out.println("호랑이 어흥~~~~");
    }

//    String name;
//    void setName(String name){
//        this.name = name;
//    }
}
class Lion extends Animal implements Predator , Barkable{
    @Override
    public String getFood() {
        return "바나나";
    }

    @Override
    public void bark() {
        System.out.println("사자 으르렁~~~~");
    }
//    String name;
//    void setName(String name){
//        this.name = name;
//    }
}

class Zookeeper {
                // 인터페이스 Predator 를 구현한 객체를 입력가능
    // Predator = 호랑이, 사자 상속처럼 비슷하게 사용
    public void feed(Predator p){
        System.out.println("먹이주기: " + p.getFood());
    }
}

public class Ch05_인터페이스 {
    public static void main(String[] args) {
        Tiger 호랑이 = new Tiger();
        Lion 사자 = new Lion();
        Zookeeper z = new Zookeeper();
        z.feed(호랑이); // 인터페이스 타입 객체 입력(구현한 클랙스 객체)
        z.feed(사자);
        // Predator p = new Predator() {}; 인터페이스를 바로 객체로 만들지 못함. 추상메서드이기 때문에. 구현한 객체 필요
        Predator p1 = new Tiger();
        p1.printFood(); // 디폴트 매서드
        Predator p2 = new Lion();
        p2.printFood(); // 디폴트 메서드

        Animal animal = new Animal();
        animal.barkAnimal(호랑이);
        animal.barkAnimal(사자);
    }
}
