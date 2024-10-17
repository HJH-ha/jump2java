package ch07_4;

import java.io.*;

public class Ch07_예외처리 {
    //throws IOException << 찾을수 없을때 읽을수 없을때 다 예외처리 (파일과 관련된)
    public static void main(String[] args)  {
        // FileReader 예외처리 해줘야함. 파일 찾기 예외처리
        // 미리 처리해야하는 예외, 처리 안하면 실행안됨.
        BufferedReader br = null;
        try {
            br = new BufferedReader
                    //절대주소 c://..... , 상대주소: 이 프로젝트폴더 안에 있는 파일 이름 입력
                    //                    ex)C:\Users\it\IdeaProjects\jump2java
                    (new FileReader("없는파일.txt"));
            // 파일을 읽을 수 없을때 예외처리함. readline 을 예외처리
            br.readLine();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일 못찾음 예외발생 " + e.getMessage());
        } catch (IOException e) {
            System.out.println("파일 읽기 또는 닫기 예외발생 " + e.getMessage());
        }


        //산술에 문제가 생겼을 때, 0으로 나누면 안됨.
        // 실행중에 예외발생. 미리 알려주지않음. 일단 실행은 됨.
        // ctrl+alt+t << try/catch 문으로 감싸줌
        try {
            int c = 4 / 0; // 예외발생 코드는 try문에 입력.
            System.out.println(c);
        } catch (ArithmeticException e) { // exception 모든 예외
            System.out.println("수학예외 0으로 나누는 에러 발생! " + e.getMessage());
        } finally {
            System.out.println("에러 발생하든 안하든 실행됨!");
        }

        // 오류(예외)가 발생하면 그 지점에서 프로그램이 끊킴.

        //배열의 인덱스 번호가 틀림. 실행중에 예외발생
        // try catch
        try {
            int[] a = {1, 2, 3};
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 범위를 넘기는 예외! " + e.getMessage());
            //e.getMessage() << 오류이유를 나타내줌.
        } finally {
            System.out.println("에러발생 하든 안하든 실행됨!");
        }
        System.out.println("프로그램 종료!");
    }
}

