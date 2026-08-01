package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//https://leetcode.com/problems/valid-anagram/description/
public class Code_242 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        for (int j = 0; j < t.length(); j++) {
            if (s.length() == t.length()) {
                if (map.containsKey(t.charAt(j)) && map.get(t.charAt(j)) > 0) {
                    map.put(t.charAt(j), map.get(t.charAt(j)) - 1);
                } else return false;
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        String t = br.readLine();

        System.out.println(isAnagram(s, t));
    }
}
