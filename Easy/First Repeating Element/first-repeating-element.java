//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total count of elements
            int n = sc.nextInt();

            // creating a new array of size n
            int arr[] = new int[n];

            // inserting elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling firstRepeated method
            // and printing the result
            System.out.println(ob.firstRepeated(arr, n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();

//         int minIndex=Integer.MAX_VALUE; 
//         for(int i=0;i<n;i++){
//             if (set.contains(i)) {
//                 minIndex=Math.min(minIndex,i);
            
//             return minIndex+1;
            
//         }else{
//             set.add(arr[i]);
//         }  
//         }
//         return -1;
//     }
// }
 int minIndex = Integer.MAX_VALUE; // Initialize minIndex with maximum value
        
        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                minIndex = i; // Update minIndex with the current index
            } else {
                set.add(arr[i]); // Add the element to the set
            }
        }
        
        if (minIndex != Integer.MAX_VALUE) {
            return minIndex + 1; // Return the index (adjusted for 1-based indexing)
        } else {
            return -1; // If no repeated element found, return -1
        }
    }
}
