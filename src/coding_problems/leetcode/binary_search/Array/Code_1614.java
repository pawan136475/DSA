package coding_problems.leetcode.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/

public class Code_1614 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int maxDepth(String s) {

        int max = 0;
        int curr = 0;

        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == '(') {
                curr++;
                max = Math.max(max, curr);
            } else if (s.charAt(i) == ')')
                curr--;
        return max;
    }


    public static void main(String[] args) throws IOException {

        String input = br.readLine();

        int result = maxDepth(input);
        System.out.println(result);
    }
}
