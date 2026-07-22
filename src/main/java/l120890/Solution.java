package l120890;

class Solution {
    public static int solution(int[] array, int n) {
        int answer = 0;
        double temp = 1000.0;
        double[] sub = new double[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (n > array[i]) {
                sub[i] = n - array[i];
            } else {
                sub[i] = array[i] - n + 0.1;
            }
            if (temp > sub[i]) {
                temp = sub[i];
                index = i;
            }
            answer = array[index];
        }
        return answer;
    }

    static void main() {
        int[] ex1 = {3, 10, 28};
        System.out.println(solution(ex1, 20));
    }
}