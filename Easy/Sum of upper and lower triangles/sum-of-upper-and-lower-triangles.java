//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            
            int matrix[][] = new int[n][n];
            for(int i = 0; i < n; i++)
                for(int j = 0; j < n; j++)
                    matrix[i][j] = sc.nextInt();

            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.sumTriangles(matrix,n);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        // int[] ans = new int[2];
        ArrayList<Integer> ans = new ArrayList<>();
        int sum1=0;
        int sum2=0;
        int sum3=0;
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i>j){
                    sum1+=matrix[i][j];
                }else if(i<j){
                    sum2+=matrix[i][j];
                }else{
                    sum3+=matrix[i][j];
                }
            }
        }
       ans.add(sum2+sum3);
              ans.add(sum1+sum3);

        return ans;
    }
}