package l120909;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        double sqrt = Math.sqrt(n);
        int is = (int)sqrt;
        double pow = Math.pow(is, 2);
        if (n == pow) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    static void main() {
        System.out.println(solution(144));
        System.out.println(solution(976));
    }
}