Objective : Write an algorithm to find an Element in 2 dimensional array where rows and columns are sorted respectively.

Input: A two dimen­sional sorted array, arrA[][].

01 02 03 04 05 06
07 08 09 10 11 12
13 14 15 16 17 18

Approach1:
===========
Start from the right top corner(06), say ele(09) is the matrix element;
If ele>number -> move left
If ele<number -> move down
If you cant move further to find the num­ber , return false

Time complexity : O(m+n)


Approach2:
===========




