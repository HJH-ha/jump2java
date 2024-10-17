package ch06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ch06_콘솔입출력 {
    public static void main(String[] args) throws IOException {
//       InputStream in =System.in; //콘솔 키보드 입력받기
//        int a;
//        a = in.read(); // 예외처리를 해줘야함. 입출력에서는
//        char b = (char) a;
//
//        System.out.println("입력된 값은: "+ a);
//        System.out.println("문자는 : " + b);
//
//        int a;
//        int b;
//        int c;
//
//        a = in.read();
//        b = in.read();
//        c = in.read(); // 바이트값을 읽어서(입력받아) 아스키코드 값으로 출력
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

//        byte[] a = new byte[3]; // 바이트 배열 [3]바이트짜리
//        in.read(a); // 입력 byte 배열의 객수만큼 읽어서 배열에 입력됨.
//
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//        System.out.println(a[2]);
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]); // for i 반복문
//        }
//        for (byte b : a) {
//            System.out.println(b); // for each 반복문
//        }

        /* InputStreamReader 입력 문자를 그대로 받음 */
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        char[] a = new char[3];
//        reader.read(a);
//
//        System.out.println(a);

        /* BufferedRead :  문자열 읽기 */
//        InputStream in = System.in;  // 무조건 있어야함. 입력을 받을때는
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//
//        String line = br.readLine();
//        System.out.println(line);

        /* Scanner : 다양한 값을 읽을 수 있음 */
        Scanner sc = new Scanner(System.in); // System.in
        //System.out.println(sc.next());
        //int x = sc.nextInt(); // 무조건 숫자를 입력해야함, 문자는 에러남.
        //sc.nextDouble();
        //double x = sc.nextDouble();
        String s = sc.nextLine(); // enter 키값 이전까지 문자열로 끊어서
        System.out.println(s);
        sc.close();  // 더이상 사용 안할때 스캐너를 종료함.
    }
}
