package l181914;

class Solution {
    public static int solution(String number) {
        int answer = 0;
        int[] array = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            array[i] = number.charAt(i) - '0';
            answer += array[i];
        }
        answer %= 9;
        return answer;
    }

    static void main() {
        String ex1 = "123";
        String ex2 = "78720646226947352489";

        System.out.println(solution(ex1));
        System.out.println(solution(ex2));
    }
}