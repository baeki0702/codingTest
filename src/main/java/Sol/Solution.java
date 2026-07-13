package Sol;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        int index = 0;
        for (int i : num_list) {
            answer[index++] = i;
            if (index == n) break;
        }
        return answer;
    }

    static void main() {
        System.out.println(Arrays.toString(solution(new int[]{2, 1, 6}, 1)));
    }
}

