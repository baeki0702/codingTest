package l120893;

class Solution {
    public static String solution(String my_string) {
        String answer = "";

        StringBuilder sb =  new StringBuilder();

        for ( char c : my_string.toCharArray() ) {
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }
        return sb.toString();
    }

    static void main() {
        String ex1 = "cccCCC";
        String ex2 = "abCdEfghIJ";

        System.out.println(solution(ex1));
        System.out.println(solution(ex2));
    }
}