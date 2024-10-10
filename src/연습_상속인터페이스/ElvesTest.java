package 연습_상속인터페이스;


public class ElvesTest {
    public static void main(String[] args) {
        Elf elf = new Elf("티란데", 100);
        HighElf high = new HighElf("말퓨리온", 160, 100);
        ElfLord lord = new ElfLord("마이에브", 230, 140, 100);
        //객체 배열에 넣기
        Elf[] elves = {elf, high, lord};
        //모든 객체 정보 출력
        for (int i = 0; i < elves.length; i++) {
            System.out.println(elves[i].toString());
        }
        //forEach 문 단축어 = iter (index 번호는 없지만 배열에 있는걸 한번씩 다 바꿔줌)
        for (Elf e : elves) {
            System.out.println(e.toString());

        }

    }
}

class Elf {
    String name;
    int hp;

    //생성자 alt+insert
    public Elf(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    @Override //toString 메서드는 객체의 정보를 보여줌, 메서드 생략
    public String toString() {
        return String.format("[엘프] Name: %s, HP: %d", name, hp);
    }
}

class HighElf extends Elf {
    int mp; // mp 추가

    //생성자 = 상속시 부모객체를 먼저 만듬.
    public HighElf(String name, int hp, int mp) {
        super(name, hp); // super 는 부모 클래스의 생성자
        this.mp = mp;
    }

    //alt + insert키 toString 선택
    @Override
    public String toString() {
        return String.format
                ("[하이엘프] Name: %s, HP: %d, MP: %d", name, hp, mp);
    }
}

class ElfLord extends HighElf {
    int shield; // shield 추가

    public ElfLord(String name, int hp, int mp, int shield) {
        super(name, hp, mp);
        this.shield = shield;
    }

    public String toString() {
        return String.format
                ("[엘프로드] Name: %s, HP: %d, MP: %d, SHIELD: %d", name, hp, mp, shield);
    }
}
