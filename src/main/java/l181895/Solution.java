package l181895;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, int[][] intervals) {
        int len = intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2;
        int[] answer = new int[len];
        System.arraycopy(arr, intervals[0][0], answer, 0, intervals[0][1] - intervals[0][0] + 1);
        System.arraycopy(arr, intervals[1][0], answer, intervals[0][1] - intervals[0][0] + 1, intervals[1][1] - intervals[1][0] + 1);
        return answer;
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] intervals = {{1, 3}, {0, 4}};
        System.out.println(Arrays.toString(solution(arr, intervals)));
    }
}