package l120811;

class Solution {
    public static int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array[array.length / 2];
    }

    static void main() {
        int[] ex1 = {9,-1,0};
        System.out.println(solution(ex1));
    }
}