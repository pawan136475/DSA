package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/description/
public class Code_14 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);

        char[] first = strs[0].toCharArray();
        char[] second = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i])
                break;

            sb.append(first[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        String[] ip = br.readLine().split(" ");

        System.out.println(longestCommonPrefix(ip));
    }
}
