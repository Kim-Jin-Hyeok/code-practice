package practice.dataStructure.sort;

import java.util.Arrays;

/**
 * H-INDEX
 * https://school.programmers.co.kr/learn/courses/30/lessons/42747?language=java
 */
public class solution002 {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};

        System.out.println(solution(citations));
    }

    public static int solution(int[] citations) {
        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            int h = citations.length - i;

            if(citations[i] >= h) {
                return h;
            }
        }

        return 0;
    }
}
