package l120851;

class Solution {
    public static int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]", "");
        String[] tokens = str.split("");

        for ( String token : tokens ) {
            answer += Integer.parseInt(token);
        }

        return answer;
    }

    static void main() {
        String my_string = "ac3d4a";

        System.out.println(solution(my_string));

    }
}


// [a-zA-Z] -> [^0-9]