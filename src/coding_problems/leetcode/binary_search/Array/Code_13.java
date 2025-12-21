package coding_problems.leetcode.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/roman-to-integer/description/
public class Code_13 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                sum = sum + map.get(s.charAt(i));
            else
                sum = sum - map.get(s.charAt(i));

        }
        sum = sum + map.get(s.charAt(s.length() - 1));
        return sum;
    }

    public static void main(String[] args) throws IOException {

        String input = br.readLine();
        int result = romanToInt(input);
        System.out.println(result);
    }
}
