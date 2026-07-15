package l181868;

import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static String[] solution(String my_string) {
        String[] answer = {};
        StringTokenizer st = new StringTokenizer(my_string);
        int index = 0;
        answer = new String[st.countTokens()];
        while (st.hasMoreTokens()) {
            answer[index++] = st.nextToken();
        }
        return answer;
    }

    static void main() {
        String ex1 = "  i   love   you  ";
        System.out.println(Arrays.toString(solution(ex1)));
    }
}