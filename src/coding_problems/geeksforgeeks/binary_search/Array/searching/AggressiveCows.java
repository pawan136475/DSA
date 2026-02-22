package coding_problems.geeksforgeeks.binary_search.Array.searching;

//https://www.geeksforgeeks.org/problems/aggressive-cows/0

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AggressiveCows {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int low = 1, high = stalls[stalls.length - 1] - stalls[0], mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (canWePlace(stalls, mid, k) == true) low = mid + 1;

            else high = mid - 1;
        }
        return high;
    }

    public static boolean canWePlace(int[] arr, int dist, int cows) {

        int last = arr[0];
        int countCows = 1;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] - last >= dist) {
                countCows++;
                last = arr[i];
            }
            if (countCows >= cows) return true;

        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int[] ip = new int[input.length];
        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(input[i]);

        int k = Integer.parseInt(br.readLine());
        int result = aggressiveCows(ip, k);
        System.out.println(result);
    }


}
