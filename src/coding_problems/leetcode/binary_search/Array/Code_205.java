package coding_problems.leetcode.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/isomorphic-strings/description/

public class Code_205 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i))
                    return false;

            } else {
                if (map.containsValue(t.charAt(i)))
                    return false;

            }
            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String t = br.readLine();
        boolean result = isIsomorphic(s, t);
        System.out.println(result);
    }
}
