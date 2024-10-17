package ch07_4;

//커스텀(만든) 예외 FoolException , 실핼중 발생하는 예외
class FoolException extends RuntimeException {
}
// 일반 예외를 상속한 FoolException2
class FoolException2 extends Exception {
}

class Sample {
    public void sayNick(String nick) {
        try {
            if ("바보".equals(nick)) {
                throw new FoolException(); // 예외 객체생성
            }
            //문제가 없을경우에만 별명을 출력한다. try 문에 입력.
            System.out.println("당신의 별명은 " + nick + "입니다.");
        } catch (FoolException e) {
            System.err.println("FoolException 발생했습니다.");
        }
    }
}

class Sample2 {
    public void sayNick(String nick) throws FoolException2 {
        if ("바보".equals(nick)) {
            throw new FoolException2(); // 예외 객체생성
        }
        //문제가 없을경우에만 별명을 출력한다. try 문에 입력.
        System.out.println("당신의 별명은 " + nick + "입니다.");
    }
}


public class Ch07_런타임예외 {
    public static void main(String[] args) {
        //런타임 예외 : 실행중 발생하는 예외
        Sample s = new Sample();
        s.sayNick("바보");
        s.sayNick("야호");

        // throw  예외처리 미룸
        Sample2 s2 = new Sample2();
        try {
            s2.sayNick("바보");
            s2.sayNick("야호"); // 예외 발생
        } catch (FoolException2 e) {
            System.out.println("FoolException2 발생 " + e.toString());
        }

    }
}
