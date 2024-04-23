//{ Driver Code Starts
import java.util.*;
import java.io.*;


// } Driver Code Ends

class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int n)
    {
        // Your code here
//         Arrays.sort(arr);
//         for(int i=0; i<n-1; i++){
//             if(arr[i]>0){
//                 if( arr[i] + 1 != arr[i + 1]) {
//                     return (arr[i]+1);
//                 } 
//             }
//         }
// return arr[n - 1] <= 0 ? 1 : arr[n - 1] + 1;
 HashSet<Integer> set = new HashSet<>();
        
        // Add all positive integers to the set
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }
        
        // Check for the smallest positive missing number
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        
        // If no positive missing number found, return n + 1
        return n + 1;
}
}


//{ Driver Code Starts.

class Main
{   
    public static void main (String[] args) throws IOException
    {

		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		
        //taking testcases
		int t=Integer.parseInt(in.readLine().trim());
		while(t-->0){
		    
		    //input number n
			int n=Integer.parseInt(in.readLine().trim());
			int[] arr=new int[n];
			String s[]=in.readLine().trim().split(" ");
			
			//adding elements to the array
			for(int i=0;i<n;i++)
				arr[i]=Integer.parseInt(s[i]);
				
			Solution obj = new Solution();
			
			//calling missingNumber()
			int missing = obj.missingNumber(arr,n);
			out.println(missing);
		}
		out.close();
    }
}


// } Driver Code Ends