package practice.dataStructure.string;

import java.util.Arrays;
import java.util.List;

/**
 * 문자열 내 마음대로 정렬하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12915
 */
public class solution001 {
    public static void main(String[] args) {
        String[] strings = {"sun", "bed", "car"};
        String[] answer = solution(strings, 1);
        List<String> list = Arrays.asList(answer);

        System.out.println(list.toString());
    }

    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (a, b) -> {
            if (a.charAt(n) - b.charAt(n) > 0) {
                return 1;
            } else if (b.charAt(n) - a.charAt(n) > 0) {
                return -1;
            }

            return a.compareTo(b);
            /**
             * 더 나은 코드
             * int cmp = Character.compare(a.charAt(n), b.charAt(n));
             * if (cmp != 0) return cmp;
             * return a.compareTo(b);
             */
        });

        return strings;
    }
}
