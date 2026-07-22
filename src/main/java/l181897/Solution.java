package l181897;

import java.util.Arrays;

class Solution {
    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        switch (n) {
            case 1 -> answer = Arrays.copyOf(num_list, b + 1);
            case 2 -> answer = Arrays.copyOfRange(num_list, a, num_list.length);
            case 3 -> answer = Arrays.copyOfRange(num_list, a, b + 1);
            case 4 -> {
                answer = new int[(b - a) / c + 1];
                int index = 0;
                for (int i = a; i <= b; i += c) {
                    answer[index++] = num_list[i];
                }
            }
        }
        return answer;
    }

    static void main() {
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(Arrays.toString(solution(3, slicer, num_list)));
        System.out.println(Arrays.toString(solution(4, slicer, num_list)));
    }
}