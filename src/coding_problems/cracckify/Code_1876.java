package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
public class Code_1876 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int countGoodSubstrings(String s) {
        if (s.length() < 3)
            return 0;
        int i = 0;
        int j = 0;
        int size = s.length();

        int count = 0;
        int k = 0;
        while (j < size) {
            //calculation


            if (j - i + 1 < 3)
                j++;
            if (3 == j - i + 1) {
                //calculation
                String val = s.substring(i, j + 1);
                count += calculation(val);
                i++;
                j++;
            }
        }
        return count;
    }

    public static int calculation(String val) {
        HashMap<Character, Integer> map = new HashMap<>();
        int k = 0;
        boolean flag = true;
        int count = 0;
        while (k < 3) {
            if (map.getOrDefault(val.charAt(k), 0) > 0) {
                flag = false;

            } else {
                map.put(val.charAt(k), map.getOrDefault(val.charAt(k), 0) + 1);
            }
            k++;
        }
        if (flag == true)
            count++;

        return count;
    }

    public static void main(String[] args) throws IOException {

        String s = br.readLine();
        System.out.println(countGoodSubstrings(s));
    }
}
