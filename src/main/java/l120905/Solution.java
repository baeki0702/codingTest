package l120905;

import java.util.Arrays;

class Solution {
    public static int[] solution(int n, int[] numlist) {
        int[] answer = new int[numlist.length];
        int index = 0;
        for (int num : numlist) {
            if (num % n == 0) {
                index++;
            }
        }
        answer = new int[index];

        index = 0;

        for (int num : numlist) {
            if (num % n == 0) {
                answer[index++] = num;
            }
        }

        return answer;
    }

    static void main() {
        System.out.println(Arrays.toString(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
        System.out.println(Arrays.toString(solution(5, new int[]{1, 9, 3, 10, 13, 5})));
        System.out.println(Arrays.toString(solution(12, new int[]{2, 100, 120, 600, 12, 12})));
    }
}