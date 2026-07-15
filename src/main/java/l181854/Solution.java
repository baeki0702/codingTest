package l181854;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        answer = Arrays.copyOfRange(arr, 0, arr.length);
        switch (arr.length % 2) {
            case 0:
                for (int i = 1; i < arr.length; i += 2) {
                    answer[i] += n;
                }
                break;
            case 1:
                for (int i = 0; i < arr.length; i += 2) {
                    answer[i] += n;
                }
                break;
        }
        return answer;
    }

    static void main() {
        int[] ex1 = {49, 12, 100, 276, 33};
        int[] ex2 = {444, 555, 666, 777};
        System.out.println(Arrays.toString(solution(ex1, 27)));
        System.out.println(Arrays.toString(solution(ex2, 100)));

    }
}