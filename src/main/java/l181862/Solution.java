package l181862;

import java.util.Arrays;
import java.util.StringTokenizer;

class Solution {
    public static String[] solution(String myStr) {
        String[] answer = {"EMPTY"};
        String mid = myStr.replaceAll("[abc]", "a");
        StringTokenizer stringTokenizer = new StringTokenizer(mid, "a");

        if (stringTokenizer.countTokens() == 0) {
            return answer;
        }

        answer = new String[stringTokenizer.countTokens()];

        int idx = 0;
        while (stringTokenizer.hasMoreTokens()) {
            answer[idx++] = stringTokenizer.nextToken();
        }

        return answer;
    }

    static void main() {
        String ex1 = "baconlettucetomato";
        System.out.println(Arrays.toString(solution(ex1)));

        String ex3 = "cabab";
        System.out.println(Arrays.toString(solution(ex3)));

    }

    public String[] solutionStream(String myStr) {
        String[] arr = Arrays
                .stream(myStr.split("[abc]+"))
                .filter(str -> !str.isEmpty())
                .toArray(String[]::new);

        return arr.length == 0 ? new String[]{"EMPTY"} : arr;
    }
}