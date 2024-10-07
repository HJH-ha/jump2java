package 연습_매소드;

public class Gasoline {
    public static void main(String[] args) {
        double gasoline = 8.86;
        double distance = 182.736;
        double result =carEffiency(gasoline, distance);
        System.out.printf("연비 : %.2f km/L" , result);
    }

    private static double carEffiency(double gasoline, double distance) {
        return distance/gasoline;
    }
}
