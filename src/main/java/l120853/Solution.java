package l120853;

class Solution {
    public static int solution(String s) {
        int answer = 0;
        int temp = 0;
        String[] strings = s.split(" ");
        for (String ss : strings) {
            if (!ss.equals("Z")) {
                temp = Integer.parseInt(ss);
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        return answer;
    }

    static void main() {
        String s = "1 2 Z 3";
        System.out.println(solution(s));
    }
}