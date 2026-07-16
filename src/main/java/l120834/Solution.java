package l120834;

class Solution {
    public static String solution(int age) {
        String answer = "";
        String stringAge = Integer.toString(age);
        char[] charArray = stringAge.toCharArray();
        for (char c : charArray) {
            answer += (char) (c - '0' + 'a');
        }
        return answer;
    }

    static void main() {
        System.out.println(solution(23));
        System.out.println(solution(51));
    }
}