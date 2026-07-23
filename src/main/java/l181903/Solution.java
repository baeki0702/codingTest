package l181903;

class Solution {
    public static String solution(int q, int r, String code) {
        String answer = "";
        String[] strings = code.split("");
        for (int i = 0; i < strings.length; i++) {
            if (i % q == r) {
                answer += strings[i];
            }
        }
        return answer;
    }

    static void main() {
        String ex1 = "qjnwezgrpirldywt";
        System.out.println(solution(3, 1, ex1));

    }
}