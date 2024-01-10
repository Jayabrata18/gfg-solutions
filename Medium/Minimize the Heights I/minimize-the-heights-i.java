//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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


//User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        // return (arr[n-1]-arr[0]-2*k);
         int ans = arr[n - 1] - arr[0]; // Initial difference

        // For each tower, either increase or decrease the height by K
        for (int i = 0; i < n - 1; i++) {
            int currentHeight = arr[i];
            int nextHeight = arr[i + 1];

            int increased = Math.max(arr[n - 1] - k, currentHeight + k);
            int decreased = Math.min(arr[0] + k, nextHeight - k);

            ans = Math.min(ans, increased - decreased);
        }

        return ans;
    }
}
