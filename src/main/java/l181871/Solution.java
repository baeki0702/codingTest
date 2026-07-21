package l181871;

import java.util.stream.IntStream;

class Solution {
    public static int solution(String myString, String pat) {
        int answer = -1;
        int index = 0;
        while (index != -1) {
            index = myString.indexOf(pat);
            myString = myString.substring(index + 1, myString.length());
            answer++;
        }
        return answer;
    }

    static void main() {
//        String ex1 = "abc";
//        int index = ex1.indexOf("d");
//        System.out.println(index);

        String ex1 = "banana";
        System.out.println(solution(ex1, "ana"));
    }

    public static int solutionStream(String myString, String pat) {
        long count = IntStream
                .range(0, myString.length())
                .filter(i -> myString.substring(i).startsWith(pat))
                .count();
        return (int) count;
    }
}