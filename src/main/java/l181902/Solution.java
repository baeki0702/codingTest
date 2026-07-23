package l181902;

import java.util.Arrays;

class Solution {
    public static int[] solution(String my_string) {
        int[] answer = new int[52];

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.charAt(i) >= 'A' && my_string.charAt(i) <= 'Z') {
                answer[my_string.charAt(i) - 'A']++;
            } else {
                answer[26 + my_string.charAt(i) - 'a']++;
            }
        }
        return answer;
    }

    static void main() {
        String ex1 = "Programmers";
        System.out.println(Arrays.toString(solution(ex1)));

    }
}