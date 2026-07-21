package l181912;

import java.util.Arrays;

class Solution {
    public static int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};

        answer = Arrays.stream(intStrs)
                .map(str -> str.substring(s, s + l))
                .mapToInt(Integer::parseInt)
                .filter(i -> i > k)
                .toArray();

        return answer;
    }

    static void main() {
        String[] intStrs = {"0123456789", "9876543210", "9999999999999"};
        System.out.println(Arrays.toString(solution(intStrs, 50000, 5, 5)));
    }
}