//{ Driver Code Starts
//Initial Template for Java

import java.util.*;

public class GFG
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) 
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();
            
            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];
            
            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }
            
            Solution sol = new Solution();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else 
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }    
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        // HashSet<Integer> set = new HashSet<>();
        // HashSet<Integer> set2 = new HashSet<>();
        // for(int i=0; i<n1; i++){
        //     if(!set.add(A[i])){
        //         set2.add(A[i]);
                
        //     }
        // }
        // for(int i=0; i<n2; i++){
        //     if(!set.add(B[i])){
        //         set2.add(B[i]);
                
        //     }
        // }
        // for(int i=0; i<n3; i++){
        //     if(!set.add(C[i])){
        //         set2.add(C[i]);
                
        //     }
        // }
        //  ArrayList<Integer> arrayList = new ArrayList<>(set2);
        //  Collections.sort(arrayList);

        // return(arrayList);
        Set<Integer> uniqueElementsA = new HashSet<>();
        Set<Integer> uniqueElementsB = new HashSet<>();
        Set<Integer> uniqueElementsC = new HashSet<>();
        Set<Integer> commonElements = new TreeSet<>();

        for (int element : A) {
            uniqueElementsA.add(element);
        }

        for (int element : B) {
            uniqueElementsB.add(element);
        }

        for (int element : C) {
            uniqueElementsC.add(element);
        }

        // Find common elements by intersecting sets
        commonElements.addAll(uniqueElementsA);
        commonElements.retainAll(uniqueElementsB);
        commonElements.retainAll(uniqueElementsC);

        return new ArrayList<>(commonElements);
    }
}