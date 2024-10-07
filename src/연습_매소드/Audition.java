package 연습_매소드;

public class Audition {
    public static void main(String[] args) {
        double tomVocal = 8.8;
        double tomDance = 7.6;
        double kateVocal = 9.2;
        double kateDance = 7.8;

        System.out.printf("Tom의 오디션결과: %s\n", test1(tomVocal, tomDance));
        System.out.printf("Kate의 오디션결과: %s\n", test1(kateVocal, kateDance));
    }

    private static String test1(double vocal, double dance) {
        if (70.0 < (vocal * dance)) {
            return "합격";
        }
        else {
            return "불합격";
        }
    }
}
