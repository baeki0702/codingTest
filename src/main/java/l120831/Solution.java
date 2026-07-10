package l120831;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i+=2){
            answer += i;
        }
        return answer;
    }

    static void main() {
        System.out.println(solution(10));
        System.out.println(solution(4));
    }
}


