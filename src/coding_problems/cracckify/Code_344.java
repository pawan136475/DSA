package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://leetcode.com/problems/reverse-string/
public class Code_344 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void reverseString(char[] s) {
        int i = 0;
        char temp;
        int j = s.length - 1;
        while (i <= j) {
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) throws IOException {
        String ip = br.readLine();


        reverseString(ip.toCharArray());

    }
}
