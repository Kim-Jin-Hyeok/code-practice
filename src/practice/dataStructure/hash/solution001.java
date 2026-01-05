package practice.dataStructure.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 완주하지 못한 선수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42576
 */
public class solution001 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for(String name : participant) {
           map.put(name, map.getOrDefault(name, 0) + 1);
        }

        for(String name : completion) {
            map.put(name, map.get(name) - 1);

            if (map.get(name) == 0) {
                map.remove(name);
            }
        }

        return map.keySet().iterator().next();
    }
}
