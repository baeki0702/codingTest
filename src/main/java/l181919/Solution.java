package l181919;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> solution(int n) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(n);
        int a = n;
        while (a != 1) {
            a = a % 2 == 0 ? a / 2 : 3 * a + 1;
            integerList.add(a);
        }
        return integerList;
    }

    static void main() {
        System.out.println(solution(10));
    }
}