package l181866;

import java.util.Arrays;

class Solution {
    public static String[] solution(String myString) {
        while (true) {
            if (myString.startsWith("x")) {
                myString = myString.substring(1);
            } else {
                break;
            }
        }
        String[] tokens = myString.split("x+");
        Arrays.sort(tokens);
        return tokens;
    }

    static void main() {
        String ex1 = "xxxaxbxxxxcxdxxx";
        String ex2 = "dxccxbbbxaaaa";
        String s = ex1.replace("x+", "x");
        System.out.println(Arrays.toString(solution(ex1)));
        System.out.println(Arrays.toString(solution(ex2)));
    }
}