package l181847;

class Solution {
    public static String solution(String n_str) {
        String answer = "";
        int cnt = 0;
        char[] charArray = n_str.toCharArray();
        for (char c : charArray) {
            if (c == '0' && cnt == 0) {
            } else {
                answer += c;
                cnt++;
            }
        }
        return answer;
    }

    static void main() {
        String ex1 = "0010";
        System.out.println(solution(ex1));
    }
}

/*
class Solution {
    public String solution(String nStr) {
        return String.valueOf(Integer.parseInt(nStr));
    }
}
 */