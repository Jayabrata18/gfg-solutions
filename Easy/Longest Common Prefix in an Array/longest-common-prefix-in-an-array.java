//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        // if(n==0){
        //     return -1;
        // }
        String prefix =arr[0];
        for(int i=1;i<n;i++){
            String currentString=arr[i];
            int j=0;
        while (j < prefix.length() && j < currentString.length() && prefix.charAt(j) == currentString.charAt(j)) {
                j++;
            }
        prefix=prefix.substring(0,j);
        if(prefix.isEmpty()){
            // break;
              return "-1";
         
        }
        }
        return prefix;
    }
}