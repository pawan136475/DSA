package coding_problems.leetcode.binary_search.Array.sliding_window;

//https://leetcode.com/problems/permutation-in-string/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Code_567 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean checkInclusion(String s1, String s2) {

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for (char c : s1.toCharArray())
            freq1[c - 'a']++;

        for (int i = 0; i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;

            if (i >= s1.length()) freq2[s2.charAt(i - s1.length()) - 'a']--;


            if (Arrays.equals(freq1, freq2)) return true;

        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        String s1 = br.readLine();
        String s2 = br.readLine();

        boolean result = checkInclusion(s1, s2);
        System.out.println(result);
    }
}
