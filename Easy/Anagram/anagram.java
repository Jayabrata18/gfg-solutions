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
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        if (a.length() != b.length()) {
            return false;
        }
        Map<Character, Integer> strCount = new HashMap<>();
        
        for(char str: a.toCharArray()){
            strCount.put(str, strCount.getOrDefault(str, 0)+1);
        }
         for(char str: b.toCharArray()){
            if(!strCount.containsKey(str)){
                return false;
            }
            strCount.put(str, strCount.get(str)-1);
        }
           // Check if all counts in map are zero
        for (int count : strCount.values()) {
            if (count != 0) {
                // If any count is not zero, strings are not anagrams
                return false;
            }
        }
        
        // All counts are zero, strings are anagrams
        return true;
       
        
    }
}