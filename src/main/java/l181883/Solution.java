package l181883;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = Arrays.copyOf(arr, arr.length);
        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                answer[j]++;
            }
        }
        return answer;
    }

    static void main() {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1}, {1, 2}, {2, 3}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}