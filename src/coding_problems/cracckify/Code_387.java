package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//https://leetcode.com/problems/first-unique-character-in-a-string/
public class Code_387 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        for (int j = 0; j < s.length(); j++) {
            if (map.get(s.charAt(j)) == 1)
                return j;
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        String s = br.readLine();

        System.out.println(firstUniqChar(s));
    }
}
