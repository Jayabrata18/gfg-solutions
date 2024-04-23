//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int N)
    {
        // your code here
       HashMap<Integer, Integer> find = new HashMap<>();
       
       for(int num : a){
           find.put(num, find.getOrDefault(num,0)+1);
       }
        for (int num : find.keySet()) {
            if (find.get(num) > N / 2) {
                return num;
            }
        }
        return -1;
    }
}