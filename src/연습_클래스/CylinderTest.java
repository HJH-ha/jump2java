package 연습_클래스;

public class CylinderTest {
    public static void main(String[] args) {
        //객체 생성
        Cylinder cyl = new Cylinder();
        // 속성 값 입력
        cyl.r = 4;
        cyl.h = 5;
        //출력
        System.out.printf("원기둥의 부피: %.2f\n" , cyl.a());
        System.out.printf("원기둥의 겉넓이: %.2f\n" , cyl.b());

    }
}


class Cylinder {
    double r; // 반지름
    double h; // 높이

    double a(){ // 부피
        return r*r*Math.PI*h;
    }
    double b(){ // 겉넓이
        return (2*r*r*Math.PI) + 2*Math.PI*h*r;
    }
}