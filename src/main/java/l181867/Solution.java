package l181867;

import java.util.Arrays;

class Solution {
    public static int[] solution(String myString) {
        int[] answer = {};
        String[] tokens = myString.split("x", -1);
        answer = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            answer[i] = tokens[i].length();
        }
        return answer;
    }

    static void main() {
        String ex1 = "oxooxoxxox";
        System.out.println(Arrays.toString(solution(ex1)));
    }
}