<h2><a href="https://www.geeksforgeeks.org/problems/find-the-closest-number5513/1?page=1&category=Matrix,Binary%20Search&difficulty=Easy&sortBy=submissions">Find the closest number</a></h2><h3>Difficulty Level : Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array arr of positive <strong>sorted</strong> integers. The task is to find the closest value to the given number <strong>k</strong> in array. Array may contain duplicate values.</span></p>
<p><span style="font-size: 18px;"><strong>Note:</strong> If the difference is same for two values print the value which is greater than the given number.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input :</strong> <br>n = 4<br>k = 4<br>arr[] = {1, 3, 6, 7}
<strong>Output :</strong> 3
<strong>Explanation:
</strong>We have an array [1, 3, 6, 7] and target is 4.If we look at the absolute difference of target with every element of an array we will get [ |1-4|, |3-4|, |6-4|, |7-4| ]. So, the closest number is <strong>3.</strong>
</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input :<br></strong>n = 7<br>k = 4<strong><br></strong>arr[] = {1, 2, 3, 5, 6, 8, 9}
<strong>Output :</strong> 5<br>Explanation: as we can see the absolute difference of 4 is same from 3 and 5 so we have to return greater number, which is 5.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>This is a function problem. The input is already taken care of by the driver code. You only need to complete the function <strong>findClosest()</strong> that takes integer <strong>n </strong>,integer <strong>k</strong>&nbsp; and an sorted array <strong>arr</strong> of size n as input parameters and return the closest number of the target in an array. The driver code takes care of the printing.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(log(n)).<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>6</sup><br>1 ≤ k ≤ 10<sup>9</sup><br>1 ≤ arr[i] ≤ 10<sup>9</sup></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Algorithms</code>&nbsp;<code>Arrays</code>&nbsp;<code>Binary Search</code>&nbsp;<code>Data Structures</code>&nbsp;