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
    int k = 2;
      Kdistance (root, k);
  }
//   	    10               
//        /   \
//      20     50
//    /   \   /  \
//  30    40 60   70  

  static void Kdistance (Node root, int k)
  {
    if (root == null)
      return;
    if (k == 0)
      System.out.print (root.key + " ");

    Kdistance (root.left, k - 1);
    Kdistance (root.right, k - 1);
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
