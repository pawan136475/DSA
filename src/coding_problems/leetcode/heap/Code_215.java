package coding_problems.leetcode.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class Code_215 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            maxHeap.add(nums[i]);
            if (maxHeap.size() > k) maxHeap.poll();

        }
        return maxHeap.peek();
    }

    public static void main(String[] args) throws IOException {

        String[] ip = br.readLine().split(" ");

        int[] input = new int[ip.length];
        int k = Integer.parseInt(br.readLine());
        for (int i = 0; i < input.length; i++)
            input[i] = Integer.parseInt(ip[i]);

        int result = findKthLargest(input, k);
        System.out.println(result);


    }
}
