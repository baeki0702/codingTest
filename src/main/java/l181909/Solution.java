package l181909;

import java.util.Arrays;

class Solution {
    public static String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }

    static void main() {
        String ex1 = "banana";
        System.out.println(Arrays.toString(solution(ex1)));
    }
}