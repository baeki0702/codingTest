package l120822;

public class Solution2 {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        sb.reverse();

        return sb.toString();
    }
}


//
//class Solution {
//    public String solution(String myString) {
//        return new StringBuilder(myString).reverse().toString();
//    }
//}