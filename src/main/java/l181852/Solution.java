package l181852;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] num_list) {
        int len = num_list.length - 5;
        int[] answer = new int[len];
        Arrays.sort(num_list);
        for (int i = 0; i < len; i++) {
            answer[i] = num_list[i + 5];
        }
        return answer;
    }

    static void main() {
        int[] ex1 = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        System.out.println(Arrays.toString(solution(ex1)));
    }
}

//answer = Arrays.copyOfRange(num_list,5,num_list.length);