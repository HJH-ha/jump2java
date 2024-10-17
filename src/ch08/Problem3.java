package ch08;

public class Problem3 {
    static int getDigitCount(int n) {
        String s = ""+n;
        return s.length();
    }
    public static void main(String[] args) {
        System.out.println(getDigitCount(3312));
        System.out.println(getDigitCount(253));
        System.out.println(getDigitCount(333222));
        System.out.println(getDigitCount(78783));

    }
}
