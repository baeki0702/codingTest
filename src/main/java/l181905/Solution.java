package l181905;

class Solution {
    public static String solution(String my_string, int s, int e) {
        String answer = "";
        answer = my_string.substring(0, s);
        for (int i = e; i >= s; i--) {
            answer += my_string.substring(i, i + 1);
        }
        answer += my_string.substring(e + 1);
        return answer;
    }

    static void main() {
        String ex1 = "Progra21Sremm3";
        System.out.println(solution(ex1, 6, 12));
    }
}