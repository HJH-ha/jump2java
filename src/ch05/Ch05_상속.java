package ch05;

//부모 클래스
class Anima {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

//자식 클래스 'extends' + 부모 클래스 이름
// Anima  클래스를 상속
class Dog extends Anima {
    void sleep() {
        System.out.println(this.name + "zzz"); // this 는 이 클래스(본인클래스) 안에 있는 이름
    }

}

class HouseDog extends Dog {
    @Override
    void sleep() {
        System.out.println(this.name + "zzz in Home");
    }
    //매소드는 이름외에 리턴타입과 입력변수가 똑같지 않으면 새로운 매소드
    void sleep(int hours){
        System.out.println(this.name + "zzz in Home "+ hours + "시간");
    }
}


public class Ch05_상속 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("퍼피");
        System.out.println(d.name);
        d.sleep();

        // (선언)Anima a = new Dog(); // 상속관계일때는 선언을 부모 클래스로 해도 아무 상관없음. 가능함.
        // (선언)Dog c = new Anima(); -> 자식타입으로 선언하고 부모객체를 불러오는건 안됨. 위에랑 반대로는 사용불가능.
        // 동물(부모) - 자식은 여라가지 동물 (고양이 개 돼지 소 등등)
        // 형제 관계일때는 그냥 서로 무관. 따로 사용


        // 매서드 오버라이딩(method overriding)
        // 부모매서드와 똑같은 이름의 매서드를 새로 만듬
        // 부모 클래스의 매서드를 자식 클래스가 동일한 형태로 또 다시 구현하는 행위(덮어쓰기)
        HouseDog h = new HouseDog();
        h.setName("해피");
        h.sleep();

        // 매서드 오버로딩(method overloading)
        // 이름은 같지만 입력변수가 틀리다.(다른 메소드)
        h.sleep(18);



    }

}
