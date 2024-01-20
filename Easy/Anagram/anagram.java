//{ Driver Code Starts
import java.util.*;
import java.util.stream.*; 
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}
// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or falset.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        if(a.length() != b.length()){
            return false;
        }
        //increment for string a
        Map<Character,Integer> count = new HashMap<>();
        for(char c: a.toCharArray()){
            count.put(c, count.getOrDefault(c,0)+1);
        }
        //decrment for  string b
        for(char c: b.toCharArray()){
            if(!count.containsKey(c) || count.get(c)==0){
                return false;
            }
             count.put(c, count.get(c) - 1);
        }
         // Check if all character frequencies are zero
        // for (int frequency : count.values()) {
        //     if (frequency != 0) {
        //         return false;
        //     }
        // }
        return true;
    }
}