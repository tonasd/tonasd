import java.util.Map;

class Solution {

    // соответствие символа его значению в десятичной системе
    final Map<Character, Integer> letterToDec = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000 );

    public int romanToInt(String s) {
        int current = letterToDec.get(s.charAt(0));
        int result = current;
        for (int i = 1; i < s.length(); ++i) {
            int prev = current;
            current = letterToDec.get(s.charAt(i));
            if (prev < current) result -= prev * 2;
            result += current;

        }
        return result;
    }
}
