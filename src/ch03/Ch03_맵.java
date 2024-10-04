package ch03;

import java.util.HashMap;

public class Ch03_맵 {
    public static void main(String[] args) {
        //HashMap  은 키값, 벨류값 두개! 입력
        HashMap<String, String> map = new HashMap<>();
        //맵은 추가를 put 으로 함
        map.put("people", "사람");
        map.put("baseball", "야구");
        // 자료를 가져올때 get (키값)
        System.out.println(map.get("people"));

        // containsKey 맵에 해당 key가 있는지 참 거짓으로 리턴
        System.out.println(map.containsKey("baseball"));

        // 맵에서 삭제는 remove 키값 , 리스트에서는 인덱스번호 또는 그 값
        // 삭제는 삭제를하고 그 삭제된값이 반환이대서 보임
        // 그 다음부터는 null이라고 반환됨. 삭제됨
        System.out.println(map.remove("people"));
        System.out.println(map.get("people"));

        // size : 갯수
        System.out.println(map.size());

        // keySet 맵의 모든 'key 값'를 리턴
        map.put("apple","사과");
        System.out.println(map.keySet());
        // 맵의 'value 값'들만 출력 values
        System.out.println(map.values());



    }
}
