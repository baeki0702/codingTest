package l181924;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int num1, num2, temp;
        for (int[] query : queries) {
            num1 = query[0];
            num2 = query[1];

            temp = arr[num1];
            arr[num1] = arr[num2];
            arr[num2] = temp;
        }
        answer = arr;
        return answer;
    }

    static void main() {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};

        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}