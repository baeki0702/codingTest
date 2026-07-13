package l120910;

class Solution {
    public static int solution(int n, int t) {
        int answer = 0;
        int mult = (int) Math.pow(2, t);
        answer = n * mult;
        return answer;
    }

    static void main() {
        System.out.println(solution(2, 10));
        System.out.println(solution(7, 15));

    }
}