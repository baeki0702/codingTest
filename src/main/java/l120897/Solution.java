package l120897;

import java.util.Arrays;

class Solution {
    public static int[] solution(int n) {
        int[] answer = new int[n];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i == 0) {
                answer[index++] = i;
            }
        }
        int[] ranswer = new int[index];
        for (int i=0; i < ranswer.length; i++) {
            ranswer[i] = answer[i];
        }
        return ranswer;
    }

    static void main() {
        System.out.println(Arrays.toString(solution(24)));
        System.out.println(Arrays.toString(solution(29)));
    }
}