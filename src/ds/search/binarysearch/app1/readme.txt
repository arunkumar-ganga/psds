Binary Search:
--------------
We basically ignore half of the elements just after one comparison.
1) Compare x with the middle element.
2) If x matches with middle element, we return the mid index.
3) Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
4) Else (x is smaller) recur for the left half.

Note:
------
1) Input should be sorted array.


Time Complexity:
-----------------
The time complexity of Binary Search can be written as
T(n) = T(n/2) + c
The above recurrence can be solved either using Recurrence T ree method or Master method. It falls in case II of Master Method and solution of the recurrence is \Theta(Logn).

Auxiliary Space:
-----------------
O(1) in case of iterative implementation. In case of recursive implementation, O(Logn) recursion call stack space.

Algorithmic Paradigm:
---------------------
Divide and Conquer