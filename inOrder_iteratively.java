// https://practice.geeksforgeeks.org/problems/inorder-traversal-iterative/1
class Solution
{    ArrayList<Integer> ans = new ArrayList<>();
    // Return a list containing the inorder traversal of the given tree
    ArrayList<Integer> inOrder(Node root)
    {
        // Code
        Stack<Node> s =new Stack<Node>();
        Node curr = root;
        while(curr!=null || s.isEmpty()==false){
            while(curr != null){
                s.push(curr);
                curr=curr.left;
            }
            curr = s.pop();
            ans.add(curr.data);
            curr = curr.right;
        }
        return ans;
    }
    
    
}
