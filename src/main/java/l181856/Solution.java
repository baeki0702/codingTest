package l181856;

class Solution {
    public static int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int len1 = arr1.length;
        int len2 = arr2.length;
        int sum1 = 0, sum2 = 0;
        if (len1 == len2) {
            for (int i : arr1) {
                sum1 += i;
            }
            for (int i : arr2) {
                sum2 += i;
            }
            if (sum1 == sum2) {
                answer = 0;
            } else {
                answer = sum1 > sum2 ? 1 : -1;
            }
        } else {
            answer = len1 > len2 ? 1 : -1;
        }
        return answer;
    }

    static void main() {
        int[] ex1ar1 = {49, 13};
        int[] ex1ar2 = {70, 11, 2};
        int[] ex2ar1 = {100, 17, 84, 1};
        int[] ex2ar2 = {55, 12, 65, 36};
        System.out.println(solution(ex1ar1, ex1ar2));
        System.out.println(solution(ex2ar1, ex2ar2));
    }
}

/*
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }

        return answer;
    }
}
 */