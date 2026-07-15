package l181885;

import java.util.Arrays;

class Solution {
    public static String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        int count = 0;
        for (boolean b : finished) {
            if (!b) count++;
        }
        answer = new String[count];

        int index = 0;
        for (int i = 0; i < todo_list.length; i++) {
            if (!finished[i]) {
                answer[index++] = todo_list[i];
            }
        }
        return answer;
    }

    static void main() {
        String[] ex1 = {"problemsolving", "practiceguitar", "swim", "studygraph"};
        boolean[] ex2 = {true, false, true, false};

        System.out.println(Arrays.toString(solution(ex1, ex2)));
    }
}