package 연습_클래스;

public class SquareTest {
    public static void main(String[] args) {
        // 객체생성
        Square s = new Square();
        // 필드 초기화(값 변경)
        s.length = 4; // 정사각형 가로세로 길이는 4로 설정
        // 결과 출력
        System.out.printf("한변의 길이가 %d인 정사각형의 넓이: %d", s.length, s.area());
    }
}

/*정사각형 클래스 구현*/
class Square {
    int length; // 길이 2개 사용위치
    //넓이 변환
    int area(){
        return length*length;
    }
}
