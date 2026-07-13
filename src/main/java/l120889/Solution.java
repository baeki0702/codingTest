package l120889;

class Solution {
    public static int solution(int[] sides) {
        int answer = 0;
        int sum = 0, max = 0;
        for (int num : sides ) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }
        sum -= max;
        if (max >= sum) {
            answer = 2;
        } else {
            answer = 1;
        }
        return answer;
    }

    static void main() {
        int[] ex1 = new int[] {1,2,3};
        int[] ex2 = new int[] {3,6,2};
        int[] ex3 = new int[] {199,72,222};
        System.out.println(solution(ex1));
        System.out.println(solution(ex2));
        System.out.println(solution(ex3));

    }
}