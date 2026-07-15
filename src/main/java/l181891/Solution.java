package l181891;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] num_list, int n) {
        int len = num_list.length;
        int[] answer = new int[len];
        int[] ar1 = new int[n];
        int[] ar2 = new int[len - n];

        ar1 = Arrays.copyOfRange(num_list, 0, n);
        ar2 = Arrays.copyOfRange(num_list, n, len);

        System.arraycopy(ar2, 0, answer, 0, ar2.length);
        System.arraycopy(ar1, 0, answer, ar2.length, ar1.length);
        return answer;
    }

    static void main() {
        int[] ex1 = {2, 1, 6};
        int n = 1;
        System.out.println(Arrays.toString(solution(ex1, n)));

    }
}