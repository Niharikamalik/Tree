class Tree
{
    // Return a list containing the Preorder traversal of the given tree
    ArrayList<Integer> preOrder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
       // Code
        Stack<Node> s =new Stack<Node>();
        s.push(root);
        while(s.isEmpty()==false){
           Node curr = s.pop();
           ans.add(curr.data);
           if(root.right!=null) s.push(curr.data);
           if(root.left!=null)  s.push(curr.data);
        }
        return ans;
    }
    
