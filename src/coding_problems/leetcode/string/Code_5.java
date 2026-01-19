package coding_problems.leetcode.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/longest-palindromic-substring/submissions/1888984319/

public class Code_5 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String longestPalindrome(String s) {
        String palindrome = "";
        if (s.length() <= 1) return s;
        String LPS = "";
        int low = 0, high = 0;
        for (int i = 1; i < s.length(); i++) {
            //odd length palindromes
            low = i;
            high = i;
            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                if (low == -1 || high == s.length()) break;
            }
            palindrome = s.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) LPS = palindrome;

            //even length palindromes
            low = i - 1;
            high = i;
            while (s.charAt(low) == s.charAt(high)) {
                low--;
                high++;
                if (low == -1 || high == s.length()) break;

            }
            palindrome = s.substring(low + 1, high);
            if (palindrome.length() > LPS.length()) LPS = palindrome;
        }

        return LPS;
    }

    public static void main(String[] args) throws IOException {

        String ip = br.readLine();
        String lps = longestPalindrome(ip);
        System.out.println(lps);
    }
}
