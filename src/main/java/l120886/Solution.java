package l120886;

import java.util.Arrays;

class Solution {
    public static int solution(String before, String after) {
        int answer = 0;
        char[] beforeCharArray = before.toCharArray();
        char[] afterCharArray = after.toCharArray();

        Arrays.sort(beforeCharArray);
        Arrays.sort(afterCharArray);

        for (int i = 0; i < beforeCharArray.length; i++) {
            if (beforeCharArray[i] != afterCharArray[i]) {
                return 0;
            }
        }

        return 1;
    }

    static void main() {
        String ex11 = "olleh";
        String ex12 = "hello";

        String ex21 = "allpe";
        String ex22 = "apple";

        System.out.println(solution(ex11, ex12));
        System.out.println(solution(ex21, ex22));

    }
}