package l181930;

class Solution {
    public static int solution(int a, int b, int c) {
        int answer = 0;
        if (a != b && b != c && c != a) {
            answer = a + b + c;
        } else if (a == b && a == c) {
            answer = (3 * a) * (3 * a * a) * (3 * a * a * a);
        } else {
            answer = (a + b + c) * (a * a + b * b + c * c);
        }
        return answer;
    }

    static void main() {
        System.out.println(solution(2, 1, 6));
        System.out.println(solution(5, 3, 3));
        System.out.println(solution(4, 4, 4));
    }
}