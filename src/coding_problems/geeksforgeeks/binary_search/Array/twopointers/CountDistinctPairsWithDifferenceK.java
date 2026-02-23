package coding_problems.geeksforgeeks.binary_search.Array.twopointers;

//https://www.geeksforgeeks.org/problems/count-distinct-pairs-with-difference-k1233/1

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.geeksforgeeks.org/problems/count-distinct-pairs-with-difference-k1233/1
public class CountDistinctPairsWithDifferenceK {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int TotalPairs(int[] nums, int k) {
        // Code here

        int diff = 0, count = 1, no1 = 0, no2 = 0, result = 0;

        if (nums.length < 2) return 0;

        Arrays.sort(nums);
        if (k == 0) {

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) count++;
                else {
                    if (count > 1) result++;
                    count = 1;
                }
            }
            if (count > 1) result++;
            return result;
        }
        if (k > 0) {
            int i = 0, j = 1;
            while (j < nums.length) {
                if (i == j) {
                    j++;
                    continue;
                }
                diff = nums[j] - nums[i];

                if (diff < k) j++;
                else if (diff > k) i++;
                else {
                    result++;
                    no1 = nums[i];
                    no2 = nums[j];
                    while (i < nums.length && nums[i] == no1)        //skip duplicates of nums[i]
                        i++;

                    while (j < nums.length && nums[j] == no2)         //skip duplicates of nums[j]
                        j++;
                }
            }

        }
        return result;
    }


    public static void main(String[] args) throws IOException {

        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < input.length; i++)
            ip[i] = Integer.parseInt(input[i]);

        int result = TotalPairs(ip, k);
        System.out.println(result);
    }


}
