Binary Search Tree:
-------------------
Binary Search Tree, is a node-based binary tree data structure which has the following properties:
    1. The left subtree of a node contains only nodes with keys less than the node’s key.
    2. The right subtree of a node contains only nodes with keys greater than the node’s key.
    3. The left and right subtree each must also be a binary search tree.
    4. There must be no duplicate nodes.

Searching a key:
------------------
To search a given key in Bianry Search Tree, we first compare it with root, if the key is present at root, we return root.
If key is greater than root’s key, we recur for right subtree of root node. Otherwise we recur for left subtree.

Insertion of a key:
--------------------
A new key is always inserted at leaf.
We start searching a key from root till we hit a leaf node.
Once a leaf node is found, the new node is added as a child of the leaf node.

Time Complexity:
-----------------
The worst case time complexity of search and insert operations is O(h) where h is height of Binary Search Tree.
In worst case, we may have to travel from root to the deepest leaf node.
The height of a skewed tree may become n and the time complexity of search and insert operation may become O(n).