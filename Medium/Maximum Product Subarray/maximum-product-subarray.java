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
        // code here\
          long ans=0;
        if(arr.length==1)
        return arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++){
                long temp=1;
                for (int k = i; k <= j; k++) {
                    temp*=arr[k];
                }
                if(temp>ans)
                ans=temp;
            }
        }
        return ans;
    }
}