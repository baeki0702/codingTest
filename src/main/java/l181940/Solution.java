package l181940;

class Solution {
    public static String solution(String my_string, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        answer = sb.toString();
        return answer;
    }

    static void main() {
        System.out.println(solution("string", 3));
    }
}