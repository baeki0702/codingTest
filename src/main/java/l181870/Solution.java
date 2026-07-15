package l181870;

import java.util.Arrays;

class Solution {
    public static String[] solution(String[] strArr) {
        String[] answer = {};
        int len = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].contains("ad")) {
                strArr[i] = strArr[i].replaceAll("[a-z]", "");
            } else {
                len++;
            }
        }
        answer = new String[len];

        int index = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() != 0) {
                answer[index++] = strArr[i];
            }
        }
        return answer;
    }

    static void main() {
        String[] ex1 = {"and", "notad", "abcd"};
        System.out.println(Arrays.toString(solution(ex1)));

    }
}