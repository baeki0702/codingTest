package l120912;

class Solution {
    public static int solution(int[] array) {
        int answer = 0;
        for (int i : array) {
            while (true) {
                if (i % 10 == 7) answer++;
                i /= 10;
                if (i == 0) break;
            }
        }
        return answer;
    }

    static void main() {
        int a = solution(new int[]{1, 2, 3});
    }
}