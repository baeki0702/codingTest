package l120836;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        for (int i=1; i <= n; i++) {
            if (n % i == 0) answer++;
        }
        return answer;
}

    static void main() {
        System.out.println(solution(20));
        System.out.println(solution(100));
    }
}