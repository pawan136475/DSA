package coding_problems.cracckify;

//https://leetcode.com/problems/valid-palindrome/description/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Code_125 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean isPalindrome(String s) {
        String sanitizedString = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = sanitizedString.length() - 1;

        while (i <= j) {

            if (Objects.equals(sanitizedString.charAt(i), sanitizedString.charAt(j))) {
                i++;
                j--;
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        String s = br.readLine();

        System.out.println(isPalindrome(s));
    }
}
