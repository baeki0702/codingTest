package l120908;

class Solution {
    public static int solution(String str1, String str2) {
        int answer = 0;
        if (str1.contains(str2)) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }

    static void main() {
        String ex1 = "ab6CDE443fgh22iJKlmn1o";
        String ex2 = "6CD";
        System.out.println(solution(ex1, ex2));
    }
}