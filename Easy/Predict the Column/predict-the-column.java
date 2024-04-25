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
            int N = Integer.parseInt(read.readLine());
            int arr[][] = new int[N][N];
            
            for(int i = 0; i < N; i++)
            {
                int k = 0;
                String str[] = read.readLine().trim().split("\\s+");
                for(int j = 0; j < N; j++){
                  arr[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            
            System.out.println(new Solution().columnWithMaxZeros(arr,N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        int maxZeros = 0;
        int maxZerosColumn = -1;

        for (int j = 0; j < N; j++) {
            int zerosInColumn = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i][j] == 0) {
                    zerosInColumn++;
                }
            }
            if (zerosInColumn > maxZeros) {
                maxZeros = zerosInColumn;
                maxZerosColumn = j;
            }
        }

        return maxZeros > 0 ? maxZerosColumn : -1;
    }
}