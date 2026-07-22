package l120913;

import java.util.Arrays;

class Solution {
    public static String[] solution(String my_str, int n) {
        String[] answer = {};
        int len = my_str.length();
        StringBuilder sb = new StringBuilder(my_str);
        int number = (len - 1) / n;
        for (int i = number; i > 0; i--) {
            sb.insert(i * n, " ");
        }
        answer = sb.toString().split(" ");
        return answer;
    }

    static void main() {
        String ex1 = "abc1Addfggg4556b";
        String ex2 = "abcdef123";

        System.out.println(Arrays.toString(solution(ex1, 6)));
        System.out.println(Arrays.toString(solution(ex2, 3)));
    }
}

// 12345 12345 1234
// 12345 12345 1