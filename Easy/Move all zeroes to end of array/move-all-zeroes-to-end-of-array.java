//{ Driver Code Starts
//Initial Template for Java



import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().pushZerosToEnd(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends

//User function Template for Java
class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        //   ArrayList<Integer> ans = new ArrayList<>(n);
        int[] ans = new int[n];
           int index=0;
           for(int i=0;i<n;i++){
               if(arr[i]!=0){
                  ans[index]=arr[i];
                  index++;
               }
           }
           
            for (int i = ans.length; i < n; i++) {
                ans[i]=0;

            }
            for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
        
    }
}