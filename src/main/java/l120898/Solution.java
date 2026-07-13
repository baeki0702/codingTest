package l120898;

class Solution {
    public static int solution(String message) {
        int answer = 0;
        answer = message.length() * 2;
        return answer;
    }

    static void main() {
        String ex1 = "happy birthday!";
        String ex2 = "I love you~";

        System.out.println(solution(ex1));
        System.out.println(solution(ex2));
    }
}