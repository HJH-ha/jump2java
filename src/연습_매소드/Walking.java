package 연습_매소드;

public class Walking {
    public static void main(String[] args) {
        // 칼로리 계산을 위해 메소드를 호출하시오
        double result = calculateCalory(5000);
        //결과를 출력
        System.out.printf("소모 칼로리 : %.1f kcal", result);
    }

    //칼로리 게산 매소드를 정의하시오.
    static double calculateCalory(int walk){
        return 0.02 * walk; // 걸음당 0.02칼로리
    }

}
