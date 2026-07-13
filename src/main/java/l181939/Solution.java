package l181939;

class Solution {
    public static int solution(int a, int b) {
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        String res1 = s1.concat(s2);
        String res2 = s2.concat(s1);
        return Math.max(Integer.parseInt(res1), Integer.parseInt(res2));
    }

    static void main() {
        System.out.println(solution(9,91));
    }
}