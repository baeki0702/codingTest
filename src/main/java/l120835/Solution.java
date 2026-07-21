package l120835;

import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        int[] temp = Arrays.stream(emergency)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        for (int i = 0; i < emergency.length; i++) {
            int index = 0;
            while (emergency[i] != temp[index]) {
                index++;
            }
            answer[i] = index + 1;
        }

//        30 10 23 6 100
//        100 30 23 10 6
//        [1+1] [3+1] [2+1] [4+1] [0+1]
        return answer;
    }

    static void main() {
        int[] ex1 = {3, 76, 24};
        int[] ex2 = {30, 10, 23, 6, 100};
        System.out.println(Arrays.toString(solution(ex1)));
        System.out.println(Arrays.toString(solution(ex2)));

    }

    public int[] solutionStream(int[] emergency) {
        int[] array = Arrays.stream(emergency)
                .map(i -> Arrays.stream(emergency)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList())
                        .indexOf(i) + 1)
                .toArray();
        return array;
    }

    public int[] solutionHashMap(int[] emergency) {
        int[] sorted = Arrays.stream(emergency)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        Map<Integer, Integer> rankMap = new HashMap<>();

        for (int i = 0; i < sorted.length; i++) {
            rankMap.put(sorted[i], i + 1);
        }
        // 100 30 23 10 6
        // 1   2  3  4  5

        return Arrays.stream(emergency)
                .map(rankMap::get)  // map(i -> rankMap.get(i)) 와 동일
                .toArray();
    }
}