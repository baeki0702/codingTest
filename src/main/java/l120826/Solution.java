package l120826;

class Solution {
    public static String solution(String my_string, String letter) {
        String answer = "";

        String[] str = my_string.split("");

        for (String s : str) {
            if (!s.equals(letter)) {
                answer += s;
            }
        }

        return answer;
    }
}



//    class Solution {
//        public String solution(String my_string, String letter) {
//            String answer = "";
//
//            answer = my_string.replace(letter, "");
//
//            return answer;
//        }
//    }