package l120864;

import java.util.Arrays;

class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        String[] strings = my_string.split("[a-zA-Z]+");
        for (String s : strings) {
            if (!s.isEmpty()) {
                answer += Integer.parseInt(s);
            }
        }
        return answer;
    }

    static void main() {
        String ex1 = "aAb1B2cC34oOp";
        System.out.println(solution(ex1));
    }

    public static int solutionStream(String my_string) {
        int sum = Arrays.stream(my_string.split("[A-Za-z]+"))
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
        return sum;
    }
}