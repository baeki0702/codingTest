package l181928;

class Solution {
    public static int solution(int[] num_list) {
        int answer = 0;
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i : num_list) {
            if (i % 2 == 0) {
                even.append(Integer.toString(i));
            } else {
                odd.append(Integer.toString(i));
            }
        }
        answer = Integer.parseInt(even.toString()) + Integer.parseInt(odd.toString());
        return answer;
    }

    static void main() {
        System.out.println(solution(new int[]{3, 4, 5, 2, 1}));
    }
}