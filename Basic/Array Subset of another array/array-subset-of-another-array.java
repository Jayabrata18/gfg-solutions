//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            StringTokenizer stt = new StringTokenizer(br.readLine());
            
            long n = Long.parseLong(stt.nextToken());
            long m = Long.parseLong(stt.nextToken());
            long a1[] = new long[(int)(n)];
            long a2[] = new long[(int)(m)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a1[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < m; i++) {
                a2[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Compute obj = new Compute();
            System.out.println(obj.isSubset( a1, a2, n, m));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
//         HashSet<Long> set = new HashSet<>();
//         ArrayList<Long> array = new ArrayList<>();
        
//         for(int i=0; i<n; i++){
//             set.add(a1[i]);
//         }
//         for(int i=0; i<m; i++){
//             if(!set.add(a2[i])){
//                 array.add(a2[i]);
//             }
//         }
//         if(array.size() ==m){
//             return "Yes";
//         }else{
//             return "No";
//         }
        
        
//     }
// }
 HashMap<Long, Integer> countA1 = new HashMap<>();
        for (long num : a1) {
            countA1.put(num, countA1.getOrDefault(num, 0) + 1);
        }
        
        // Count occurrences of elements in array a2
        HashMap<Long, Integer> countA2 = new HashMap<>();
        for (long num : a2) {
            countA2.put(num, countA2.getOrDefault(num, 0) + 1);
        }
        
        // Check if all elements of a2 are present in a1 with at least the same frequency
        for (long num : countA2.keySet()) {
            if (!countA1.containsKey(num) || countA1.get(num) < countA2.get(num)) {
                return "No";
            }
        }
        return "Yes";
    }
}