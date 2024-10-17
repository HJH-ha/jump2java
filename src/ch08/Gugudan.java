package ch08;

public class Gugudan {

    static int[] gugu(int dan){
        int[] result = new int[9];
        for (int i = 0; i < result.length; i++) {
            result[i] = dan * (i + 1);

        }
//        result[0] = dan * 1;
//        result[1] = dan * 2;
//        result[2] = dan * 3;
//        result[3] = dan * 4;
//        result[4] = dan * 5;
//        result[5] = dan * 6;
//        result[6] = dan * 7;
//        result[7] = dan * 8;
//        result[8] = dan * 9;
        return result;
    }
    public static void main(String[] args) {
        int[] result = gugu(3);
        for (int i : result) {
            System.out.println(i);

        }
    }

}
