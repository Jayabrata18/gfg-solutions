//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);

        int result = arr[n - 1] - arr[0]; // Initial difference

        // For each tower except the last one
        for (int i = 0; i < n - 1; i++) {
            int currentHeight = arr[i];
            int nextHeight = arr[i + 1];

            // Calculate the new heights after increase and decrease operations
            int increased = currentHeight + k;
            int decreased = nextHeight - k;

            // Ensure the new heights are non-negative
            if (decreased >= 0) {
                // Update the result with the minimum difference
                result = Math.min(result, Math.max(increased, arr[n - 1] - k) - Math.min(decreased, arr[0] + k));
            }
        }

        return result;
    }
}
