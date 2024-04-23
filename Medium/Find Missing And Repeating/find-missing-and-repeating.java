//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
    //     Arrays.sort(arr);
    //     long c=0;
    //     long sum=0;
    //     for(int i=1;i<n; i++){
    //         if(arr[i] == arr[i-1]){
    //             c=arr[i];
    //             break;
    //         }
    //     }
    //     for(int i=0;i<n; i++){
    //         sum+= arr[i];
    //     }
    //     long d=0;
    //     d =n*(n+1)/2 -sum +c;
    //     int ans[] = {(int)c,(int)d};
    //     return ans;
      int[] numCount = new int[n]; //store number count
        int[] res = new int[2];
        for(int i=0;i< n;i++) {
           numCount[arr[i]-1]++;
        }
        
        for(int i=0;i<n;i++) { 
            if(numCount[i] ==2) { //repeating number 
                res[0] = i+1;
            }
            if(numCount[i] == 0) { //missing number
                res[1] = i+1;
            }
        }
        return res;
    }
}