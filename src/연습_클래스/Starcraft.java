package 연습_클래스;

public class Starcraft {
    public static void main(String[] args) {
        //객체 생성
        Marine marine = new Marine("마린", 80);
        marine.stimpack();
        Medic medic = new Medic("매딕", 60);
        medic.heal(marine);

    }
}

class Marine{
    // 필드
    String name;
    int hp;

    //생성자
    public Marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    //메소드
    public void stimpack(){
        System.out.printf("[%s]의 스팀팩! HP: %d -> ", name, hp);
        hp -=10;
        System.out.printf("%d\n",hp);
    }
}
// 매딕 클래스
class Medic{
    //필드
    String name;
    int hp;

    //생성자
    public Medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    //메소드 마린을 치유하는 힐
    public void heal(Marine marine){
        System.out.printf("[%s]의 치유! %s HP(%d ->", name, marine.name, marine.hp);
        marine.hp += 10;
        System.out.printf(" %d)\n",marine.hp);
    }
}
