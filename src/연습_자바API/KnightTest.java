package 연습_자바API;

public class KnightTest {
    public static void main(String[] args) {
        // 객체 생성
        Knight knight = new Knight("돈키호테", 30);
        //정보 출력
        System.out.println("[객체 생성]");
        System.out.printf("\t%s\n", knight.toString());
        //체력 증가 : 기존 체력 + 30
        knight.setHp(knight.getHp()+30);
        //결과 출력
        System.out.println("[체력 증가+30]");
        System.out.printf("\t%s\n", knight.toString());
    }
}

class Knight {
    //필드는 private 사용 (외부 접근금지)
    private String name;
    private int hp;

    public Knight(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    //게터, 세터 메소드
    // 겟메소드 : 저장된값을 가져오는것(리턴)

    public int getHp() {
        return hp;
    }
    //
    // 셋메소드는 값을 입력함
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                '}';
    }
}