package coding_problems.leetcode.Array.sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
public class Code_1423 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int maxScore(int[] cardPoints, int k) {
        int leftSum = 0, rightSum = 0, maxSum = 0;
        int rightIndex = cardPoints.length - 1;
        for (int i = 0; i < k; i++) {
            leftSum = leftSum + cardPoints[i];
        }
        maxSum = leftSum;
        for (int j = k - 1; j >= 0; j--) {
            rightSum = rightSum + cardPoints[rightIndex];
            leftSum = leftSum - cardPoints[j];
            rightIndex--;
            maxSum = Math.max(maxSum, leftSum + rightSum);
        }
        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        String ip = br.readLine();
        String[] input = ip.split(" ");
        int[] arr = new int[input.length];
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < input.length; i++)
            arr[i] = Integer.parseInt(input[i]);

        System.out.println(maxScore(arr, k));
    }
}
