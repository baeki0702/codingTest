package l120887;

class Solution {
    public static int solution(int i, int j, int k) {
        int answer = 0;
        int index = 0;
        for (int num = i; num <= j; num++) {
            for (int num2 = num; num2 != 0; num2 /= 10) {
                if (num2 % 10 == k) answer++;
            }
        }
        return answer;
    }

    static void main() {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
    }
}