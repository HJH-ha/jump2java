package ch03;

public class Ch03_StringBuffer {
    public static void main(String[] args) {
        //문자열을 추가하거나 변경할때 사용하는 자료형
        StringBuffer sb = new StringBuffer(); // StringBuffer 객체 sb 생성
        System.out.println(sb);
        // int char boolean 기초형,소문자 시작 ㅇㅇ, String 기초형 x 대문자로 시작 글자가
        // 버퍼 객체는 append 메소드를 사용해서 문자열을 추가한다.
        sb.append("Hello");
        sb.append(" ");
        sb.append("점프 to 자바");

        System.out.println(sb);



        //sb 대신 문자열로 해보자. ("" 문자열을(리터널)을 만들면서 수정할 수 없다.)
        String result = "";
        result += "헬로우"; // result = result + "헬로우";
        result += " ";
        result += "점프 to 자바";
        System.out.println(result);

        // insert 특정 위치에 문자열을 삽입
        StringBuffer sb2 = new StringBuffer();
        sb2.append("jump to java");
        sb2.insert(0,"hello "); // insert(어디에 넣을건지, 뭐라고 넣을건지) 0번째 인덱스에 추가(수정)
        System.out.println(sb2);
        // substring 문자열 잘라내기
        StringBuffer sb3 = new StringBuffer();
        sb3.append("hello jump to java");
        System.out.println(sb3.substring(0,4)); // 시작번호, 끝번호 -1까지 잘라냄.

    }
}
