package l181859;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int index = 0;

        // 0 1 0 1 0
        // answer[0] = 0, index=1
        // answer[0]0 == arr[1]1 -> 달라, answer[1]1 = arr[1] , index=2
        // answer[1]1 == arr[2]0 -> 달라, answer[2]0 = arr[2]-
        for (int i = 0; i < arr.length; i++) {
            if (index == 0) {
                answer[index++] = arr[i];
            } else if (answer[index - 1] == arr[i]) {
                index--;
            } else {
                answer[index++] = arr[i];
            }
        }

        if (index == 0) {
            return new int[]{-1};
        } else {
            return Arrays.copyOf(answer, index);
        }
    }

    static void main() {
        int[] ex1 = {0, 1, 1, 1, 0};
        int[] ex2 = {0, 1, 0, 1, 0};
        int[] ex3 = {0, 1, 1, 0};

        System.out.println(Arrays.toString(solution(ex1)));
        System.out.println(Arrays.toString(solution(ex2)));
        System.out.println(Arrays.toString(solution(ex3)));
    }
}