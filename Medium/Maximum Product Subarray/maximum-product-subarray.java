//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        if(arr == null || arr.length ==0){
            return 0;
        }
        long maxEnding= arr[0];
        long minEnding = arr[0];
        long result=arr[0];
        
        for(int i=1;i<n;i++){
            if(arr[i]<0){
                long temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }
            maxEnding= Math.max(arr[i], maxEnding*arr[i]);
            minEnding = Math.min(arr[i], minEnding*arr[i]);
            result= Math.max(result, maxEnding);
        }
        return result;
    }
}