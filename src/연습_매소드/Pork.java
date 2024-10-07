package 연습_매소드;

public class Pork {
    public static void main(String[] args) {
        int n = 3;
        double result = porkcal(n);
        System.out.printf("삼겹살 %d인분: %.2f kcal" , n, result);
    }

    private static double porkcal(int n) {
        return n*180*5.179;
    }
}
