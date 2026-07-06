package coding_problems.leetcode.Array.sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
public class Code_438 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static List<Integer> findAnagrams(String s, String p) {

        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < p.length(); i++)
            map.put(p.charAt(i), map.getOrDefault(p.charAt(i), 0) + 1);

        count = map.size();
        return slidingWindow(s, map, count, p);
    }

    public static List<Integer> slidingWindow(String s, HashMap<Character, Integer> map, int count, String p) {
        List<Integer> list = new ArrayList<>();
        int j = 0;
        int i = 0;
        while (j < s.length()) {

            if (map.containsKey(s.charAt(j))) {
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);

                if (map.get(s.charAt(j)).equals(0)) count--;
            }

            if (j - i + 1 < p.length()) {
                j++;
            } else if (j - i + 1 == p.length()) {
                if (count == 0) {
                    list.add(i);
                }
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

                    if (map.get(s.charAt(i)) == 1) count++;
                }
                i++;
                j++;
            }

        }
        return list;
    }

    public static void main(String[] args) throws IOException {

        String s = br.readLine();
        String p = br.readLine();

        List<Integer> result = findAnagrams(s, p);
        System.out.println(result);
    }
}
