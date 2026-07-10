package l120841;

class Solution {
    public static int solution(int[] dot) {
        if (dot[0] > 0 && dot[1] > 0) return 1;
        else if (dot[0] < 0 && dot[1] > 0) return 2;
        else if (dot[0] < 0 && dot[1] < 0) return 3;
        else return 4;
    }

    static void main() {
        System.out.println(solution(new int[]{2, 4}));
        System.out.println(solution(new int[]{-7, 4}));

    }
}
