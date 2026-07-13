package l120906;

class Solution {
    public static int solution(int n) {
        int answer = 0;

        String s = Integer.toString(n);
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            answer += (int)c - 48;
        }
        return answer;
    }

    static void main() {
        System.out.println(solution(1234));
        System.out.println(solution(930211));
    }
}

/*
class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer+=n%10;
            n/=10;
        }

        return answer;
    }
}
 */