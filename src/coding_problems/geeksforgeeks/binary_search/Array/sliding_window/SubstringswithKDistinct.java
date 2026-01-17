package coding_problems.geeksforgeeks.binary_search.Array.sliding_window;

//https://www.geeksforgeeks.org/problems/count-number-of-substrings4528/1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SubstringswithKDistinct {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int countSubstr(String s, int k) {
        //  code here

        int val1 = distinctIntegers(s, k);
        int val2 = distinctIntegers(s, k - 1);
        return val1 - val2;
    }

    public static int distinctIntegers(String s, int k) {
        int l = 0, r = 0, count = 0;
        Map<String, Integer> map = new HashMap<>();
        while (r < s.length()) {
            map.put(String.valueOf(s.charAt(r)), map.getOrDefault(String.valueOf(s.charAt(r)), 0) + 1);
            while (map.size() > k) {
               map.remove(String.valueOf(s.charAt(l)));
                l++;

            }
            count = count + r - l + 1;
            r++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

        String input = br.readLine();
        int k = Integer.parseInt(br.readLine());

        int result = countSubstr(input, k);
        System.out.println(result);
    }
}
