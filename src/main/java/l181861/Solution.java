package l181861;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr) {
        int length = 0;
        int index = 0;
        for (int i : arr) {
            length += i;
        }
        int[] answer = new int[length];
        for (int k : arr) {
            for (int j = 0; j < k; j++) {
                answer[index++] = k;
            }
        }
        return answer;
    }

    static void main() {
        int[] ex1 = {5, 1, 4};
        System.out.println(Arrays.toString(solution(ex1)));
    }

}