class Tree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {    int leftD=0,rightD=0;
        // add your code here
        if(root == null || (root.left==null&&root.right==null))
        return 1;
        else{
            if(root.left!=null)
            leftD=root.left.data;
            
            if(root.right!=null)
            rightD = root.right.data;
            
            if(root.data == leftD+rightD && (isSumProperty(root.left)!=0)&& isSumProperty(root.right)!=0)
            return 1;
            
            else return 0;
        }
        
    }
}
