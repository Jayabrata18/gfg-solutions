//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
         int n = arr.length;

        if (n <= 1) {
            return 0; // Already at the end or there is only one element
        }

        if (arr[0] == 0) {
            return -1; // Cannot move if the first element is 0
        }

        int maxReach = arr[0]; // Maximum reachable index
        int steps = arr[0];    // Number of steps at the current position
        int jumps = 1;         // Number of jumps

        for (int i = 1; i < n; i++) {
            if (i == n - 1) {
                return jumps; // Reached the end
            }

            maxReach = Math.max(maxReach, i + arr[i]);

            steps--;

            if (steps == 0) {
                jumps++;

                if (i >= maxReach) {
                    return -1; // Cannot move further
                }

                steps = maxReach - i;
            }
        }

        return -1; 
    }
}