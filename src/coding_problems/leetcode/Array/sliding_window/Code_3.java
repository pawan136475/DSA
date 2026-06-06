package coding_problems.leetcode.Array.sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class Code_3 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, length = 0, maxlength = 0;
        int[] arr = new int[256];
        Arrays.fill(arr, -1);

        while (r < s.length()) {
            if (arr[s.charAt(r)] != -1) {
                if (arr[s.charAt(r)] >= l) {
                    l = arr[s.charAt(r)] + 1;

                }
            }
            length = r - l + 1;
            maxlength = Math.max(maxlength, length);
            arr[s.charAt(r)] = r;
            r++;

        }
        return maxlength;
    }

    public static void main(String[] args) throws IOException {
        String input = br.readLine();

        int result = lengthOfLongestSubstring(input);
        System.out.println(result);
    }
}
