package l181872;

class Solution {
    public static String solution(String myString, String pat) {
        String answer = "";
        while (!myString.endsWith(pat)) {
            myString = myString.substring(0, myString.length() - 1);
        }
        answer = myString;
        return answer;
    }

    static void main() {
        String ex1 = "AbCdEFG";
        System.out.println(solution(ex1, "dE"));
    }
}