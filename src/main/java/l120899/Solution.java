package l120899;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] array) {
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (answer[0] < array[i]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }

    static void main() {
        int[] ex1 = {1, 8, 3};
        int[] ex2 = {9, 10, 11, 8};
        System.out.println(Arrays.toString(solution(ex1)));
        System.out.println(Arrays.toString(solution(ex2)));
    }
}