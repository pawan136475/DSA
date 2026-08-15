package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/missing-number/
public class Code_268 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int missingNumber(int[] nums) {

        int xor1 = 0, xor2 = 0;
        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ (i);
            xor2 = xor2 ^ nums[i];

        }
        xor1 = xor1 ^ nums.length;
        return xor1 ^ xor2;
    }

    public static void main(String[] args) throws IOException {
        String[] ip = br.readLine().split(" ");

        int[] arr = new int[ip.length];

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(ip[i]);

        System.out.println(missingNumber(arr));
    }
}
