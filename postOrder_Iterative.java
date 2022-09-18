
// https://practice.geeksforgeeks.org/problems/postorder-traversal-iterative/1
class Tree {
    ArrayList<Integer> postOrder(Node node) {
        // code here
     
      ArrayList<Integer> list = new ArrayList<Integer>();
 
    // An iterative function to do postorder traversal
    // of a given binary tree
    Stack<Node> S = new Stack<Node>();
 
        // Check for empty tree
        if (node == null)
            return list;
        S.push(node);
        Node prev = null;
        while (!S.isEmpty()) {
            Node current = S.peek();
 
            /* go down the tree in search of a leaf an if so
            process it and pop stack otherwise move down */
            if (prev == null || prev.left == current || prev.right == current) {
                if (current.left != null)
                    S.push(current.left);
                else if (current.right != null)
                    S.push(current.right);
                else {
                    S.pop();
                    list.add(current.data);
                }
 
                /* go up the tree from left node, if the
                child is right push it onto stack otherwise
                process parent and pop stack */
            }
            else if (current.left == prev) {
                if (current.right != null)
                    S.push(current.right);
                else {
                    S.pop();
                    list.add(current.data);
                }
 
                /* go up the tree from right node and after
                coming back from right node process parent
                and pop stack */
            }
            else if (current.right == prev) {
                S.pop();
                list.add(current.data);
            }
 
            prev = current;
        }
 
        return list;
    
    }
}
