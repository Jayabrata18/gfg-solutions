//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
       int currentSum=0;
       int maxlength=0;
       //map function to store sum and corresponding index
       HashMap<Integer, Integer> index = new HashMap<>();
       
       for(int i=0; i<n; i++){
           currentSum += arr[i];
       
       if(currentSum==0){
           maxlength = i+1;
       }else{
           if(index.containsKey(currentSum)){
               int subArrayLength = i - index.get(currentSum);
               maxlength = Math.max(subArrayLength, maxlength);
           }else{
               index.put(currentSum, i);
           }
       }
       }
       return maxlength;

    }
}