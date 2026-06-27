package coding_problems.geeksforgeeks.binary_search.Array.sliding_window;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
public class FirstNegativeInEveryWindowOfSizeK {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static List<Integer> firstNegInt(int arr[], int k) {
        int i = 0, j = 0;
        List<Integer> input = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        while (j < arr.length) {
            if (arr[j] < 0) input.add(arr[j]);

            if (j - i + 1 < k) j++;
            else if (j - i + 1 == k) {
                if (input.size() == 0) result.add(0);
                else result.add(input.get(0));

                if (!input.isEmpty() && arr[i] == input.get(0)) input.remove(0);

                i++;
                j++;
            }

        }
        return result;
    }

    public static void main(String[] args) throws IOException {

        String[] ip = br.readLine().split(" ");
        int input[] = new int[ip.length];
        for (int i = 0; i < input.length; i++)
            input[i] = Integer.parseInt(ip[i]);

        int k = Integer.parseInt(br.readLine());

        List<Integer> op = firstNegInt(input, k);
        op.forEach(System.out::println);
    }


}
