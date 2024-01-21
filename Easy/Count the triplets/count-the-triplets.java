//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            int n = Integer.parseInt(read.readLine());
            String input[] = read.readLine().split(" ");
            
            int arr[] = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = Integer.parseInt(input[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.countTriplet(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int countTriplet(int arr[], int n) {
        // code here
        int count=0;
        // for (int i = 0; i < n - 2; i++) {
        //     for (int j = i + 1; j < n - 1; j++) {
        //         for (int k = j + 1; k < n; k++) {
        //             // Check if the sum of two elements equals the third element
        //             if (arr[i] + arr[j] == arr[k] || arr[j] + arr[k] == arr[i] || arr[k] + arr[i] == arr[j]) {
        //                 count++;
        //             }
        //         }
        //     }
        // }
        
        Arrays.sort(arr);
        for(int i=n-1;i>=0;i--){
            int j=0;
            int k=i-1;
            while(j<k){
                if(arr[j]+arr[k]==arr[i]){
                    count++;
                    j++;
                    k--;
                }else if (arr[j] +arr[k]<arr[i]){
                    j++;
                    
                }else{
                    k--;
                }
            }
        }

        return count;
    }
}