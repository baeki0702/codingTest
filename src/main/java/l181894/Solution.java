package l181894;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                firstIndex = i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                lastIndex = i;
                break;
            }
        }

        if (firstIndex == -1) {
            answer = new int[]{-1};
        } else {
            answer = new int[lastIndex - firstIndex + 1];
            System.arraycopy(arr, firstIndex, answer, 0, lastIndex - firstIndex + 1);
        }
        return answer;
    }

    static void main() {
        int[] ex1 = {1, 2, 1, 4, 5, 2, 9};
        System.out.println(Arrays.toString(solution(ex1)));
        int[] ex2 = {1, 2, 1};
        System.out.println(Arrays.toString(solution(ex2)));
        int[] ex3 = {1, 1, 1};
        System.out.println(Arrays.toString(solution(ex3)));
    }

    public static int[] solutionStream(int[] arr) {
        int[] idx = IntStream.range(0, arr.length)
                .filter(i -> arr[i] == 2)
                .toArray();

        if (idx.length == 0) return new int[]{-1};

        return IntStream.rangeClosed(idx[0], idx[idx.length - 1])
                .map(i -> arr[i])
                .toArray();
    }
}