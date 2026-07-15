package l181865;

class Solution {
    public static int solution(String binomial) {
        int answer = 0;
        String[] tokens = binomial.split(" ");
        int num1 = Integer.parseInt(tokens[0]);
        int num2 = Integer.parseInt(tokens[2]);
        switch (tokens[1]) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
        }
        return answer;
    }

    static void main() {
        System.out.println(solution("43 + 12"));
    }
}