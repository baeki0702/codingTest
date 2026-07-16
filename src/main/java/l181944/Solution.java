package l181944;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        int[] temp = new int[numbers.length * 2];
        System.arraycopy(numbers, 0, temp, 0, numbers.length);
        System.arraycopy(numbers, 0, temp, numbers.length, numbers.length);

        answer = switch (direction) {
            case "right" -> Arrays.copyOfRange(temp, numbers.length - 1, numbers.length * 2 - 1);
            case "left" -> Arrays.copyOfRange(temp, 1, numbers.length + 1);
            default -> answer;
        };
        return answer;
    }

    static void main() {
        int[] ex1 = {1, 2, 3};
        int[] ex2 = {4, 455, 6, 4, -1, 45, 6};

        System.out.println(Arrays.toString(solution(ex1, "right")));
        System.out.println(Arrays.toString(solution(ex2, "left")));
    }
}