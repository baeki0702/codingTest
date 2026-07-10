package l120854;

import java.util.Arrays;

class Solution {
    public static int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }

    static void main() {
        String[] ex1 = {"We", "are", "the", "world!"};

        System.out.println(Arrays.toString(solution(ex1)));
    }
}

/*

import java.util.Arrays;

class Solution {
    public int[] solution(String[] strList) {
        return Arrays.stream(strList).mapToInt(String::length).toArray();
    }
}

 */