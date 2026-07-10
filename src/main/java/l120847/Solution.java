package l120847;

public class Solution {
    public static int solution(int[] numbers) {
        int answer = 0;
        int max1 = 0;
        int max2 = 0;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max1) {
                max1 = numbers[i];
                index = i;
            }
        }
        numbers[index] = 0;
        for (int i =0; i<numbers.length; i++) {
            if (numbers[i] > max2) {
                max2 = numbers[i];
            }
        }
        answer = max1 * max2;
        return answer;
    }

    static void main() {
        System.out.println(solution(new int[]{1, 2, 5, 3, 4,7, 7, 120}));
    }
}
