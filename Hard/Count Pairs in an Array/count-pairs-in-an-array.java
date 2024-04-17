//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)n];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();  
            System.out.println(obj.countPairs(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


    class Solution {  
     static int countPairs(int arr[], int n) {
        // Create an ArrayList to store the product of each element with its index
        List<Integer> v = new ArrayList<>();
        
        // Populate the ArrayList with the product of each element with its index
        for (int i = 0; i < n; i++) {
            v.add(i * arr[i]);
        }
        
        // Create a copy of the ArrayList to perform sorting without modifying the original list
        List<Integer> temp = new ArrayList<>(v);
        // Sort the copied list
        Collections.sort(temp);
        
        // Initialize a variable to store the count of pairs
        int ans = 0;
        
        // Iterate over the elements of the original list in reverse order
        for (int i = n - 1; i >= 0; i--) {
            // Find the index of the current element's product in the sorted list
            int x = Collections.binarySearch(temp, v.get(i));
            if (x >= 0) {
                // If the product is found, find the index of the next different value in the sorted list
                while (x < temp.size() && temp.get(x).equals(v.get(i))) {
                    x++;
                }
            } else {
                // If the product is not found, calculate the index to insert it in the sorted list
                x = -x - 1;
            }
            // Find the index of the current element's product in the sorted list again
            int y = Collections.binarySearch(temp, v.get(i));
            // Increment the count of pairs by the number of elements after the next different value
            ans += (temp.size() - x);
            // Remove the current element's product from the sorted list
            temp.remove(y);
        }
        // Return the total count of pairs
        return ans;
        // Your code goes here
    }
}

    
