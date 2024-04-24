//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
          long[] temp = new long[(int)N];
        System.arraycopy(arr, 0, temp, 0, (int)N);

        // Call the mergeSort function to count inversions
        return mergeSort(arr, temp, 0, (int)N - 1);
    }

    // Function to recursively split and merge the array
    static long mergeSort(long[] arr, long[] temp, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = (left + right) / 2;

            // Count inversions in left and right halves
            count += mergeSort(arr, temp, left, mid);
            count += mergeSort(arr, temp, mid + 1, right);

            // Merge the sorted halves and count inversions
            count += merge(arr, temp, left, mid, right);
        }
        return count;
    }

    // Function to merge two sorted halves and count inversions
    static long merge(long[] arr, long[] temp, int left, int mid, int right) {
        int i = left, j = mid + 1, k = left;
        long count = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                // Inversion found
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        // Copy the remaining elements of left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy the remaining elements of right subarray
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        // Copy the merged elements back to original array
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }
}