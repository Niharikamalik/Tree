*******************************************************************************/
import java.lang.*;
import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Node root = new Node (10);
      root.left = new Node (20);
      root.left.left = new Node (30);
      root.left.right = new Node (40);
      root.right = new Node (50);
      root.right.left = new Node (60);
      root.right.right = new Node (70);
    
      levelOrderTraversal(root);
  }
//   	    10               
//        /   \
//      20     50
//    /   \   /  \
//  30    40 60   70  

  static void levelOrderTraversal(Node root)
  {
    Queue<Node> q= new LinkedList<>();
    q.add(root);
    while(q.isEmpty()==false){
        Node curr = q.poll(); // poll() method in Java is used to retrieve or fetch and remove 
                        //  the first element of the Queue or the element present at thec
       System.out.print(curr.key+" ");
        if(curr.left!=null)
        q.add(curr.left);
        if(curr.right!=null)
        q.add(curr.right);
    }
  }
}

class Node
{
  Node root;
  int key;
  Node left;
  Node right;
    Node (int k)
  {
    key = k;
    right = left = null;
  }
}
