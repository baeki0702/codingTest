package l120896;

import java.util.Arrays;

class Solution {
    public static String solution(String s) {
        String answer = "";
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);

        String sorted = new String(charArray);

        for (int i = 0; i < sorted.length(); i++) {
            String replace = "" + sorted.charAt(i);
            String s1 = sorted.replaceFirst(replace, "");
            if (!s1.contains(replace)) {
                answer += replace;
            }
        }
        return answer;
    }

    static void main() {
        String ex1 = "abcabcadc";
        System.out.println(solution(ex1));

        String ex2 = "abdc";
        System.out.println(solution(ex2));

        String ex3 = "hello";
        System.out.println(solution(ex3));

    }
}