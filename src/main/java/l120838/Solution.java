package l120838;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static String solution(String letter) {
        String answer = "";

        Map<String, Character> morseMap = new HashMap<>();

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Character[] alphabet = new Character[morse.length];
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) ('a' + i);
        }

        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], alphabet[i]);
        }
        String[] letterChar = letter.split(" ");
        for (String s : letterChar) {
            answer += "" + morseMap.get(s);
        }
        return answer;
    }

    static void main() {
        String ex1 = ".... . .-.. .-.. ---";
        System.out.println(solution(ex1));

    }
}