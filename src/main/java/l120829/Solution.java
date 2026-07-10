package l120829;

class Solution {
    public static int solution(int angle) {
        if (angle > 0 && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle > 90 && angle < 180) {
            return 3;
        } else if (angle == 180) {
            return 4;
        } else {
            return -1;
        }
    }

    static void main() {
        int answer1 = solution(70);
        int answer2 = solution(91);
        int answer3 = solution(180);

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);

    }
}