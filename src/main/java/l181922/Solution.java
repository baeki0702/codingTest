package l181922;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for (int[] query : queries) {
            for (int j = query[0]; j <= query[1]; j++) {
                if (j % query[2] == 0) {
                    arr[j]++;
                }
            }
        }
        answer = arr;
        return answer;
    }

    static void main() {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}