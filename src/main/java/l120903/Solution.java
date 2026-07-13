package l120903;

class Solution {
    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s : s1) {
            for (String string : s2) {
                if (s.equals(string)) {
                    answer++;
                }
            }
        }
        return answer;
    }

    static void main() {
        String[] ex11 = {"a", "b", "c"};
        String[] ex12 = {"com", "b", "d", "p", "c"};

        String[] ex21 = {"n", "omg"};
        String[] ex22 = {"m", "dot "};
        System.out.println(solution(ex11, ex12));
        System.out.println(solution(ex21, ex22));

    }
}