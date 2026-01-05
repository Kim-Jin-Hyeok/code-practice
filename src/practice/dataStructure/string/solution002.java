package practice.dataStructure.string;

/**
 * 이상한 문자 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 */
public class solution002 {
    public static void main(String[] args) {
        String string = "try hello world";

        System.out.println(solution(string));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for(char ch : s.toCharArray()) {
            if (ch == ' ') {
                index = 0;
                sb.append(ch);
                continue;
            }

            if (index % 2 == 0){
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(Character.toLowerCase(ch));
            }
            index++;
        }

        return sb.toString();
    }
}
