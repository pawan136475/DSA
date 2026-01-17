package coding_problems.leetcode.binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/reverse-words-in-a-string/description/

public class Code_151 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String reverseWords(String s) {
        String[] ip = s.trim().split("\\s+");
        int start = 0;
        int end = ip.length - 1;
        String temp = "";

        while (start < end) {
            temp = ip[start];
            ip[start] = ip[end];
            ip[end] = temp;
            start++;
            end--;
        }

        return String.join(" ", ip);
    }

    public static void main(String[] args) throws IOException {

        String input = br.readLine();


        String result = reverseWords(input);
        System.out.println(result);
    }
}
