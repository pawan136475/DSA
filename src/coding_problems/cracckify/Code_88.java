package coding_problems.cracckify;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/merge-sorted-array/description/
public class Code_88 {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }

    public static void main(String[] args) throws IOException {

        String[] one = br.readLine().split(" ");
        String[] two = br.readLine().split(" ");
        int[] nums1 = new int[one.length];
        int[] nums2 = new int[two.length];
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < nums1.length; i++)
            nums1[i] = Integer.parseInt(one[i]);

        for (int j = 0; j < nums1.length; j++)
            nums1[j] = Integer.parseInt(two[j]);

        merge(nums1, m, nums2, n);
    }
}
