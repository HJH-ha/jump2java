package ch06;

import java.io.*;

public class Ch06_파일입출력 {
    public static void main(String[] args) throws IOException {
        /* 파일 쓰기 */
//        FileOutputStream output = new FileOutputStream("c:/Temp/out.txt");
//        for (int i = 1; i < 11; i++) {
//            String data = i+"번째 줄입니다. \r\n"; // \r\n 커서를 앞으로한줄 뛰움.
//            output.write(data.getBytes()); // 바이트로 쓰기
//        }
//        output.close();

        /* FileWriter : 문자열을 바로 쓸수있음, append 값이 true 일때 추가로 쓰기 */
//        FileWriter fw = new FileWriter("c:/Temp/out.txt", true);
//        for (int i = 1; i < 11 ; i++) {
//            String data = i+"번째 줄입니다. \r\n";
//            fw.write(data); //  문자열을 바로 입력함
//        }
//        fw.close();

        /* PrintWriter 는 println 매서드 사용 */
//        PrintWriter pw =
//                new PrintWriter(new FileWriter("c:/Temp/out1.txt", true));
//        for (int i = 1; i < 11; i++) {
//            String data = i+"번째 줄입니다. ";
//            pw.println(data); //문자열을 바로 입력함
//        }
//        pw.close();

        /* 파일 읽기 : 특정 주소의 파일을 읽어옴 */
//        FileInputStream input = new FileInputStream("c:/Temp/out.txt");
//        byte[] buf = new byte[1024];  // 1024바이트 배열
//        input.read(buf);
//        String s = new String(buf);
//        System.out.println(s);
//        input.close();

        /* 문자열 단위로 읽는 방법 : 파일 리더로 문자하나씩 읽고 버퍼드리더로 한꺼번에 읽음 */
        BufferedReader br = new BufferedReader(new FileReader("c:/Temp/abc.txt"));
        while (true) {
            String line = br.readLine(); // 한줄씩 읽음.
            if (line == null) break; // 더 이상 읽을 줄(라인)이 없을때 반복문 빠져나감.
            System.out.println(line);
        }
        br.close();


    }
}
