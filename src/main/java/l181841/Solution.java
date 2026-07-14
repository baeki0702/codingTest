package l181841;

class Solution {
    public static String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (String str : str_list) {
            if (!str.contains(ex)) {
                stringBuilder.append(str);
            }
        }

        answer = stringBuilder.toString();

        return answer;
    }

    static void main() {
        String[] ex1 = {"abc", "def", "ghi"};
        String ex = "ef";
        System.out.println(solution(ex1,ex));
    }
}