package l120813;

import java.util.Arrays;

class Solution {
    public static int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 1 + i * 2;
        }
        return answer;
    }

    static void main() {
        System.out.println(Arrays.toString(solution(10)));
        System.out.println(Arrays.toString(solution(15)));

    }
}