package l181890;

import java.util.Arrays;

class Solution {
    public static String[] solution(String[] str_list) {
        String[] answer = {};

        String str = "";
        for (String s : str_list) {
            str += s;
        }
        int lIndex = str.indexOf("l");
        int rIndex = str.indexOf("r");

        if (lIndex == rIndex) return new String[]{};
        else if ((lIndex < rIndex || rIndex == -1) && lIndex != -1) {
            str = str.substring(0, lIndex);
        } else {
            str = str.substring(rIndex + 1);
        }

        if (lIndex == 0 || rIndex == str.length()) return new String[]{};
        answer = str.split("");
        return answer;
    }

    static void main() {
        String[] arr2 = {"l"};
        System.out.println(Arrays.toString(solution(arr2)));

    }
}