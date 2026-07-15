package l181926;

class Solution {
    public static int solution(int n, String control) {
        int answer = 0;
        char[] charArray = control.toCharArray();
        for (char c : charArray) {
            switch (c) {
                case 'w' -> n++;
                case 's' -> n--;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        return n;
    }

    static void main() {
        String ex1 = "wsdawsdassw";
        System.out.println(solution(0, ex1));
    }
}