package l181837;

class Solution {
    public static int solution(String[] order) {
        int answer = 0;
        for (String s : order) {
            if (s.contains("cafelatte")) {
                answer += 5000;
            } else {
                answer += 4500;
            }
        }
        return answer;
    }
}