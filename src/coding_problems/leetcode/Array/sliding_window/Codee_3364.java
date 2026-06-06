package coding_problems.leetcode.Array.sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/minimum-positive-sum-subarray/description/?envType=problem-list-v2&envId=sliding-window
public class Codee_3364 {


    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {

        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (int k = l; k <= r; k++) {
            result = cal(nums, k);
            if (result > 0) {
                list.add(result);
            }
        }
        int min = list.stream().filter(n -> n > 0)   // exclude 0 and negative
                .min(Integer::compareTo).orElse(-1);
        return min;
    }

    public static int cal(List<Integer> nums, int k) {
        int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
        while (j < nums.size()) {
            sum = sum + nums.get(j);

            if (j - i + 1 < k) j++;

            else if (j - i + 1 == k) {

                if (sum > 0) min = Math.min(min, sum);

                sum = sum - nums.get(i);
                i++;
                j++;
            }
        }
        return min == 0 || min == Integer.MAX_VALUE ? -1 : min;
    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++)
            list.add(Integer.parseInt(input[i]));
        int l = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());


        int result = minimumSumSubarray(list, l, r);
        System.out.println(result);
    }
}
