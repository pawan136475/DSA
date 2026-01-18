package coding_problems.leetcode.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/string-to-integer-atoi/description/
public class Code_8 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean isDigits(char c) {
        return c >= '0' && c <= '9';
    }

    public static int myAtoi(String s) {

        int i = 0;
        int num = 0;
        int sign = 1;

        //whitespaces

        while (i < s.length() && s.charAt(i) == ' ') i++;

        //signedness
        if (i < s.length()) {
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else if (s.charAt(i) == '+') {
                sign = 1;
                i++;
            }


        }

        //conversion
        while (i < s.length() && isDigits(s.charAt(i))) {
            int digit = s.charAt(i) - '0';


            //rounding

            if (num == Integer.MAX_VALUE / 10) {
                if (sign == 1) {
                    if (digit >= 7) {
                        return Integer.MAX_VALUE;
                    }
                } else if (sign == -1) {
                    if (digit >= 8) {
                        return Integer.MIN_VALUE;
                    }
                }
            }


            if (num > Integer.MAX_VALUE / 10) {
                if (sign == 1) return Integer.MAX_VALUE;

                else if (sign == -1) return Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        return sign * num;
    }

    public static void main(String[] args) throws IOException {
        String ip = br.readLine();
        int result = myAtoi(ip);
        System.out.println(result);
    }
}
