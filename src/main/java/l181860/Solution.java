package l181860;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                sb.repeat(String.valueOf(arr[i]), Math.max(0, arr[i] * 2));
            } else {
                sb.delete(sb.length() - arr[i], sb.length());
            }
        }
        answer = sb.chars()
                .map(c -> c - '0')
                .toArray();
        return answer;
    }

    static void main() {
        int[] arr = {3, 2, 4, 1, 3};
        boolean[] flag = {true, false, true, false, false};
        System.out.println(Arrays.toString(solution(arr, flag)));
    }
}