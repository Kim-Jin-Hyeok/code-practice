package practice.dataStructure.sort;

import java.util.Arrays;

/**
 * 전화번호 목록
 * https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java
 */
public class solution001 {
    public static void main(String[] args) {
        String[] phoneBook = {"119", "97674223", "1195524421"};

        System.out.println(solution(phoneBook));
    }

    public static boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook);

        for(int i = 1; i < phoneBook.length; i++) {
            if(phoneBook[i].startsWith(phoneBook[i-1])) return false;
        }

        return true;
    }
}
