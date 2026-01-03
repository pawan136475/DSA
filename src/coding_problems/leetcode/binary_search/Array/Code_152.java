package coding_problems.leetcode.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Code_152 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int maxProduct(int[] nums) {

        int leftProduct = 1;
        int rightProduct = 1;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct *= nums[i];
            rightProduct *= nums[nums.length - 1 - i];

            ans = Math.max(ans, Math.max(leftProduct, rightProduct));
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];

        for (int k = 0; k < ip.length; k++)
            ip[k] = Integer.parseInt(input[k]);

        int result = maxProduct(ip);
        System.out.println(result);
    }

}
