package l181864;

class Solution {
    public static int solution(String myString, String pat) {
        int answer = 0;
        myString = myString.replace('A', 'b')
                .replace('B', 'A')
                .replace('b', 'B');
        answer = myString.contains(pat) ? 1 : 0;
        return answer;
    }

    static void main() {
        System.out.println(solution("ABBAA", "AABB"));
    }
}