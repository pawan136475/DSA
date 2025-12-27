package coding_problems.leetcode.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/valid-anagram/
public class Code_242 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        for (int j = 0; j < t.length(); j++) {
            if (map.containsKey(t.charAt(j)) == false) return false;
            else {
                int val = map.get(t.charAt(j));
                val--;
                map.put(t.charAt(j), val);
                if (val < 0) return false;
            }
        }
        return true;
    }


    public static void main(String[] args) throws IOException {

        String s = br.readLine();
        String t = br.readLine();

        boolean result = isAnagram(s, t);
        System.out.println(result);
    }
}
