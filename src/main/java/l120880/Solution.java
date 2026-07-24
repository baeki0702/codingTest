package l120880;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] values = Arrays.stream(numlist)
                .mapToDouble(i -> i > n ? i - n - 0.5 : n - i)
                .toArray();

        Arrays.sort(values);
        for (int i = 0; i < values.length; i++) {
            if (values[i] % 1.0 == 0.0) {
                answer[i] = (int) (n - values[i]);
            } else {
                answer[i] = (int) (n + values[i] + 0.5);
            }
        }


// 1 2 3 4 5 6
// 3 2 1 0 1 2
// 3 2 1 0 0.5 1.5
// 0 0.5 1 1.5 2 3
// 4 4.5 5 5.5 6 7


        return answer;
    }

    static void main() {
        int[] ex = {1, 2, 3, 4, 5, 6};
        int n = 4;
        System.out.println(Arrays.toString(solution(ex, n)));
    }

    public int[] solutionStream(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((a, b) -> {
                    int distA = Math.abs(a - n);
                    int distB = Math.abs(b - n);

                    if (distA == distB) {
                        return Integer.compare(b, a); // b가 더 크면 양수 -> 자리 바꿈
                    }
                    return Integer.compare(distA, distB);
                })
                .mapToInt(Integer::intValue)
                .toArray();
    }
}