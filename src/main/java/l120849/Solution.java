package l120849;

class Solution {
    public static String solution(String my_string) {
        StringBuilder answer = new StringBuilder();

        String[] tokens = my_string.split("");

        for ( String token : tokens ) {
            if (token.equals("a")) continue;
            else if (token.equals("e")) continue;
            else if (token.equals("i")) continue;
            else if (token.equals("o")) continue;
            else if (token.equals("u")) continue;
            else answer.append(token);
        }

        return answer.toString();
    }

    static void main() {
        String ex1 = "bus";
        String ex2 = "nice to meet you";
        String answer = solution(ex1);
        String answer2 = solution(ex2);

        System.out.println(answer);
        System.out.println(answer2);
    }
}

//public static String solution(String my_string) {
//    StringBuilder answer = new StringBuilder();
//
//    String[] tokens = my_string.split("");
//
//    for ( String token : tokens ) {
//        switch (token) {
//            case "a", "e", "i", "o", "u" -> { }
//            default -> answer.append(token);
//        }
//    }
//
//    return answer.toString();
//}


/*

class Solution {
    public String solution(String my_string) {
        String answer = "";

        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }
}

 */