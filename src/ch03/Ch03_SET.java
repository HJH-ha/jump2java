package ch03;

import java.util.Arrays;
import java.util.HashSet;

public class Ch03_SET {
    public static void main(String[] args) {
        // set 은 리스트중에 중복되지 않음, 순서가 없다.
        HashSet<String> set = new HashSet<>(Arrays.asList("h","e","l","l","o"));
        System.out.println(set);

        // 집합으로 '교집합' 구하기
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4,5,6,7,8,9));

        HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 교집합생성
        // intersection 요소와 (s2) 요소중 같은 요소만 남음 retainAll 메소드
        intersection.retainAll(s2); // 교집합 수행 (s2와 같은 요소만 남음)
        System.out.println(intersection);

        // 합집합
        HashSet<Integer> union = new HashSet<>(s1); // s1과 같음
        union.addAll(s2); // s2를 더하고 중복은 제거
        System.out.println(union); // 중복되는 요소는 자동 삭제되고 한번만 출력 , 합집합 출력

        // 차집합 구하기
        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2); // s1 에서 s2를 삭제
        System.out.println(substract);

        // 메소드 add, addAll, remove
        HashSet<String> s3 = new HashSet<>();
        s3.add("Jump");
        s3.add("To");
        s3.add("Java");
        System.out.println(s3);

        HashSet<String> s4 = new HashSet<>();
        s4.addAll(s3);
        s4.addAll(Arrays.asList(" And ", " Home "));
        System.out.println(s4);

        s4.remove(" Home ");
        System.out.println(s4);
    }
}
