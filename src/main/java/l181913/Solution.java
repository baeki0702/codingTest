package l181913;

class Solution {
    public static String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        String reversed = "";
        for (int[] query : queries) {
            StringBuilder reverse = new StringBuilder(sb);
            String temp = sb.substring(query[0], query[1] + 1);
            sb.delete(query[0], query[1] + 1);
            temp = new StringBuilder(temp).reverse().toString();
            sb.insert(query[0], temp);

        }

        answer = sb.toString();
        return answer;
    }

    static void main() {
        String ex1 = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};
        System.out.println(solution(ex1, queries));
    }
}