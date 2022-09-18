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
    
      System.out.print("Size of binary tree : "+ getSize(root));
  }
//   	    10               
//        /   \
//      20     50
//    /   \   /  \
//  30    40 60   70  

  static int getSize(Node root)
  {
    if(root==null)return 0;
    else{
        return 1+getSize(root.left)+getSize(root.right);
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
