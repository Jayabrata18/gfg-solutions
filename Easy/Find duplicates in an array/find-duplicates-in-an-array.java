//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
       ArrayList<Integer> duplicateList = new ArrayList<>();
        HashSet<Integer> seenSet = new HashSet<>();
        HashSet<Integer> duplicateSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int element = arr[i];

            if (!seenSet.add(element)) {
                duplicateSet.add(element);
            }
        }

        duplicateList.addAll(duplicateSet);

        if (duplicateList.isEmpty()) {
            duplicateList.add(-1);
        } else {
            duplicateList.sort(null);
        }

        return duplicateList;
    }
}
