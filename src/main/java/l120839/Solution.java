package l120839;

class Solution {
    public static String solution(String rsp) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = rsp.toCharArray();
        for (char c : charArray) {
           switch (c) {
               case '0' -> answer.append("5");
               case '2' -> answer.append("0");
               case '5' -> answer.append("2");
           }
        }
        return answer.toString();
    }

    static void main() {
        System.out.println(solution("2"));
        System.out.println(solution("205"));
    }
}

/*
for (char c : charArray) {
    // switch가 계산한 결과값을 변수에 바로 대입
    answer += switch (c) {
        case '0' -> "5";
        case '2' -> "0";
        case '5' -> "2";
        default -> ""; // 표현식으로 쓸 때는 모든 예외 상황을 처리할 default가 필수
    }; // 표현식(대입문)이므로 끝에 세미콜론(;)
 */