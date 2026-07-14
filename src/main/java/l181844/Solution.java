package l181844;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        for (int i = 0; i < arr.length; i++) {
            for (int k : delete_list) {
                if (arr[i] == k) {
                    arr[i] = 0;
                    break;
                }
            }
        }
        int index = 0;
        for (int i : arr) {
            if (i != 0) {
                index++;
            }
        }

        answer = new int[index];
        index = 0;
        for (int j : arr) {
            if (j != 0) {
                answer[index++] = j;
            }
        }
        return answer;
    }

    static void main() {
        int[] arr = {293, 1000, 395, 678, 94};
        int[] delete_list = {94, 777, 104, 1000, 1, 12};
        System.out.println(Arrays.toString(solution(arr,delete_list)));
    }

}

/*
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int n : arr) {
            list.add(n);
        }
        for(int n: delete_list) {
            list.remove((Integer)n);
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

 */