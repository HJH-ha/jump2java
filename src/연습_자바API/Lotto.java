package 연습_자바API;

import java.util.HashSet;
import java.util.Random;

public class Lotto {
    public static void main(String[] args) {

        LottoMachine machine = new LottoMachine();

        int[] numbers = machine.getLottoNumbers();

        System.out.print("생성 번호: ");
        for (int i : numbers) {
            System.out.printf("%d, ", i);
        }
    }
}

class LottoMachine {
    private int[] lottoNumbers;

    public LottoMachine() {
        /*2. 메소드를 이용해서 로또번호 생성*/
        lottoNumbers = generate();
    }

    //메소드
    public int[] generate() {
        Random rand = new Random();
        HashSet<Integer> pickedNumbersSet = new HashSet<>();
        while (pickedNumbersSet.size() < 6) {
            int number = rand.nextInt(45) + 1;
            pickedNumbersSet.add(number);
        }
        int[] pickedNumbers = new int[6];
        int i = 0;
        for (int number : pickedNumbersSet) {
            pickedNumbers[i++] = number;
        }
        return pickedNumbers;
    }

    /*3. 생성된 로또번호를 가져오는 get 메소드를 만드세요.*/
    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

}
