package ch07;


class Sample {
    private String secret;

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}

public class Ch07_접근제어자 {
    // 클래스에 있는 변수,매서드는 객체를 만들어야 사용가능
    String password;

    public static void main(String[] args) {
        /* 접근 제어자 : 변수나 매서드에 사용권한을 설정 */
        /* private < default < protected < public */
        Ch07_접근제어자 ch = new Ch07_접근제어자();
        ch.password = "1234";

        /* private 는 같은 클래스에서만 사용가능 */
        Sample sample = new Sample();
        //sample.secret = "비밀";
        sample.setSecret("비밀");
        String s = sample.getSecret();
        System.out.println(s);
    }
}
