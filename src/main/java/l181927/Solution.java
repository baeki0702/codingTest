package l181927;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] num_list) {
        int[] answer = {};
        int len = num_list.length;
        answer = Arrays.copyOf(num_list, len + 1);
        answer[len] = num_list[len - 1] > num_list[len - 2] ? num_list[len - 1] - num_list[len - 2] : num_list[len - 1] * 2;
        return answer;
    }

    static void main() {
        int[] ex1 = {2, 1, 6};
        int[] ex2 = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(solution(ex1)));
        System.out.println(Arrays.toString(solution(ex2)));
    }
}