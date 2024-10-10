package 연습_자바API;

import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        LottoMachine machine = new LottoMachine();

        int[] numbers = machine.getLottoNumbers();

        System.out.print("생성 번호: ");
        for (int i : numbers) {
            System.out.printf("%d", i);
        }
    }
}

class LottoMachine {
    private int[] LottoNumbers;

    public LottoMachine() {
        LottoNumbers = generator.nextInt();
        /*2. 메소드를 이용해서 로또번호 생성*/
        LottoNumbers = generate();
    }

    //메소드
    public int[] generate() {
        int[] pickedNumbers = new int[6];
        Random rand = new Random();

        /*임의의 숫자 6개를 만들어배열 pickedNumbers에 입력한다*/

        return pickedNumbers;
    }
    /*3. 생성된 로또번호를 가져오는 get 메소드를 만드세요.*/


}