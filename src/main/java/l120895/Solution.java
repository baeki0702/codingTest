package l120895;

class Solution {
    public static String solution(String my_string, int num1, int num2) {
        String answer = "";
        answer = my_string.substring(0, num1) + my_string.charAt(num2) + my_string.substring(num1+1, num2) + my_string.charAt(num1) + my_string.substring(num2+1);
        return answer;
    }

    static void main() {
        System.out.println(solution("hello",1,2));
        System.out.println(solution("I love you",3,6));

    }
}