package l181906;

class Solution {
    public static int solution(String my_string, String is_prefix) {
        int answer = 0;
        char[] myCharArray = my_string.toCharArray();
        char[] prefixCharArray = is_prefix.toCharArray();

        boolean b = my_string.startsWith(is_prefix);
        if (is_prefix.length() > my_string.length()) return 0;

        for (int i = 0; i < is_prefix.length(); i++) {
            if (myCharArray[i] != prefixCharArray[i]) {
                return 0;
            }
        }
        return 1;
    }

    static void main() {
        String ex1 = "banana";
        String ex2 = "ban";
        String ex3 = "nan";
        System.out.println(solution(ex1, ex2));
        System.out.println(solution(ex1, ex3));

    }
}