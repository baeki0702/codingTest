package l120817;

public class Main {
    public static void main(String[] args) {
        // 1. 프로그래머스에 있는 Solution 클래스 객체 생성
        Solution sol = new Solution();

        // 2. 입출력 예시 #1 테스트
        int[] ex1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result1 = sol.solution(ex1);
        System.out.println("예시 1번 결과: " + result1); // 기대값: 5.5

        // 3. 입출력 예시 #2 테스트
        int[] ex2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double result2 = sol.solution(ex2);
        System.out.println("예시 2번 결과: " + result2); // 기대값: 94.0
    }
}