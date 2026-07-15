package l181873;

class Solution {
    public static String solution(String my_string, String alp) {
        String answer = "";
        String alpUpperCase = alp.toUpperCase();
        answer = my_string.replace(alp, alpUpperCase);
        return answer;
    }

    static void main() {
        String ex1 = "programmers";
        System.out.println(solution(ex1, "p"));
    }
}