// https://practice.geeksforgeeks.org/problems/check-for-balanced-tree/1?ref=gcse

class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	// Your code here
	int lh,rh ;
	if(root == null)return true;
	 lh= height(root.left);
	 rh = height(root.right);
	 
	 if(1>=Math.abs(lh-rh)&&isBalanced(root.left)&&isBalanced(root.right))
	 return true;
	 
	 return false;
	
    }
    int height(Node root){
        if(root == null)return 0;
        else 
        return Math.max(height(root.left),height(root.right)) +1;
    }    
}

