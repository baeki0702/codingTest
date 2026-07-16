package l181900;

import java.util.Arrays;

class Solution {
    public static String solution(String my_string, int[] indices) {
        String answer = "";
        int index = 0;
        Arrays.sort(indices);
        for (int i = 0; i < my_string.length(); i++) {
            if (index == indices.length) {
                answer += my_string.charAt(i);
            } else if (i != indices[index]) {
                answer += my_string.charAt(i);
            } else {
                index++;
            }
        }
        return answer;
    }

    static void main() {
        String my_string = "apporoograpemmemprs";
        int[] indices = {1, 16, 6, 15, 0, 10, 11, 3};

        System.out.println(solution(my_string, indices));
    }
}

//0 1 3 6 11 15 16 제거

/*
class Solution {

    public String solution(String my_string, int[] indices) {
        String answer = "";
        String[] tmp = my_string.split("");

        for (int i = 0; i < indices.length; i++) {
            tmp[indices[i]] = "";
        }

        for (String x : tmp) {
            answer += x;
        }
        return answer;
    }
}
 */