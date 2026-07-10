package l120830;

class Solution {
    public static int solution(int n, int k) {
        int answer = 0;
        answer = 12000*n + 2000*(k-n/10);
        return answer;
    }

    static void main() {
        System.out.println(solution(10,3));
        System.out.println(solution(64,6));


    }
}