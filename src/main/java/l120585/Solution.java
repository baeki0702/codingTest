package l120585;

class Solution {
    public static int solution(int[] array, int height) {
        int answer = 0;
        for (int h : array) if (h > height) answer++;
        return answer;
    }

    static void main() {
        int[] ex1 = {149,180,192,170};

        System.out.println(solution(ex1, 167));
    }
}