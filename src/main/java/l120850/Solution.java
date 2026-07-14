package l120850;

import java.util.Arrays;

class Solution {
    public static int[] solution(String my_string) {
        int[] answer = {};
        my_string = my_string.replaceAll("[a-zA-Z]","");
        answer = new int[my_string.length()];
        char[] charArray = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++) {
            answer[i] = Character.getNumericValue(charArray[i]);
        }
        Arrays.sort(answer);

        return answer;
    }

    static void main() {
        String ex1 = "hi12392";
        System.out.println(Arrays.toString(solution(ex1)));
    }
}