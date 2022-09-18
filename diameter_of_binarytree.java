class Solution {
    // Function to return the diameter of a Binary Tree.\
    int max=0;
    int diameter(Node root) {
        // Your code here
        height(root);
        return max+1;
    }
    int height(Node root ){
        if(root == null)return 0;
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        max = Math.max(max,lh+rh);
        
        return Math.max(lh,rh) + 1;
    }
}
