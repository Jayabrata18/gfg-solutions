//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    int longSubarrWthSumDivByK(int a[], int n, int k)
    {
        // Complete the function
          // Create a hash map to store the remainder and its index
        HashMap<Integer, Integer> remainderMap = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            sum += a[i];

            // Calculate the remainder when divided by K
            int remainder = (sum % k + k) % k;

            // Check if the remainder is 0, meaning the subarray from the beginning has a sum divisible by K
            if (remainder == 0) {
                maxLength = i + 1;
            } else {
                // Check if the remainder is already in the map
                if (remainderMap.containsKey(remainder)) {
                    // If yes, update the maxLength
                    maxLength = Math.max(maxLength, i - remainderMap.get(remainder));
                } else {
                    // If not, add the remainder to the map with its index
                    remainderMap.put(remainder, i);
                }
            }
        }

        return maxLength;
       
    }
 
}


//{ Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String[] element = line1.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		   
		    int res = obj.longSubarrWthSumDivByK(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		    
		    
		}
	}
}



// } Driver Code Ends