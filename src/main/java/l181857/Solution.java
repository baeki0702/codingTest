package l181857;

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr) {
        int[] answer = {};
        int len = arr.length;
        int answerLen = 1;

        while(len > answerLen){
            answerLen *=2;
        }

        answer = new int[answerLen];
        System.arraycopy(arr, 0, answer, 0, len);
        return answer;
    }

    static void main() {
        int[] ex1 = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(solution(ex1)));

        int[] ex2 = {1,2,3,4};
        System.out.println(Arrays.toString(solution(ex2)));
    }
}