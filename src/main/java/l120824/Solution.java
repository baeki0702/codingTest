package l120824;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] num_list) {
        int[] answer = {0, 0};
        for (int number : num_list) {
            if (number % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }

    static void main() {
        int[] answer = {0, 0};
        int[] ex1 = {1,3,5,4,6};
        int[] ex2 = {1,3,5,7};

        answer = solution(ex1);

        System.out.println(Arrays.toString(answer));

        answer = solution(ex2);

        System.out.println(Arrays.toString(answer));
    }
}