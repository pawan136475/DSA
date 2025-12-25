package coding_problems.geeksforgeeks.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://www.geeksforgeeks.org/problems/minimum-swaps-required-to-bring-all-elements-less-than-or-equal-to-k-together4847/1
public class MinimumSwapsAndKTogether {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int minSwap(int[] arr, int k) {
        // Complete the function
        int count = 0, curr_wind = 0, ans = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] <= k) count++;


        for (int j = 0; j < count; j++)
            if (arr[j] <= k) curr_wind++;

        ans = count - curr_wind;
        for (int l = count; l < arr.length; l++) {
            if (arr[l] <= k) {
                curr_wind++;
            }
            if (arr[l - count] <= k) {
                curr_wind--;
            }
            ans = Math.min(ans, count - curr_wind);


        }
        return ans;
    }

    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);

        int result = minSwap(ip, k);
        System.out.println(result);
    }
}
