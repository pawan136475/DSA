package coding_problems.geeksforgeeks.binary_search.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://www.geeksforgeeks.org/problems/swapping-pairs-make-sum-equal4142/1
public class SwappingPairsMakeSumEqual {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    private static boolean findSwapValues(int[] a, int[] b) {

        int sumA = Arrays.stream(a).sum();
        int sumB = Arrays.stream(b).sum();
        Set<Integer> set = new HashSet<>();
        if ((sumA - sumB) % 2 != 0) return false;


        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        int val = (sumA - sumB) / 2;

        for (int k = 0; k < b.length; k++) {
            if (set.contains(val + b[k])) return true;

        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        String[] a = br.readLine().split(" ");
        int[] ip = new int[a.length];

        String[] b = br.readLine().split(" ");
        int[] ip2 = new int[b.length];

        for (int i = 0; i < ip.length; i++)
            ip[i] = Integer.parseInt(a[i]);

        for (int i = 0; i < ip2.length; i++)
            ip2[i] = Integer.parseInt(b[i]);

        boolean result = findSwapValues(ip, ip2);

        System.out.println(result);

    }

}
