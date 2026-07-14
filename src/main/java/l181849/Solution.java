package l181849;

class Solution {
    public static int solution(String num_str) {
        int answer = 0;
        char[] charArray = num_str.toCharArray();
        for (char c : charArray) {
            answer += Character.getNumericValue(c);
        }
        return answer;
    }

    static void main() {
        String ex1 = "123456789";
        System.out.println(solution(ex1));
    }
}

/*
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        int len = num_str.length();

        for (int i = 0; i < len; i++) {
            answer += num_str.charAt(i) - '0';
        }

        return answer;
    }
}
 */

/*
class Solution {
    public int solution(String num_str) {
        return num_str.chars()                // 1. 문자열을 IntStream(아스키코드 값 스트림)으로 변환
                      .map(c -> c - '0')      // 2. 각 문자를 실제 숫자로 변환
                      .sum();                 // 3. 모두 더함
    }
}
 */