package l181881;

class Solution {
    public static int solution(int[] arr) {
        int answer = 0;
        int isChanged = 0;
        while (true) {
            isChanged = 0;
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] > 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = arr[i] * 2 + 1;
                } else {
                    isChanged++;
                }
            }
            if (isChanged == arr.length) break;
            else {
                answer++;
            }
        }
        return answer;
    }

    static void main() {
        int[] ex1 = {1, 2, 3, 100, 99, 98};
        System.out.println(solution(ex1));

    }
}
