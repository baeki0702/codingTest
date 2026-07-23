package l120852;

import java.util.Arrays;

class Solution {
    public static int[] solution(int n) {
        int[] answer = {};
        int count = 0;
        int prime = 0;
        for (int i = 2; i <= n; i++) {
            prime = 0;
            for (int j = i; j > 1; j--) {
                if (i % j == 0) {
                    prime++;
                }
            }
            if (prime == 1) {
                if (n % i == 0) {
                    count++;
                }
            }
        }
        answer = new int[count];
        int index = 0;

        for (int i = 2; i <= n; i++) {
            prime = 0;
            for (int j = i; j > 1; j--) {
                if (i % j == 0) {
                    prime++;
                }
            }
            if (prime == 1) {
                if (n % i == 0) {
                    answer[index++] = i;
                }
            }
        }
        return answer;
    }

    static void main() {
        System.out.println(Arrays.toString(solution(12)));
        System.out.println(Arrays.toString(solution(17)));
        System.out.println(Arrays.toString(solution(420)));

    }
}