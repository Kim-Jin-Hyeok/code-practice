package practice.dataStructure.sort;

import java.util.Arrays;

/**
 * 가장 큰 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/42746?language=java
 */
public class solution003 {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};

        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers) {
        String[] array = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            array[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(array, (a, b) -> (b + a).compareTo(a + b));

        /*
        [0, 0, 0]의 엣지 케이스 찾아야함.
         */
        if (array[0].equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for(String s : array) {
            sb.append(s);
        }

        return sb.toString();
    }
}
