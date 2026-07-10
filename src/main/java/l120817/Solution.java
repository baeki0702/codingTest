package l120817;

public class Solution {
    public static double solution(int[] numbers){
        double answer = 0;
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        answer = (double)sum / numbers.length;

        return answer;
    }

}
